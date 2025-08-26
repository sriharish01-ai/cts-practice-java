import java.util.*;
public class rhymingword {
    public static String rhym(String s,String[] p){
        String best="No word";
        int len=0;
        int slen=s.length();
        for(String word:p){
            if(word.equals(s))
                continue;
            int wordlen=word.length();
            int min=Math.min(wordlen,slen);
            if(min<=len)
                continue;
            int matchelen=0;
            for(int i=0;i<min;i++){
                if(s.charAt(slen-i)==word.charAt(wordlen-i)){
                    matchelen++;
                }
                else{
                    break;
                }
            }
            if(matchelen>len && matchelen>0){
                len=matchelen;
                best=word;

            }



        }
        return best;


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        sc.nextLine();
        String[] p=new String[n];
        for(int i=0;i<n;i++){
            p[i]=sc.nextLine();

        }
        System.out.print(rhym(s,p));
    }
}
