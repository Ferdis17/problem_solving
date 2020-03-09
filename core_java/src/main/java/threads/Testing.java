package threads;

public class Testing {


        public static void main(String[] args) {
            new Test();

//        public Test() {
            Test task = new Test();
            new Thread(task).start();
        //}
//        public void run() {
//


    }
}
class Test implements Runnable{

    @Override
    public void run() {
        System.out.println("test");
    }
}

 class Test3 implements Runnable {
    public static void main(String[] args) {
        new Test();
    }
    public Test3() throws InterruptedException {
        Thread.sleep(100);
    }
    public synchronized void run() {
    }
}
