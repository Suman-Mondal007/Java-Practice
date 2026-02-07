//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;
public class oddsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter range:");
        int a=sc.nextInt();
        System.out.println();
        int sum=0;
        for (int i=1;i<a;i=i+2){
            sum+=i;
        }
        System.out.println("Total sum="+sum);
    }
}
