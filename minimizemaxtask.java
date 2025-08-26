import java.util.*;
public class minimizemaxtask {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int maxsum=0;
        for(int i=0;i<n;i++){
            int sum=arr[i]+arr[n-1-i];
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        System.out.print(maxsum);
    }
}
