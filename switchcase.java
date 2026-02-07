import java.util.*;
public class switchcase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first value:");
        int a=sc.nextInt();
        System.out.println("Enter seconed value:");
        int b=sc.nextInt();
        System.out.println("Enter your choice(+,-,*,/):");
        String ch=sc.next();
        switch (ch){
            case "+":
                int sum=a+b;
                System.out.println("sum:"+sum);
                break;
            case "-":
                int sub=a-b;
                System.out.println("sub:"+sub);
                break;
            case "*":
                int mul=a*b;
                System.out.println("mul:"+mul);
                break;
            case "/":
                int div=a/b;
                System.out.println("div:"+div);
                break;
            default:
                System.out.println("Invalid!");
        }
    }
}
