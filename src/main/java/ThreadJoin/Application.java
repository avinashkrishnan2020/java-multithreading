package ThreadJoin;

/*
 Waiting for a daemon threads to finish before main thread ends execution
 */
public class Application {
    public static void main(String[] args) throws InterruptedException {
        Thread daemonThread = new Thread(daemonRunnable, "daemon-thread");
        Thread backgroundServiceThread = new Thread(backgroundServiceRunnable, "background-service-thread");

        daemonThread.setDaemon(true);
        backgroundServiceThread.setDaemon(true);

        daemonThread.start();
        backgroundServiceThread.start();

        //Wihtout join, main thread won't wait for daemon threads to finish
        daemonThread.join();
        backgroundServiceThread.join();
    }

    static Runnable daemonRunnable = () -> {

        String threadName = Thread.currentThread().getName();

        for(int i=0; i<5; i++){
          System.out.println("Inside " + threadName);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    static Runnable backgroundServiceRunnable = () -> {
        String threadName = Thread.currentThread().getName();
        for(int i=0; i<10; i++){
            System.out.println("Inside " + threadName);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
}

