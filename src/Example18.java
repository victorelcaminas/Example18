import java.util.Scanner;
class Example18 {
    public static void main (String [] argv) {
         int payment, workHours;

        //Reading value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        System.out.println("Enter price per hour in €");
        payment = inputValue.nextInt();

        inputValue = new Scanner(System.in);
        System.out.println("Enter hours that you work");
        workHours = inputValue.nextInt();

        double grossPay;

        if (workHours < 35) {
            grossPay = payment*workHours;
        } else {
            grossPay = 35 * payment;
            double extraPaymentTax = payment * 1.5;
            double extraPayment = (workHours - 35) * extraPaymentTax;
            grossPay = grossPay + extraPayment;
        }
        
        double netPay,taxes;

        if (grossPay < 500) {
            taxes = 0;
        } else if (grossPay < 900 ) {
            taxes = (grossPay-500)*0.25;
        } else {
            taxes = 400 * 0.25 + (grossPay - 900) * 0.45;
        }
        
        netPay = grossPay - taxes;

        System.out.println("Your gross payment is " + grossPay);
        System.out.println("Your net payment is " + netPay);
        System.out.println("Your taxes are "  + taxes);

    }
}
