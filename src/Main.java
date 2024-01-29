
public class Main {
    public static void main(String[] args) {
        OnDone.OnTaskDoneListener listener = System.out::println;
        Error.OnTaskErrorListener errorListener = System.out::println;
        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }

}