package ThreadsUsingRunnable;

public class NumberPrinterThread implements Runnable{


    @Override
    public void run() {
        for(int i=0; i<100; i++){
            System.out.println("Number Thread: " + i);
        }
    }
}
