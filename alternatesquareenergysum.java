import java.util.*;
public class alternatesquareenergysum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int total=0;
        for(int i=0;i<n;i++){
            int sum=arr[i]*arr[i];
            if(i%2==0){
                total+=sum;
            }
            else{
                total-=sum;
            }
        }
        System.out.print(total);
    }
}
