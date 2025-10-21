import java.util.Scanner;

public class IfElseStatement {
    public static void main (String[] Args){
        Scanner sc = new Scanner(System.in);

        double income, tax;

        System.out.print("Enter your income for us to calculate your income tax: ");
        income = sc.nextDouble();

        if(income <= 2000){
            System.out.println("No income tax!");
        }
        else if (income > 2000 && income <= 3000){
            tax = (income - 2000) * 0.08;
            System.out.printf("Income tax: R$%.2f", tax);
        }
        else if (income > 3000 && income <= 4500){
            tax = 80 + ((income - 3000) * 0.18);
            System.out.printf("Income tax: R$%.2f", tax);
        }
        else{
            tax = 350 + ((income - 4500) * 0.28);
            System.out.printf("Income tax: R$%.2f", tax);
        }
    }
}
