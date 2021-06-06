package lesson1;

public class UnSafeThread {
    private static int COUNT;

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        COUNT++;
                    }
                }
            }).start();
        }
        //等待子线程执行完毕，打印多个线程++计数的值
        while (Thread.activeCount()>1) Thread.yield();
        System.out.println(COUNT);
    }
}
