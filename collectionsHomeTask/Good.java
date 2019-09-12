package collectionsHomeTask;

/*
5. Создать экземпляр класса HashMap, разместить в нём следующую информацию: в качестве ключа  - категория товара
в каталоге (catalog.onliner.by) в качестве значения - количество товаров в данной категории. Сортировать коллекцию
по количеству товаров в каждой категории, найти категорию в которой содержится максимальное количество товаров,
удалить все категории в которых нет ни одного товара (предусмотреть такие категории при заполнении коллекции)
 */

import java.util.*;


class Good {
    public static void main(String[] args) {
        Map<String, Integer> goods = new HashMap<>();
        goods.put("Электроника", 20000);
        goods.put("Компьютеры и сети", 44567);
        goods.put("Бытовая техника", 56000);
        goods.put("Стройка и ремонт", 5674);
        goods.put("Дом и сад", 5674);
        goods.put("Авто и мото", 15023);
        goods.put("Красота и спорт", 12345);
        goods.put("Детям и мамам", 0);
        goods.put("Работа и офис", 0);

        TreeMap<String, Integer> sortedGoods = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Integer i = goods.get(o1);
                Integer j = goods.get(o2);
                Integer l = i.compareTo(j);
                if (l == 0)
                    return o1.compareTo(o2);
                else
                    return l;
            }
        });

        sortedGoods.putAll(goods);

        System.out.println("Сортированный список (по к-ву товаров к категории):");

        for (Map.Entry entry : sortedGoods.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue());
        }

        System.out.println();
        System.out.println("Категории, в которых содержится наибольшее к-во товаров:");

        ArrayList<String> largestCategory = new ArrayList<>();

        for (Map.Entry entry : sortedGoods.entrySet()) {
            if (entry.getValue().equals(Collections.max(sortedGoods.values()))) {
                largestCategory.add((String) entry.getKey());
            }
        }

        for (int i = 0; i < largestCategory.size(); i++) {
            System.out.println("- " + largestCategory.get(i) + " (" + sortedGoods.get(largestCategory.get(i)) + ")");
        }

        System.out.println();
        System.out.println("Список после удаления категорий без товаров:");

        ArrayList<String> emptyCategory = new ArrayList<>();

        for (Map.Entry entry : sortedGoods.entrySet()) {
            if (entry.getValue().equals(0)) {
                emptyCategory.add((String) entry.getKey());
            }
        }

        for (int i = 0; i < emptyCategory.size(); i++) {
            sortedGoods.remove(emptyCategory.get(i));
        }

        for (Map.Entry entry : sortedGoods.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue());
        }
    }
}

