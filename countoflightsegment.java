import java.util.*;
public class countoflightsegment {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=m && (i==0 || arr[i-1]>m)){
                count++;
            }
        }
        System.out.print(count);
    }
}
/*
8
3 1 4 2 1 7 5 3
3
 */