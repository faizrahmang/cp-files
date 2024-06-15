import java.util.*;
public class ArrivalOfGeneral{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List <Integer> arr = new ArrayList<>();
        for(int i=0;i<num;i++)
        {
            arr.add(sc.nextInt());
        }
        int minn = arr.lastIndexOf(Collections.min(arr));
        int maxx = arr.indexOf(Collections.max(arr));
        int summ  = maxx + num-1 - minn;
        if(minn < maxx)
            summ-=1;
        System.out.println(summ);
        
    }
}