import java.util.*;
public class charityevent {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        final int MOD=1000000007;
        long total=0;
        for(int i=1;i<=n;i++){
            long chocolate=i;
            int prev=(i==1)?n:i-1;
            int next=(i==5)?1:i+1;
            if(prev%5==0 || next%5==0){
                chocolate+=2;
            }
            total=(total+chocolate)%MOD;

        }
        System.out.print(total);

    }
}
