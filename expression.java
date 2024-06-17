import java.util.*;
import java.lang.*;
import java.io.*;

public class expression{
    public static void main(String args[]) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine().trim());
        int b = Integer.parseInt(br.readLine().trim());
        int c = Integer.parseInt(br.readLine().trim());
        int s1 = ((a*b*c) > (a+b+c))? (a*b*c) : (a+b+c);
        int s2 = ((a*b+c) > (a+b*c))? (a*b+c) : (a+b*c);
        int s3 = (((a+b)*c) > (a*(b+c)))? ((a+b)*c) : (a*(b+c));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int summ=0;
        if(s1>s2)
            summ=s1;
        else
            summ=s2;
        if(summ<s3)
            summ=s3;
        //System.out.println(summ);
        bw.write(String.valueOf(summ));
        bw.flush();
        bw.close();
        br.close();
        
    }
}