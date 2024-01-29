public class Error {
    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String result);
    }
}
