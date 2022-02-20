package Home;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
