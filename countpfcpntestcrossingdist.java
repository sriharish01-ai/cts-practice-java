import java.util.*;
public class countpfcpntestcrossingdist {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int m=sc.nextInt();
        int count=0;
        for(int speed:arr){
            int total=0;
            int curr=speed;
            for(int minute=0;minute<m && curr>0;minute++) {
                total += curr;
                curr--;
            }
            if(total>=k){
                count++;
            }

        }
        if(count==0){
            System.out.print("-1");
        }
        else{
            System.out.print(count);
        }
    }
}
