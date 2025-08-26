import java.util.*;
public class bookshelfcal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int shelves=0;
        int carry=0;
        for(int i=0;i<n;i++){
            int total=arr[i]+carry;
            shelves+=total/k;
            carry=total%k;
        }
        System.out.print(shelves);
    }
}
