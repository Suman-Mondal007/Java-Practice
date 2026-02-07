//Enter 3 numbers from the user & make a function to print their average.
import java.util.*;
public class alltype {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 3 number:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int sum=a+b+c;
        int avg=sum/3;
        System.out.println("Average="+avg);
    }
}
