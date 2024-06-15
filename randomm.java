import java.util.*;
public class randomm {
    public static void main(String args[])
    {
        // to generate number untill i get 7

        while(true)
        {
            int y = (int) (Math.random()*10 +1);
            if(y==7)
                break;
            if(y%4==0)
            {
                System.out.print("Hello " + "");
                continue;
            }
            System.out.print(y + " ");

        }
    }
}
