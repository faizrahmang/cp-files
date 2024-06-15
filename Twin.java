import java.util.*;
public class Twin {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Integer arr[] = new Integer[num];
        int summ=0;
        for(int i=0;i<num;i++)
        {
            arr[i] = sc.nextInt();
            summ+=arr[i];
        }
        Arrays.sort(arr , Collections.reverseOrder());
        int min=0;
        int c=0;
        for(int i=0;i<num;i++)
        {
            min+=arr[i];
            summ-=arr[i];
            c++;
            if(min > summ)
                break;
        }
        System.out.println(c);
        sc.close();
    }
}
