import java.util.Scanner;

public class SwitchCase {
    public static void main (String[] Args){
        Scanner sc = new Scanner(System.in);

        int number;
        String dia;

        System.out.print("Digit a number from 1 to 7, to show which day of the week is: ");
        number = sc.nextInt();

        switch(number){
            case 1:
                dia = "Sunday";
                break;
            case 2:
                dia = "Monday";
                break;
            case 3:
                dia = "Tuesday";
                break;
            case 4:
                dia = "Wednesday";
                break;
            case 5:
                dia = "Thursday";
                break;
            case 6:
                dia = "Friday";
                break;
            case 7:
                dia = "Saturday";
                break;
            default:
                dia = "Invalid day";
        }
        System.out.println(dia);

    }
}
