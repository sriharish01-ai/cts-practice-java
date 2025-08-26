import java.util.*;
public class maxconsecutivewin {
    public static int ans(int[] arr,int n){
        int max=0;
        int curr=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                curr++;
                if(curr>max){
                    max=curr;
                }
            }
            else{
                curr=0;
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=ans(arr,n);
        System.out.print(res);
    }
}
