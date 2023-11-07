package ThreadsUsingThreadsClass;

public class Application {
    public static void main(String[] args) {
        NumberThread numThread = new NumberThread("numThread");
        CharacterThread charThread = new CharacterThread("charThread");

        // The execution order can vary each time the code is executed
        numThread.start();
        charThread.start();
    }
}
