import java.util.*;
public class finduniqueoperator {
    public static int ans(int[] arr,int n){
        int result=0;
        for(int i=0;i<n;i++){
            result^=arr[i];
        }
        return result;
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
