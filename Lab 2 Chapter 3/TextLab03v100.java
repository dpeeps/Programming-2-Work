// David Pieper 9/10/2018 Period 3B Lab 3 100 Point Version
// Finished & Submitted 9/14/18
// Version 1.0 9/4/2018 
// TextLab03st.java
// The Mortage Payment Program
// This the student, starting version of the TextLab03 assignment.


public class TextLab03v100
{
	public static void main(String args[])
	{
		System.out.println("TextLab03, 100 Point Version\n");
		double principal  = 259000;
		double annualRate = 5.75;
		double numYears   = 30;
      double monPayment = 0;
      double rateSquare = 0;
      double monRate  = 0;
      double numMonths = 0;
      double totalPayments = 0;
      double totalInterest = 0;
      numMonths = numYears * 12;
      monRate = annualRate/100;
      monRate = monRate/12;
      rateSquare = monRate + 1;
      rateSquare = Math.pow(rateSquare,numMonths);
      monPayment = (monRate*(rateSquare))/((rateSquare)-1) * principal;
      monPayment = Math.round(monPayment*100.00)/100.00;
      totalPayments = monPayment * numMonths;
      //System.out.println(totalPayments);
      totalInterest = totalPayments - principal;
      //System.out.println(totalInterest);
      monPayment = Math.round(monPayment * 100.00)/100.00;
      totalPayments = Math.round(totalPayments * 1.00);
      totalInterest = Math.round(totalInterest * 1.00);
      System.out.println("Principal:        $" + principal);
      System.out.println("Annual Rate:       " + annualRate + "%");
      System.out.println("Number of Years:   " + numYears);
      System.out.println("Monthly Payment:  $" + monPayment);
      System.out.println("Total Payments:   $" + totalPayments);
      System.out.println("Total Interest:   $" + totalInterest);
		System.out.println();
	}
}

