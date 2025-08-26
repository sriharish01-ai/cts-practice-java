import java.util.*;
public class consecutivewrestler {
    public static int wrestler(int[] arr,int m){
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]) {
                count++;
                if (count == m) {
                    int sum = 0;
                    for (int j = i - m + 1; j <= i; j++) {
                        sum += arr[j];
                    }
                    return sum;
                }
            }
            else{
                count=1;
            }

        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int result=wrestler(arr,m);
        System.out.print(result);
    }
}
