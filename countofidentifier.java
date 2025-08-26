import java.util.*;
public class countofidentifier {
    public static int countofidentifier(int num){
        int count=0;
        for(int m=1;m<=num;m++) {
            String str = String.valueOf(m);
            int starsum = 0;
            for (int i = 1; i <= str.length(); i++) {
                String prefix = str.substring(0, i);
                starsum += Integer.parseInt(prefix);
            }
            if (starsum > num) {
                count++;
            }
        }
            return count;


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print(countofidentifier(num));
    }
}
