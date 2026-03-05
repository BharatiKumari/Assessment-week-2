// Approach 1: Extending Thread
class MyThread extends Thread {
    public void run() { System.out.println("Thread class approach running..."); }
}

// Approach 2: Implementing Runnable
class MyRunnable implements Runnable {
    public void run() { System.out.println("Runnable interface approach running..."); }
}

public class ThreadCreation {
    public static void main(String[] args) {
        new MyThread().start();
        new Thread(new MyRunnable()).start();
    }
}
