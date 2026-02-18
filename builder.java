import java.util.*;
public class builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Suman");
        System.out.println(sb.charAt(0));
        sb.insert(0,'D');
        System.out.println(sb);
        sb.setCharAt(0,'D');
        System.out.println(sb);
        sb.delete(0,1);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
