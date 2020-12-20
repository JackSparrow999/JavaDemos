package executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IOThreadPool {

    int numberOfCores = 0;

    ExecutorService executorService = null;

    public IOThreadPool(){
        numberOfCores = Runtime.getRuntime().availableProcessors()*10;
        executorService = initializeThreadPool();
    }

    public ExecutorService initializeThreadPool(){
        return Executors.newFixedThreadPool(numberOfCores);
    }

    public void executeTask(Runnable task){
        executorService.execute(task);
    }

}
