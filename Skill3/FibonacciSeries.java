package Skill3;
import java.math.BigInteger;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n (number of Fibonacci terms to print): ");
        int n = sc.nextInt();

        if(n<=0){
            System.out.println("Please enter a positive integer > 0.");
            sc.close();
            return;
        }
        System.out.println("Fibonacci series (first "+n+" terms):");
        BigInteger a=BigInteger.ZERO;
        BigInteger b=BigInteger.ONE;
        for(int i=0;i<n;i++){
            System.out.print(a);
            if(i<n-1) System.out.print(", ");
            BigInteger next=a.add(b);
            a=b;
            b=next;
        }
        System.out.println();
        sc.close();
    }
}
