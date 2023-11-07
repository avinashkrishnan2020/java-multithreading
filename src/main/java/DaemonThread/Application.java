package DaemonThread;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        Runnable backgroundRunnable = () -> {
            while(true){
                System.out.println("inside background thread");
            }
        };

        Thread backgroundThread = new Thread(backgroundRunnable);
        backgroundThread.setDaemon(true);
        backgroundThread.start();

        Thread.sleep(5000);
        /*
            If backgroundThread is not daemon, it will continue printing "inside background thread"
            even after main thread reaches its last line.
         */

    }
}
