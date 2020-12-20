package executorservice;

public class IOTask implements Runnable{

    int x = 0;

    public IOTask(int x){
        this.x =x;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Executing IO intensive task "+ x +"...");
    }

}
