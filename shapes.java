import java.util.*;
public class shapes {
    public static void main(String args[]) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int summ=0;
        while(n-->0)
        {
            String h = sc.next();
            char d = h.charAt(0);
            if(d == 'C')
                summ+=6;
            else if(d=='T')
                summ+=4;
            else if(d=='D')
                summ+=12;
            else if(d=='O')
                summ+=8;
            else if(d=='I')
                summ+=20;
        }
        System.out.println(summ);
    }
}
