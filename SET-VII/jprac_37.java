class sourses {
    private int data;
    private boolean available = false;

    public  void produce(int value) throws InterruptedException {
        while (available) {
            wait();
        }
        data = value;
        available = true;
        notifyAll();
    }

    public  int consume() throws InterruptedException {
        while (!available) {
            wait();
        }
        available = false;
        notifyAll();
        return data;
    }
}

class producer extends Thread {
    private sourses sourses;
    private int n;

    public producer(sourses sourses, int n) {
        this.sourses = sourses;
        this.n = n;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < n; i++) {
                sourses.produce(i);
                System.out.println("Produced: " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class consumer extends Thread {
    private sourses sourses;
    private int n;

    public consumer(sourses sourses, int n) {
        this.sourses = sourses;
        this.n = n;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < n; i++) {
                int value = sourses.consume();
                System.out.println("Consumed: " + value);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class jprac_37 {
    public static void main(String[] args) {
        int n = 10; // Example value for n
        sourses sourses = new sourses();
        
        producer producer = new producer(sourses, n);
        consumer consumer = new consumer(sourses, n);

        producer.start();
        consumer.start();
    }
}