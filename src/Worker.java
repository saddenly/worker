public class Worker {
    private final OnTaskDoneListener CALLBACK;
    private final OnTaskErrorListener ERROR_CALLBACK;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallBack) {
        this.CALLBACK = callback;
        this.ERROR_CALLBACK = errorCallBack;
    }

    public void start() {
        for (int i = 0; i <= 100; i++) {
            if (i == 33) {
                ERROR_CALLBACK.onError("Task " + i + " is failed!");
            }
            CALLBACK.onDone("Task " + i + " is done!");
        }
    }
}