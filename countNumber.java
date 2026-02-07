//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
import java.util.*;
public class countNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        int n=sc.nextInt();
        int a;
        int positive=0,negetive=0,zero=0;
        for(int i=0;i<n;i++) {
            a = sc.nextInt();
            if (a > 0) {
                positive++;
            } else if (a < 0) {
                negetive++;
            } else {
                zero++;
            }
        }
        System.out.println(positive);
        System.out.println(negetive);
        System.out.println(zero);
    }
}
