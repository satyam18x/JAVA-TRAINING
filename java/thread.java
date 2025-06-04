class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread using runnable inteface");
    }
}
public class thread{

    public static void main(String[] args){
        MyRunnable  obj=new MyRunnable();
        Thread t1 = new Thread(obj);

        t1.start();
        System.out.println("main thread is running");
    }

}