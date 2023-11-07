package ThreadsUsingThreadsClass;

public class CharacterThread extends Thread{
    /*
        Not necessary to define constructor. But defined
        to name the thread for debugging purpose.
     */
    public CharacterThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(char c='a'; c<='z'; c++){
            System.out.println("Inside " + Thread.currentThread().getName() + ": " + c);
        }
    }
}
