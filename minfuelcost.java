import java.util.*;
public class minfuelcost {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int numberofpersons=sc.nextInt();
        int buslitre=sc.nextInt();
        int shuttlelitre=sc.nextInt();
        int mincost=Integer.MAX_VALUE;
        for(int buses=0;buses<=numberofpersons/80+1;buses++){
            int remaining=numberofpersons-(buses*80);
            int shuttle=0;
            if(remaining>0){
                shuttle=(int)Math.ceil((double)remaining/8);

            }
            int totalcost=(buses*buslitre + shuttle*shuttlelitre)*75;
            if((buses*80 + shuttle*8)>=numberofpersons ){
                 mincost=Math.min(mincost,totalcost);
            }

        }
        System.out.print(mincost);



    }

}
