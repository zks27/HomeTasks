package collectionsHomeTask;

/*
2. Создать экземпляр класса HashSet, добавить в него 25 ссылок на экземпляры класса Book,
предусмотреть не менее 6 одинаковых по значению книг. Вывести на экран информацию о книгах
(содержащихся в коллекции HashSet), название которых начинается с гласной буквы.

3. Отсортировать коллекцию из задания 2 по фамилии, затем по имени, по отчеству (эти поля надо добавить
в класс Book для автора книги).
 */

import java.util.*;


public class BookSecond {
    private String authorSecondName;
    private String authorName;
    private String authorMiddledName;
    private String bookName;


    BookSecond() {

    }

    private BookSecond(String authorName, String bookName) {
        this.authorName = authorName;
        this.bookName = bookName;
    }

    private BookSecond(String authorSecondName, String authorName, String authorMiddledName, String bookName) {
        this.authorSecondName = authorSecondName;
        this.authorName = authorName;
        this.authorMiddledName = authorMiddledName;
        this.bookName = bookName;
    }

    private BookSecond(String authorSecondName, String authorName, String bookName) {
        this.authorSecondName = authorSecondName;
        this.authorName = authorName;
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorSecondName() {
        return authorSecondName;
    }

    public void setAuthorSecondName(String authorSecondName) {
        this.authorSecondName = authorSecondName;
    }

    public String getAuthorMiddledName() {
        return authorMiddledName;
    }

    public void setAuthorMiddledName(String authorMiddledName) {
        this.authorMiddledName = authorMiddledName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookSecond that = (BookSecond) o;
        return Objects.equals(authorName, that.authorName) &&
                Objects.equals(bookName, that.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, bookName);
    }

    @Override
    public String toString() {
        String s;
        if (authorMiddledName == null & authorSecondName != null) {
            s = "Автор: " + authorName.charAt(0) + ". " + authorSecondName +
                    ", Название: " + bookName;
        } else {
            if (authorMiddledName == null & authorSecondName == null) {
                s = "Автор: " + authorName +
                        ", Название: " + bookName;
            } else {
                s = "Автор: " + authorName.charAt(0) + ". " + authorMiddledName.charAt(0) + ". " + authorSecondName +
                        ", Название: " + bookName;


            }

        }

        return s;
    }

    public static void main(String[] args) {
        HashSet<BookSecond> books = new HashSet<>();
        BookSecond book1 = new BookSecond("Лавкрафт", "Говард", "Филлипс", "Хребты Безумия");
        BookSecond book2 = new BookSecond("Райс", "Энн", "Говард", "Мумия");
        BookSecond book3 = new BookSecond("Шолохов", "Михаил", "Александрович", "Поднятая Целина");
        BookSecond book4 = new BookSecond("Скотт", "Вальтер", "Айвенго");
        BookSecond book5 = new BookSecond("Кинг", "Стивен", "Эдвин", "Оно");
        BookSecond book6 = new BookSecond("Кинг", "Стивен", "Эдвин", "Сияние");
        BookSecond book7 = new BookSecond("Кинг", "Стивен", "Эдвин", "Оно");
        BookSecond book8 = new BookSecond("Мамлеев", "Юрий", "Витальевич", "Шатуны");
        BookSecond book9 = new BookSecond("Кинг", "Стивен", "Эдвин", "Оно");
        BookSecond book10 = new BookSecond("Кинг", "Стивен", "Эдвин", "Оно");
        BookSecond book11 = new BookSecond("Сергеев", "Дмитрий", "Гаврилович", "Конный Двор");
        BookSecond book12 = new BookSecond("Паланик", "Чарльз", "Майкл", "Призраки");
        BookSecond book13 = new BookSecond("Кинг", "Стивен", "Эдвин", "Оно");
        BookSecond book14 = new BookSecond("Пушкин", "Александр", "Сергеевич", "Капитанская Дочка");
        BookSecond book15 = new BookSecond("Кинг", "Стивен", "Эдвин", "Оно");
        BookSecond book16 = new BookSecond("Кинг", "Стивен", "Эдвин", "Оно");
        BookSecond book17 = new BookSecond("Андреев", "Леонид", "Николаевич", "Красный Смех");
        BookSecond book18 = new BookSecond("Достоевский", "Федор", "Михайлович", "Идиот");
        BookSecond book19 = new BookSecond("Соловьев", "Леонид", "Васильевич", "Ходжа Насреддин");
        BookSecond book20 = new BookSecond("Дрюон", "Морис", "Самюэль", "Яд и Корона");
        BookSecond book21 = new BookSecond("Гомер", "Иллиада");
        BookSecond book22 = new BookSecond("Шекспир", "Уильям", "Отелло");
        BookSecond book23 = new BookSecond("Войнич", "Этель", "Лилиан", "Овод");
        BookSecond book24 = new BookSecond("Лавкрафт", "Говард", "Филлипс", "Зов Ктулху");
        BookSecond book25 = new BookSecond("Хэмингуэй", "Эрнест", "Миллер", "И Восходит Солнце ");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);
        books.add(book11);
        books.add(book12);
        books.add(book13);
        books.add(book14);
        books.add(book15);
        books.add(book16);
        books.add(book17);
        books.add(book18);
        books.add(book19);
        books.add(book20);
        books.add(book21);
        books.add(book22);
        books.add(book23);
        books.add(book24);
        books.add(book25);

        Iterator<BookSecond> i = books.iterator();
        char[] charsVowel = {'а', 'о', 'и', 'е', 'ё', 'э', 'ы', 'у', 'ю', 'я'};
        System.out.println("Список книг, название которых начинается с гласной буквы:");
        while (i.hasNext()) {
            BookSecond b = i.next();
            for (int k = 0; k < charsVowel.length; k++) {
                if (b.getBookName().toLowerCase().charAt(0) == charsVowel[k]) {
                    System.out.println("- " + b);
                }
            }
        }

        ArrayList<BookSecond> newBooks = new ArrayList<>(books);

        System.out.println();
        System.out.println("Список книг, сортированный по фамилиям:");


        Collections.sort(newBooks, new Comparator<BookSecond>() {
            @Override
            public int compare(BookSecond o1, BookSecond o2) {
                String i = "ЯЯЯЯЯЯЯЯЯЯЯЯЯ";
                String k = o1.getAuthorSecondName();
                String j = o2.getAuthorSecondName();

                if (k == null) {
                    k = i;
                }
                if (j == null) {
                    j = i;
                }

                return k.compareTo(j);
            }
        });

        Iterator<BookSecond> k = newBooks.iterator();
        while (k.hasNext()) {
            System.out.println("- " + k.next());
        }

        System.out.println();
        System.out.println("Список книг, сортированный по именам:");

        Collections.sort(newBooks, new Comparator<BookSecond>() {
            @Override
            public int compare(BookSecond o1, BookSecond o2) {
                String i = "ЯЯЯЯЯЯЯЯЯЯЯЯЯ";
                String k = o1.getAuthorName();
                String j = o2.getAuthorName();

                if (k == null) {
                    k = i;
                }
                if (j == null) {
                    j = i;
                }

                return k.compareTo(j);
            }
        });

        Iterator<BookSecond> g = newBooks.iterator();
        while (g.hasNext()) {
            System.out.println("- " + g.next());
        }

        System.out.println();
        System.out.println("Список книг, сортированный по отчествам:");

        Collections.sort(newBooks, new Comparator<BookSecond>() {
            @Override
            public int compare(BookSecond o1, BookSecond o2) {
                String i = "ЯЯЯЯЯЯЯЯЯЯЯЯЯ";
                String k = o1.getAuthorMiddledName();
                String j = o2.getAuthorMiddledName();

                if (k == null) {
                    k = i;
                }
                if (j == null) {
                    j = i;
                }

                return k.compareTo(j);
            }
        });

        Iterator<BookSecond> l = newBooks.iterator();
        while (l.hasNext()) {
            System.out.println("- " + l.next());
        }
    }
}



