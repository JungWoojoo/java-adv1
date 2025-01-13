package thread.start.test;

import static util.MyLogger.log;

public class StartTest2Main {
    public static void main(String[] args) {
        CounterThread counterThread = new CounterThread();
        Thread thread = new Thread(counterThread, "counter");
        thread.start();

    }

    static class CounterThread implements Runnable{
        @Override
        public void run() {
            for (int i = 1; i < 6; i++) {
                try {
                    log("value: " + i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}