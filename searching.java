import java.util.*;
public class searching {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number range:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("number"+i+":");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter  the elememnt to search:");
        int search=sc.nextInt();
        for(int i=0;i<n;i++){
            if(search==arr[i]){
                System.out.println("alement found at index:"+i);
                break;
            }
        }
    }
}

