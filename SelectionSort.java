import java.util.Scanner;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the "+(i+1)+" no:");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
               int smallest=i;
               if(arr[smallest]>arr[j]){
                   int temp=arr[smallest];
                   arr[smallest]=arr[j];
                   arr[j]=temp;
               }
            }
        }
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
