import java.util.*;
public class twoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        System.out.println("Enter cols:");
        int cols=sc.nextInt();
        System.out.println("Enter array element:");
        int arr[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elemnt to search:");
        int search=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==search){
                    System.out.println("Elemnt found at index:"+i+j);
                }
            }
        }
    }
}
