import java.util.*;
public class majproductidreview{
    public static int majelement(int[] arr){
        int candidate=arr[0];
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==candidate){
                count++;
            }
            else{
                count--;
                if(count<0){
                    candidate=arr[i];
                    count=1;
                }
            }
            count=0;
            for(int num:arr){
                if(num==candidate){
                    count++;
                }
            }
        }
        return count>arr.length/2 ? candidate:-1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=majelement(arr);
        System.out.print(result);
    }
}
