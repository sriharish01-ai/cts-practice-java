import java.util.*;
public class sumofdivadjacentsum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            int next=(i==n)?1:i+1;
            int val=i+next;
            if(val%x==0){
                sum+=val;

            }
        }
        System.out.print(sum);
    }
}
