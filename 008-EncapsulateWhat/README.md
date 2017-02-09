# java-codecool / 008-EncapsulateWhat

Problem
Write a program that simulates a “balance” in a simple banking system.

You’ll be required to write three classes.

Main,

Balance,

and Transaction.

Balance
Any change to a Balance instance is recorded as a Transaction. The Balance class hides, encapsulates that it’s implemented using Transaction objects.

It has the following methods.

void receiveSalary(String,int) - records a positive transaction.

void payForProduct(String,int) - records a negative transaction.

int getCurrentBalance() - calculates and returns the current balance.

Transaction
A Transaction holds data about a transaction,

a transaction message — String message,

and the transacted amount — int amount.

When receiving money amount is a positive number,

otherwise it’s negative.

Create getters for these properties.

No setters required.

Main
The Main class will use a Balance object and simulate balance operations, e.g. receiving money from your employer, paying for food at the grocery store, etc.

Example
Balance balance = ...
balance.receiveSalary("Good job mate!", 1000);
balance.payForProduct("Milk and eggs", 10);
System.out.println("Your balance is: " + balance.getCurrentBalance());
Previous Next