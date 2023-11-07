package MultiThreadingMemoryManagement.SharedInstanceVariable;

public class Application {

    public static void main(String[] args) {
        CounterRunnableImpl counterRunnable = new CounterRunnableImpl();

        /*
         The instance variables of CounterRunnableImpl will be shared between the two threads. This is because
         counterRunnable object in heap is shared between the 2 threads.

         However, each thread will have its own local variables of CounterRunnableImpl in its stack frame.
         */
        Thread counterThread1 = new Thread(counterRunnable);
        Thread counterThread2 = new Thread(counterRunnable);

        counterThread1.start();
        counterThread2.start();
    }
}
