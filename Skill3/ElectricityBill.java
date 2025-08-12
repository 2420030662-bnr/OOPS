package Skill3;
import java.util.Scanner;
public class ElectricityBill{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of units consumed: ");
        int units=sc.nextInt();
        double bill=0;
        int extra=0;
        double rate=0;
        if (units<=50){
            rate=0;
            extra = 0;
            bill = 0;
        } else if(units>=51 && units<=100){
            rate=3;
            bill = units*rate;
        } else if(units>=101 && units<=300) {
            rate=5;
            extra=100;
            bill = units * rate + extra;
        } else if(units>=301 && units<=450) {
            rate = 6;
            extra=200;
            bill=units*rate + extra;
        } else{
            rate=8;
            extra=250;
            bill=units * rate + extra;
        }
        System.out.println("--- Electricity Bill ---");
        System.out.println("Units consumed : " +units);
        System.out.printf("Rate per unit  : %.2f Rs\n",rate);
        System.out.println("Extra charges  : " + extra + " Rs");
        System.out.printf("Total amount to pay : %.2f Rs\n",bill);
        sc.close();
    }
}
