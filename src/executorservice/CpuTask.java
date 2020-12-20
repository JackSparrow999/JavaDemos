package executorservice;

public class CpuTask implements Runnable{

    int x = 0;

    public CpuTask(int x){
        this.x =x;
    }

    @Override
    public void run() {
        System.out.println("Executing CPU intensive task "+ x +"...");
    }
}
