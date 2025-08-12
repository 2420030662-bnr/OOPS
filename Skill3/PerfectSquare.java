package Skill3;
import java.util.Scanner;
public class PerfectSquare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer N: ");
        long N=sc.nextLong();
        if (N<0) {
            System.out.println("Negative numbers cannot be perfect squares.");
            sc.close();
            return;
        }
        long r=(long)Math.sqrt(N);
        while((r+1) * (r + 1)<=N) r++;
        while(r*r>N) r--;
        if(r*r==N) {
            System.out.println(N + " is a perfect square. ("+ r+"*"+r+")");
        }else{
            System.out.println(N + " is NOT a perfect square.");
        }
        sc.close();
    }
}
