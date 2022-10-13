package Lambda;

public class RunCommonThread {
    private void runCommonThread() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        new Thread(runnable).start();
    }

    private void runCommonThreadLambda() {
        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
    }
}
