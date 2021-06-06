package base;

import java.util.Scanner;

public class CompoundInterest {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    CompoundInterest investment = new CompoundInterest();
    double initial = investment.getPrincipal();
    double rate = investment.getRate();
    int time = investment.getTime();
    int n = investment.getCompound();
    System.out.println(investment.total(initial, rate, time, n));
  }

  public double getPrincipal() {
    System.out.print("What is the principal? ");
    return input.nextDouble();
  }

  public double getRate() {
    System.out.print("What is the rate of interest? ");
    return input.nextDouble();
  }

  public int getTime() {
    System.out.print("How many years? ");
    return input.nextInt();
  }

  public int getCompound() {
    System.out.print("How many times per year is interest compounded? ");
    return input.nextInt();
  }

  public String total(double principal, double rate, int time, int n) {
    double finalAmt = principal * Math.pow((1 + rate / (100 * n)),(n * time));
    return String.format("After %d years at %.1f%%, the investment will be worth $%.2f", time, rate, finalAmt);
  }
}
