
// Write a java that implements an interface
// AdvancedArithmetic which contains amethod signature
// int divisor_sum(int n). You need to write a class
// calledMyCalculator which implements the interface.
// divisorSum function just takes an integer as input and
// return the sum of all its divisors.
// For example, divisors of 6 are 1, 2, 3 and 6, so
// divisor_sum should return 12. The value of n will be at
// most 1000.



// interface AdvancedArithmetic {
//     int divisor_sum(int n);

// }
// class calledMyCalculator implements AdvancedArithmetic{
//     @Override
//     public int divisor_sum(int n){
//         int sum = 0;
//         for(int i=1;i<=n;i++){
//             if(n%i==0){
//                 sum += i;
//             }
//         }
//         return sum;
//     }
// }

// public class jprac_22{
//     public static void main(String[] args) {
//         calledMyCalculator c = new calledMyCalculator();
//         System.out.println(c.divisor_sum(6));

//     }
// }

interface  inter1{
    int n= 10;
    void method1();
}
class test implements inter1{
    public void method1(){
        System.out.println("Method 1");
    }
}
public class jprac_22{
    public static void main(String[] args) {
        test t = new test();
        t.method1();
        System.out.println("Value of n : "+inter1.n);
    }
}








