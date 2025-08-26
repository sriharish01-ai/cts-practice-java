import java.util.*;
public class gpsequnece {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int z=sc.nextInt();
        int term= a;
        ArrayList<Integer> result=new ArrayList<>();
        StringJoiner sd=new StringJoiner(",","{","}");
        while(term<=z){
            sd.add(String.valueOf(result));
            term*=b;

        }
        System.out.print(sd);
    }
}
