package otherTask;
/*
Напишите класс, конструктор которого принимает два массива: массив значений и массив весов значений.
Класс должен содержать метод, который будет возвращать элемент из первого массива случайным образом, с учётом его веса.
Пример:
Дан массив [1, 2, 3], и массив весов [1, 2, 10].
В среднем, значение «1» должно возвращаться в 2 раза реже, чем значение «2» и в десять раз реже, чем значение «3».
*/

public class RandomGeneration {
    private int array[];
    private int arrayWeight[];

    RandomGeneration(int array[], int arrayWeight[]) {
        this.array = array;
        this.arrayWeight = arrayWeight;
    }

    void random() {
        int weightSum = 0;

        for (int i = 0; i < arrayWeight.length; i++) {
            weightSum = weightSum + arrayWeight[i];
        }

        weightSum = (int) (Math.random() * weightSum);

        int increaseSum = 0;

        for (int i = 0; i < array.length; i++) {
            if (weightSum < increaseSum + arrayWeight[i]) {
                System.out.println("Возвращаемый элемент первого массива: " + array[i]);
                break;
            }
            increaseSum = increaseSum + arrayWeight[i];

        }


    }

}

class RandomGenerationDemo {
    public static void main(String[] args) {

        RandomGeneration demo = new RandomGeneration(new int[]{1, 2, 3, 4}, new int[]{10, 2, 1, 99});

        demo.random();
    }
}
