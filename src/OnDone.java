public class OnDone {
    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }

}
