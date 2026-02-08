//Two numbers are entered by the user, x and n. Write a function to find the value
//of one number raised to the power of another i.e. xn.
import java.util.*;
public class powerCal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first value:");
        int a =sc.nextInt();
        System.out.println("Enter seconed value:");
        int b=sc.nextInt();
        int power=1;
        for (int i = 1; i <= b; i++) {
            power = power * a;
        }
        System.out.println(power);
    }
}
