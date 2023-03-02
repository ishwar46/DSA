package ExamPractice;

public class MultiplesOfTwo implements Runnable {

    private int limit; // 20
    private int interval; // 2
    private static int next = 2; // 2

    // Constructor
    public MultiplesOfTwo(int limit, int interval) {
        this.limit = limit; //
        this.interval = interval;
    }

    // Thread method
    @Override
    public void run() {
        while (next <= limit) { //
            if (next % interval == 0) { //
                System.out.println(Thread.currentThread().getName() + ": " + next);
                next += 2;
            }
        }
    }

    public static void main(String[] args) {
        MultiplesOfTwo m1 = new MultiplesOfTwo(20, 2);
        MultiplesOfTwo m2 = new MultiplesOfTwo(20, 3);

        new Thread(m1, "Thread 1").start();
        new Thread(m2, "Thread 2").start();
    }
}


//public class MultiplesOfTwo implements Runnable {
//
//    private int limit; // maximum number of rows in the table
//    private static int next = 1; // next row to output
//    private static final Object lock = new Object(); // lock to synchronize threads
//
//    public MultiplesOfTwo(int limit) {
//        this.limit = limit;
//    }
//
//    @Override
//    public void run() {
//        while (next <= limit) {
//            synchronized (lock) {
//                if (next <= limit) {
//                    for (int i = 1; i <= 10; i++) {
//                        System.out.println(Thread.currentThread().getName() + ": " + next + " x " + i + " = " + (next * i));
//                    }
//                    next++;
//                    lock.notifyAll();
//                } else {
//                    break;
//                }
//                try {
//                    lock.wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        MultiplesOfTwo m1 = new MultiplesOfTwo(1);
//        MultiplesOfTwo m2 = new MultiplesOfTwo(2);
//
//        Thread t1 = new Thread(m1, "Thread 1");
//        Thread t2 = new Thread(m2, "Thread 2");
//
//        t1.start();
//        t2.start();
//    }
//}
