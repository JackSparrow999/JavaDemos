package executorservice;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CpuIntensiveThreadPool {

    int numberOfCores = 0;

    ExecutorService executorService = null;

    public CpuIntensiveThreadPool(){
        numberOfCores = Runtime.getRuntime().availableProcessors();
        executorService = initializeThreadPool();
    }

    public ExecutorService initializeThreadPool(){
        return Executors.newFixedThreadPool(numberOfCores);
    }

    public void executeTask(Runnable task){
        executorService.execute(task);
    }

}
