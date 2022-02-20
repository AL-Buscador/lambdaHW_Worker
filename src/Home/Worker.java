package Home;

public class Worker implements OnTakDoneListener, OnTaskErrorListener {

    private OnTakDoneListener callback;
    private OnTaskErrorListener errorCallback;

    @Override
    public void onDone(String result) {
        System.out.println(result);
    }

    @Override
    public void onError(String result) {
        System.out.println(result);
    }

    public Worker(OnTakDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 1; i <= 100; i++) {
            if (i == 33) {
                errorCallback.onError("Task " + i + " is not done");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
