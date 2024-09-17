class HelloWorldThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello World");
    }
}

class HelloWorldRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World");
    }
}

public class jprac_32 {
    public static void main(String[] args) {
        // Example A: By Extending Thread Class
        HelloWorldThread thread1 = new HelloWorldThread();
        thread1.start();

        // Example B: By Implementing Runnable Interface
        Thread thread2 = new Thread(new HelloWorldRunnable());
        thread2.start();
        System.out.print("\nName : DHAVAL DESAI \nID : 23DCS020 ");

    }
}
