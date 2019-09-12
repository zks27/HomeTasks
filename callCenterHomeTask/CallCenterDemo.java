package callCenterHomeTask;

/*
В колл центре имеется заданное число операторов и определенная вместимость по клиентам, необходимо организовать
эмуляцию работы колцентра, т.е. разговор оператора с клиентом. Те клиенты, для которых оператора не нашлось должны
быть помещены в очередь для ожидания. А для кого нашлась должны провести разговор с оператором. Каждое действие должно
быть записано и выведено на консоль. Колл центр должен обслужить всех клиентов и завершить свою работу.
 */

import java.util.concurrent.Semaphore;

public class CallCenterDemo {

    public static void main(String[] args) {
        CallCenter o = new CallCenter();
        int clientNumber = 10;
        int operatorNumber = 4;

        Semaphore semaphore = new Semaphore(operatorNumber, true);
        boolean[] operators = new boolean[operatorNumber];


        System.out.println("Колл центр начал свою работу");
        System.out.println("Количество операторов: " + operatorNumber);
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");


        try {
            for (int i = 0; i < clientNumber; i++) {

                System.out.println("Клиент " + (i + 1) + " позвонил в колл центр");
                new Client(o, String.valueOf(i + 1), semaphore, operators, clientNumber);
                Thread.sleep((int) (Math.random() * (2000 - 1000) + 1000));
            }
        } catch (InterruptedException e) {
            System.out.println("Пpepвaнo");
        }


    }


}

