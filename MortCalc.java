//Simple Mortgage Calculator

package project1;

import java.util.*;
import java.text.NumberFormat;

public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner input = new Scanner(System.in);//Asking for users input
        System.out.println("Please enter your annual interest rate as a decimal. Ex. 9.3% = .093.");
        double anRate = input.nextDouble();//assigning variables
        System.out.println("Please enter the amount of years will the mortgage be held?");
        float nOY = input.nextFloat();
        System.out.println("Please enter the mortgage amount borrowed from the bank?");
        double M = input.nextInt();
       
        double mIR = (anRate / 12);//calculating monthly interest rate
        
        
        
        double mP = (mIR * M) / (1 - (1 / Math.pow((mIR + 1),(12 * nOY))));//calculating monthly payment

        
        
        double total = mP * 12 * nOY;//calculating total with interest
        double overP = total - M;//calculating total overpayment
        float oP = Math.round(overP * 100.0/total);//calculating total overpayment as a percentage
        
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        
        
        System.out.println("Here is a summary of your mortgage: ");
        System.out.println("Your Annnual interest rate is " + anRate * 100 + "%");
        System.out.println("Your Mortgage amount is " + currencyFormat.format(M));
        System.out.println("Your Monthly payment is " + currencyFormat.format(mP));
        System.out.println("Your Total payment will be " + currencyFormat.format(total));
        System.out.println("Your Overpayment is " + currencyFormat.format(overP));
        System.out.println("Your Overpayment percentage is " + oP + "%");
        

    }

}
