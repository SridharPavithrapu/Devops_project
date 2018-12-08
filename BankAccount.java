package ca.uwo.csd.cs2212.USERNAME;

public class BankAccount {

  private double balance;
  private double amount;

  public BankAccount(double balance) {
    this.balance = balance;
  }

  public double debit(double amount) {
    if (balance < amount) {
      amount = balance;
    }

    balance -= amount;
    return amount;
  }

}