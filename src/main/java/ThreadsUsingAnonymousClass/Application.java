package ThreadsUsingAnonymousClass;

public class Application {
    public static void main(String[] args) {

        Thread numThread = new Thread(numRunnable, "num-thread");
        Thread charThread = new Thread(charRunnable, "char-thread");

        numThread.start();
        charThread.start();
    }

    // Can be defined inside PSVM() also
    static Runnable numRunnable = new Runnable(){
        @Override
        public void run() {
            String thisThread = Thread.currentThread().getName();
            for(int i=0; i<26; i++){
                System.out.println("Inside " + thisThread + ": " + i);
            }
        }
    };


    static Runnable charRunnable = new Runnable() {
        @Override
        public void run() {
            String thisThread = Thread.currentThread().getName();
            for(char c='a'; c<='z'; c++){
                System.out.println("Inside " + thisThread + ": " + c);
            }
        }
    };
}
