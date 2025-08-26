import java.util.*;
public class treasureunlockchallenge {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] target=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            target[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int total=0;
        for(int i=0;i<n;i++){
            total+=Math.abs(arr[i]-target[i]);

        }
        if(total<=x){
            System.out.print(total);
        }
        else{
            System.out.print("-1");
        }
    }
}
