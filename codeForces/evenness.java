import java.io.*;
import java.util.*;
public class evenness {
    public static void main(String args[]) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();
        int oddIndex=-1 , evenIndex=-1;
        int odd=-1,even=-1;
        int i=1;
        while(i<=n)
        {
            int u = sc.nextInt();
            if((u&1)==1)
            {
                oddIndex++;
                odd=i;
            }
            else
            {
                evenIndex++;
                even=i;
            }
            i++;
        }
        if(oddIndex>evenIndex)
        {
            System.out.println(even);
        }
        else
            System.out.println(odd);
    }
}
