package callCenterHomeTask;

import java.util.concurrent.Semaphore;

public class CallCenter {


    private int clients = 0;
    private int customerQueue = 0;

    public void call(String j, Semaphore semaphore, boolean[] operators, int clientNumber) {
        customerQueue++;
        System.out.println("Клиентов в очереди: " + customerQueue);
        System.out.println("-------------------------------------");

        try {
            semaphore.acquire();
            int operatorNumber = -1;

            synchronized (operators) {
                for (int i = 0; i < 4; i++)
                    if (!operators[i]) {
                        operators[i] = true;
                        operatorNumber = i;
                        System.out.println("Оператор " + (i + 1) + " ответил на звонок клиента " + j);
                        customerQueue--;
                        System.out.println("Клиентов в очереди: " + customerQueue);
                        System.out.println("-------------------------------------");
                        break;
                    }
            }

            Thread.sleep((int) (Math.random() * (10000 - 6000) + 6000));

            synchronized (operators) {
                operators[operatorNumber] = false;
            }

            semaphore.release();

            System.out.println("Оператор " + (operatorNumber + 1) + " закончил разговор c клиентом " + j);
            clients++;
            if (clients == clientNumber) {
                System.out.println("-----------------------------");
                System.out.println("-----------------------------");
                System.out.println("Работа колл центра закончена");
            }
        } catch (InterruptedException e) {
            System.out.println("Пpepвaнo");
        }

    }

}
