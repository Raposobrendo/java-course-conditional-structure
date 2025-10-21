import java.util.Scanner;

public class TernaryConditional {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        String theTrue;
        int wife;
        
        System.out.println("CONGRATULATIONS!!! YOU FOUND A EASTER EGG!!!");
        System.out.print("Who is Juzia true wife? 1 for BD, 2 for Bia: ");
        wife = sc.nextInt();
        if(wife >= 1 && wife <= 2){
            theTrue = (wife == 2) ? "You are wrong, BD is Juzia true wife." : "Obviously right.";
        }
        else{
            theTrue = "Probably wondered if both are... i know.";
        }

        System.out.println(theTrue);

        sc.close();
    }
}
