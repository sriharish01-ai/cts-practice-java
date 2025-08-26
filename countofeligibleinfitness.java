import java.util.*;
public class countofeligibleinfitness {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] height=new int[n];
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        int[] weight=new int[n];
        for(int i=0;i<n;i++){
            weight[i]=sc.nextInt();

        }
        int bmi=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            double ans=((double) weight[i]/height[i])*10;
            if(ans<=bmi){
                count++;

            }
        }
        System.out.print(count);

    }
}
/*
5
160 170 180 150 175
50 70 80 45 60
4
 */