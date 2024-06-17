import java.util.*;

public class HQ9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int flag = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'H' || ch == '9' || ch == 'Q') {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("YES\n");
        else
            System.out.println("NO\n");
    }
}
