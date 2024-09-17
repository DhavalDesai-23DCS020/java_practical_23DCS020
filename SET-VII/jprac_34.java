import java.util.Random;

class number extends Thread {
    public int number;
    public boolean isEven;

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            number = random.nextInt(100);
            isEven = (number % 2 == 0);
            System.out.println("Generated Number: " + number);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class SquareCalculator extends Thread {
    private number generator;

    public SquareCalculator(number generator) {
        this.generator = generator;
    }

    @Override
    public void run() {
        while (true) {
            if (generator.isEven) {
                int square = generator.number * generator.number;
                System.out.println("Square of " + generator.number + ": " + square);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class CubeCalculator extends Thread {
    private number generator;

    public CubeCalculator(number generator) {
        this.generator = generator;
    }

    @Override
    public void run() {
        while (true) {
            if (!generator.isEven) {
                int cube = generator.number * generator.number * generator.number;
                System.out.println("Cube of " + generator.number + ": " + cube);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class jprac_34 {
    public static void main(String[] args) {
        number generator = new number();
        SquareCalculator squareCalculator = new SquareCalculator(generator);
        CubeCalculator cubeCalculator = new CubeCalculator(generator);

        generator.start();
        squareCalculator.start();
        cubeCalculator.start();
    }
}