package ThreadsUsingThreadsClass;

public class NumberThread extends Thread{
    /*
        Not necessary to define constructor. But defined
        to name the thread for debugging purpose.
     */

    public NumberThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i=0; i<26; i++){
            System.out.println("Inside " + Thread.currentThread().getName() + ": " + i);
        }
    }
}
