import java.util.*;
public class combinationofmarbles {
    public static int select(int n,int m,int p){
        HashSet<Integer> set=new HashSet<>();
        Queue<Integer> queue=new LinkedList<>();
        set.add(n);
        queue.add(n);
        while(!queue.isEmpty()){
            int s=queue.poll();
            int nextA=s-m;
            if(nextA>0 && !set.contains(nextA)){
                set.add(nextA);
                queue.add(nextA);
            }
            int nextB=s-p;
            if(nextB>0 && !set.contains(nextB)){
                set.add(nextB);
                queue.add(nextB);
            }
        }
        return set.size();

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int p=sc.nextInt();
        System.out.print(select(n,m,p));

    }
}
