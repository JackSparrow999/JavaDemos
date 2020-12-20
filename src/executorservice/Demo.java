package executorservice;

public class Demo {

    public static void main(String[] args){
        CpuIntensiveThreadPool cpu = new CpuIntensiveThreadPool();

        //since this is mutithreaded clearly the order of execution is not fixed
        for(int i=0;i<500;i++)
            cpu.executeTask(new CpuTask(i));

        IOThreadPool io = new IOThreadPool();

        //since this is mutithreaded clearly the order of execution is not fixed
        for(int i=0;i<500;i++)
            io.executeTask(new IOTask(i));

    }

}
