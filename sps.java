import java.util.*;
public class sps {
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("WELCOME TO STONE PAPER SCISSOR GAME");
    System.out.println("INSTRUCTIONS FOR USER");
    System.out.print("1. This Game consists of 5 rounds\n 2. Each time the winner will be displayed along the option both the computer and the user takes");
    System.out.println("3. User can input s for stone , k for scissor and p for paper" );
    System.out.println("The overall winner will be Displayed at last\n BEST OF LUCK !\n");
    int i=0;
    char arr[] = {'p','s','k'};
        Random random = new Random();
    int compScore =0,userScore =0;
    while(i++<5)
    {
        char st = sc.next().charAt(0);
        int h = random.nextInt(arr.length);
        char cp = arr[h];
        String u = (st=='k')?"Scissor" : (st=='s')? "Stone" : "Paper";
        String comp = (cp=='k')?"Scissor" : (cp=='s')? "Stone" : "Paper";
        System.out.println("User played : " + u);
        System.out.println("Computer played :" + comp);
        int flag=0;
        if(u == comp)
        {
            System.out.println("This round Draw");
            continue;
        }
        else if(u=="Scissor")
        {
            if(comp=="Paper")
            {
                flag=1;
            }

        }
        else if(u=="Paper")
        {
            if(comp=="Stone")
            {
                flag=1;
            }
        }
        else if(u=="Stone")
        {
            if(comp=="Scissor")
            {
                flag=1;
            }
        }
        if(flag==1)
        {
            System.out.println("User Wins this round");
            userScore++;
        }
        else
        {
            System.out.println("Computer Wins this round");
            compScore++;
        }

    }
    if(userScore>compScore)
    {
        System.out.println("USER WINS!");
    }
    else
        System.out.println("COMPUTER WINS");
    sc.close();
    }

}
