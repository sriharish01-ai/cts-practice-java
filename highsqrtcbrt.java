import java.util.*;
public class highsqrtcbrt {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mathsquareroot=(int)Math.floor(Math.sqrt(n));
        int high=mathsquareroot*mathsquareroot;
        int mathcuberoot=(int)Math.floor(Math.cbrt(n));
        int highh=mathcuberoot*mathcuberoot*mathcuberoot;
        int sum=high+highh;
        System.out.print(sum);

    }
}
