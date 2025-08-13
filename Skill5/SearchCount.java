package Skill5;
import java.util.Scanner;
public class SearchCount{
    public static void main(String[] args){
        Scanner c=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=c.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter " +n+ " elements:");
        for(int i=0;i<n;i++){
            arr[i]=c.nextInt();
        }
        System.out.print("Enter value to search: ");
        int key=c.nextInt();
        int count=0;
        for (int num : arr){
            if (num == key){
                count++;
            }
        }
        if (count>0) {
            System.out.println(key + " is present "+count+ " times.");
        } else {
            System.out.println(key +" not found in array.");
        }
        c.close();
    }
}
