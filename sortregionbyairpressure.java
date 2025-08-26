import java.util.*;
public class sortregionbyairpressure {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Integer[] indices=new Integer[n];
        for(int i=0;i<n;i++){
            indices[i]=i;
        }
        Arrays.sort(indices,(i,j)->{
            if(arr[j]!=arr[i]){
                return Integer.compare(arr[j],arr[i]);
            }
            else{
                return Integer.compare(i,j);
            }
        });
        System.out.print("{");
        for(int i=0;i<n;i++){
            System.out.print(indices[i]);
            if(i!=n-1){
                System.out.print(","+" ");
            }
        }
        System.out.print("}");
    }
}
