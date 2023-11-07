package MultiThreadingMemoryManagement.SharedInstanceVariable;

import MultiThreadingMemoryManagement.DummyClass;

public class CounterRunnableImpl implements Runnable{

    private int count;
    private DummyClass instanceDummyClassObj = new DummyClass();

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        DummyClass localDummyClassObj = new DummyClass();

        System.out.println("\n" + threadName + "instanceDummyClassObj: " + instanceDummyClassObj +
                "\n" + threadName + "localDummyClassObj: " + localDummyClassObj);

        // Each thread will have its own int i in its own stack frame
        for(int i=0; i<5; i++){
            System.out.println(threadName + ": " + count);
            count++;
        }
    }
}
