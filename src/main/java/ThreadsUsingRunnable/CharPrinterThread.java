package ThreadsUsingRunnable;

public class CharPrinterThread implements Runnable{
    @Override
    public void run() {
        for(int i=(int)'a'; i<=(int)'z'; i++) {
            System.out.println("Char Thread: " + i);
        }
    }
}
