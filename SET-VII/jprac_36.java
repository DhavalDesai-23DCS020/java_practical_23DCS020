class f1 extends Thread {
    public void run() {
        System.out.println("first : " + this.getPriority());
    }
}

class f2 extends Thread {
    public void run() {
        System.out.println("second : " + this.getPriority());
    }
}

class f3 extends Thread {
    public void run() {
        System.out.println("third : " +  this.getPriority());
    }
}

public class jprac_36 {
    public static void main(String[] args) {
        // Create thread instances
        f1 first = new f1();
        f2 second = new f2();
        f3 third = new f3();

        // Set thread names
        first.setName("FIRST");
        second.setName("SECOND");
        third.setName("THIRD");

        // Set thread priorities
        first.setPriority(3);
        second.setPriority(Thread.NORM_PRIORITY); // Default priority is 5
        third.setPriority(7);

        // Start the threads
        first.start();
        second.start();
        third.start();
        
    }
}
