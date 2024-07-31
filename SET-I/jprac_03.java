
    import java.util.Scanner;

    public class jprac_3
    {
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter the time taken in Hours : ");
                int hr=sc.nextInt();
                System.out.println("Enter the time taken in Minutes : ");
                int min =sc.nextInt();
                System.out.println("Enter the time taken in second : ");
                int sec=sc.nextInt();
                System.out.println("Enter the Distance coverd in meter : ");
                int Distance=sc.nextInt();
                int totalSec=( hr*3600 )+( min*60)+sec;
                double kmdis=Distance/1000;
                double miledis= Distance/1609;
                double  total_hours=hr+(min/60) + (sec/3600);
                double velocity1 = Distance/totalSec;
                double velocity2=kmdis/total_hours;
                double velocity3=miledis/total_hours;
            System.out.println("Velocity int the Different units : ");
                System.out.println("The velocity is in ( Meter/Sec) : "+velocity1);
                System.out.println("The velocity is in ( KM/Hour)  : "+velocity2);
                System.out.println("The velocity is in ( mile/Hour) : "+velocity3);
            }
        }
    }
