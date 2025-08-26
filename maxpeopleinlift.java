import java.util.*;
public class maxpeopleinlift {
    public static int res(int[] arr,int m){
        Arrays.sort(arr);
        int totalweight=0;
        int count=0;
        for(int ans:arr){
            if(totalweight+ans<=m){
                totalweight+=ans;
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=res(arr,m);
        System.out.print(result);
    }
}
