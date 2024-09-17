import java.util.Scanner;

class SumThread extends Thread {
    private int start;
    private int end;
    private long partialSum;

    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.partialSum = 0;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            partialSum += i;
        }
    }

    public long getPartialSum() {
        return partialSum;
    }
}

public class jprac_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.print("Enter the number of threads: ");
        int numberOfThreads = scanner.nextInt();

        if (N <= 0 || numberOfThreads <= 0) {
            System.out.println("N and number_of_threads must be positive integers.");
            scanner.close();
            return;
        }

        SumThread[] threads = new SumThread[numberOfThreads];
        int range = N / numberOfThreads;
        int start = 1;

        for (int i = 0; i < numberOfThreads; i++) {
            int end = (i == numberOfThreads - 1) ? N : start + range - 1;
            threads[i] = new SumThread(start, end);
            threads[i].start();
            start = end + 1;
        }

        long finalSum = 0;
        try {
            for (SumThread thread : threads) {
                thread.join();
                finalSum += thread.getPartialSum();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The sum of numbers from 1 to " + N + " is: " + finalSum);
        scanner.close();
    }
}