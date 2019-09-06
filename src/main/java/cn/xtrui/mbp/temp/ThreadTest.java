package cn.xtrui.mbp.temp;

import org.springframework.instrument.classloading.weblogic.WebLogicLoadTimeWeaver;

import java.util.concurrent.*;

public class ThreadTest implements Runnable{
    @Override
    public void run() {
        System.out.println("run methods");
    }

    public static void print(){
        System.out.println("print");
    }

    public static void main(String[] args) {
        ExecutorService service1 = new ThreadPoolExecutor(4,4,0L,
                TimeUnit.MILLISECONDS,new LinkedBlockingDeque<>(1024),Executors.defaultThreadFactory());
        ExecutorService service = Executors.newFixedThreadPool(4);
        service.execute(ThreadTest::print);
        service.execute(TimeTest::testTime);
        service.execute(()->{
            System.out.println("gg");
        });
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int count = ((ThreadPoolExecutor)service).getActiveCount();
        System.out.println(count);
        service.shutdown();
        System.out.println("main");
        

    }
}
