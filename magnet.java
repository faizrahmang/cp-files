import java.util.*;
class magnet{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String d = "";
        int count =0;
        for(int i=0;i<n;i++)
        {
            String j = sc.next();
            if(!d.equals(j))
            {
                count+=1;
                d=j;
            }
        }
        System.out.println(count);
    }
}