import java.util.Scanner;

public class CumulativeAttribution {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        double bill = 50;
        int minutes;

        System.out.print("How much minutes consumed on cell phone? ");
        minutes = sc.nextInt();

        if(minutes > 100){
            bill += (minutes - 100) * 2;
            //Cumulative attribution here. Example: a = a + b equals a += b
            System.out.printf("Cell phone bill: %.2f", bill);
        }
        else{
            System.out.print("Cell phone bill: R$ 50.00");
        }




    }
}
