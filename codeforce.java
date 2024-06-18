import java.util.*;
import java.lang.*;
import java.io.*;
public class codeforce {
    public static void main(String args[]) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String h = br.readLine();
        String h1[] = h.split("");
        
        Set <String> arr = new HashSet<String>();
        Collections.addAll(arr, h1);
        System.out.println(arr);
        
        arr.remove(",");
        arr.remove("{");
        arr.remove("}");
        int size = arr.size();
        if(size<=0)
            System.out.println(0);
        else
            System.out.println(size);
    }
}
