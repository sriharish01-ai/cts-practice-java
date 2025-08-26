import java.util.*;
public class missingtagfromusercontent {
    public static List<Integer> ans(int[] arr,int n){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(i);
        }
        for(int p:arr){
            set.remove(p);
        }
        List<Integer> d=new ArrayList<>(set);
        Collections.sort(d);
        return d;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> res=ans(arr,n);
        System.out.print("[");
        for(int i=1;i<res.size();i++){
            System.out.print(res.get(i));
            if(i!=res.size()-1){
                System.out.print(",");

            }
        }
        System.out.print("]");

    }
}
/*
8
4 3 2 7 8 2 3 1

 */
