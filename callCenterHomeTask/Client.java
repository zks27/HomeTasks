package callCenterHomeTask;

import java.util.concurrent.Semaphore;

public class Client implements Runnable {
    private CallCenter o;
    private String name;
    private Semaphore semaphore;
    private boolean[] operators;
    private int clientNumber;


    Client(CallCenter o, String name, Semaphore semaphore, boolean[] operators, int clientNumber) {
        this.name = name;
        this.o = o;
        this.semaphore = semaphore;
        this.operators = operators;
        this.clientNumber = clientNumber;

        new Thread(this, name).start();
    }

    @Override
    public void run() {
        o.call(this.name, semaphore, operators, clientNumber);
    }
}

