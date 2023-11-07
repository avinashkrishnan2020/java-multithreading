package ThreadsUsingLambda;

public class Application {
    public static void main(String[] args) {
        Thread numThread = new Thread(numRunnable, "numThread");
        Thread charThread = new Thread(charRunnable, "charThread");

        numThread.start();
        charThread.start();
    }

    // Define numRunnable using lambda
    static Runnable numRunnable = () -> {
        // Override and define Run() method
        String thisThread = Thread.currentThread().getName();
        for(int i=0; i<26; i++){
            System.out.println("Inside " + thisThread + ": " + i);
        }
    };

    // Define charRunnable using lambda
    static Runnable charRunnable = () -> {
        //Override and define Run() method
        String thisThread = Thread.currentThread().getName();
        for(char c='a'; c<='z'; c++){
            System.out.println("Inside " + thisThread + ": " + c);
        }
    };
}
