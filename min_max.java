import java.util.Scanner;
public class min_max {
    
    public static void main(String [] args ){
       Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int[] arr= new int[x];
        int max= arr[0];
        int min= arr[0];
        for(int i=0; i<x;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<x;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
            
        }
        System.out.println(max+ " "+ min);
        sc.close();
    }
}