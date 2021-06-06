package lesson1;

import java.util.concurrent.*;

public class ThreadPoolTest {
    public static void main(String[] args) {
        //快捷方式创建线程池
        //单线程池：只有一个线程运行任务
        ExecutorService pol= Executors.newSingleThreadExecutor();
        //固定大小的线程池：固定数量的线程执行任务
        ExecutorService fixed=Executors.newFixedThreadPool(4);
        //缓存的线程池：
        ExecutorService cached=Executors.newCachedThreadPool();
        //定时任务的线程池
        ScheduledExecutorService scheduled=Executors.newScheduledThreadPool(4);

        //重点：真是使用线程池的API
        ExecutorService pool=new ThreadPoolExecutor(
                4,//核心线程数
                10,//最大线程数
                60,//空闲时间
                TimeUnit.SECONDS,//空闲时间单位
                new LinkedBlockingDeque<>(),//指定阻塞队列
                new ThreadFactory() {//线程创建的工厂类
                    @Override
                    public Thread newThread(Runnable r) {
                        return newThread(r);
                    }
                },
                //拒绝策略
                //   new ThreadPoolExecutor.CallerRunsPolicy()
                //   new ThreadPoolExecutor.AbortPolicy()
                  new ThreadPoolExecutor.DiscardOldestPolicy()
                //  new ThreadPoolExecutor.DiscardPolicy()


        );
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        });
    }
}
