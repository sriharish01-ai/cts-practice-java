import java.util.*;
public class maxbalancedstudentgrp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ecount=0;
        int ocount=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                ecount++;
            }
            else{
                ocount++;
            }
        }
        System.out.print(Math.min(ecount,ocount));

    }
}
