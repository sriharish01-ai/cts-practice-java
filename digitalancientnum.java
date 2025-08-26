import java.util.*;
public class digitalancientnum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        while(number>9){
            int sum=0;
            while(number>0){
                int digit=number%10;
                sum+=digit;
                number=number/10;

            }
            number=sum;
        }
        System.out.print(number);
    }
}
