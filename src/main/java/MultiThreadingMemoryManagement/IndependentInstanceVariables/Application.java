package MultiThreadingMemoryManagement.IndependentInstanceVariables;

public class Application {

    public static void main(String[] args) {
        CounterRunnableImpl counter1 = new CounterRunnableImpl();
        CounterRunnableImpl counter2 = new CounterRunnableImpl();

        /*
        Each thread will have its own reference variable that points to its own independent CounterRunnableImpl objects in heap.
        Hence, instance variables of COunterRunnableImpl are not shared between the threads.
         */
        Thread counterThread1 = new Thread(counter1);
        Thread counterThread2 = new Thread(counter2);

        counterThread1.start();
        counterThread2.start();
    }


}
