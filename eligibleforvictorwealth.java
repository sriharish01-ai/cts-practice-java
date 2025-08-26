import java.util.*;
public class eligibleforvictorwealth {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        int count=0;
        for(int fr:arr){
            if(m+2*fr>=sum){
                count++;


            }
        }
        System.out.print(count);
    }
}
