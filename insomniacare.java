import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class insomniacare {
    public static void main(String args[]) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int p = Integer.parseInt(br.readLine());
        int q = Integer.parseInt(br.readLine());
        int r = Integer.parseInt(br.readLine());
        int s = Integer.parseInt(br.readLine());
        int tot = Integer.parseInt(br.readLine());
        if(p==1)
        {
            System.out.println(tot);
        }
        else
        {
            Set<Integer> has = new HashSet<>();
            int i=1;
            while(i*p<=tot)
            {
                has.add(i*p);
                i++;
            }
            i=1;
            while(i*q<=tot)
            {
                has.add(i*q);
                i++;
            }
            i=1;
            while(i*r<=tot)
            {
                has.add(i*r);
                i++;
            }
            i=1;
            while(i*s<=tot)
            {
                has.add(i*s);
                i++;
            }
            System.out.println(has.size());
        }
    }
}
