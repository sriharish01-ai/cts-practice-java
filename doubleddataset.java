import java.util.*;
public class doubleddataset {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] doubled=new int[2*n];
        for(int i=0;i<n;i++){
            doubled[i]=arr[i];
            doubled[i+n]=arr[i];

        }
        System.out.print("[");
        for(int i=0;i<doubled.length;i++){
            System.out.print(doubled[i]);
            if(i!=doubled.length-1){
                System.out.print(",");
            }

        }
        System.out.print("]");
    }
}
