// Write a program to increment the value of one variable by
// one and display it after one second using thread using
// sleep() method.

public class jprac_35 extends Thread {
    private int value;

    public jprac_35(int value) {
        this.value = value;
    }

    public void run() {
        try {
            Thread.sleep(1000); // Sleep for one second
            value++; // Increment the value
            System.out.println("Value after increment: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int initialValue = 10; // Initial value of the variable
        jprac_35 thread = new jprac_35(initialValue);
        thread.start();
    }
}



