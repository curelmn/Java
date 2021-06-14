package lesson7;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Callable为任务描述，提供了任务执行完毕的返回结果
        Callable<Integer> c = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println(1);
                return 2;
            }
        };
        //Future/FutureTask，构造时，传入Callable对象，本身是Runnable实现类
        FutureTask task = new FutureTask(c);

        new Thread(task).start();

        //Future/FutureTask.get()：
        // 当前线程阻塞等待，直到子线程执行完毕（和join类似），返回结果
        System.out.println(task.get());
        //观察打印3，写在get前后的不同结果
//        System.out.println(3);
    }
}
