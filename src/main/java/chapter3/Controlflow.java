package chapter3;

public class Controlflow {

    //A block or compound statement consists of a number of Java statements, surrounded by a pair of braces.
    // Blocks define the scope of your variables. A block can be nested inside another block.
    // Here is a block that is nested inside the block of the main method:
    //public static void main(String[] args)
    // { int n;   . . .
    // { int k;      . . .   } // k is only defined up to here }
    //You may not declare identically named variables in two nested blocks.
    // public static void main(String[] args) {
    // int n;   . . .
    // {int k;      int n; // Error--can't redefine n in inner block  . . .   } }

    //if (yourSales >= target) {   performance = "Satisfactory";   bonus = 100; }
    // In this code all the statements surrounded by the braces will be executed when yourSales is greater than or
    // equal to target

    //The while loop executes a statement (which may be a block statement) while a condition is true.
    // The while loop will never execute if the condition is false at the outset
    // while (balance < goal){
    // balance += payment;
    // double interest = balance * interestRate / 100;
    // balance += interest;
    // years++; }
    // System.out.println(years + " years.");

    // If you want to make sure a block is executed at least once, you need to move the test to the bottom,
    // using the do/while loop.
    //do statement while (condition); This loop executes the statement (which is typically a block) and only
    //then tests the condition. If it’s true, it repeats the statement and retests the condition, and so on.
    //do {
    // balance += payment;
    // double interest = balance * interestRate / 100;
    // balance += interest;
    // year++;
    // print current balance   . . .
    // ask if ready to retire and get input   . . . }
    // while (input.equals("N"));
    // As long as the user answers "N", the loop is repeated

    //The for loop is a general construct to support iteration controlled by a counter or similar variable
    // that is updated after every iteration
    // for (int i = 1; i <= 10; i++)
    // System.out.println(i);
    //The first slot of the for statement usually holds the counter initialization.
    // The second slot gives the condition that will be tested before each new pass through the loop, and
    // the third slot specifies how to update the counter.
    //A for loop is merely a convenient shortcut for a while loop.

    //The if/else construct can be cumbersome when you have to deal with multiple selections with many alternatives.
    // Java has a switch statement. For example:
    //Scanner in = new Scanner(System.in);
    // System.out.print("Select an option (1, 2, 3, 4) ");
    // int choice = in.nextInt(); switch (choice) {
    // case 1:      . . .
    // break;
    // case 2:      . . .
    // break;
    // case 3:      . . .
    // break;
    // case 4:      . . .
    // break;
    // default:
        // bad input      . . .
    // break;

    //A case label can be
    // A constant expression of type char, byte, short, or int
    // An enumerated constant
    // Starting with Java SE 7, a string literal For example,
    //String input = . . .; switch (input.toLowerCase()) {
    // case "yes": // OK since Java SE 7      . . .
    // break;   . . . }

    //  The continue statement transfers control to the header of the innermost enclosing loop.
    //  the continue statement breaks the regular flow of control
    //  Here is an example:
    //Scanner in = new Scanner(System.in);
    // while (sum < goal) {
    // System.out.print("Enter a number: ");
    // n = in.nextInt();
    // if (n < 0) continue;
    // sum += n; // not executed if n < 0 }
    // If n < 0, then the continue statement jumps immediately to the loop header, skipping the remainder
    // of the current iteration. If the continue statement is used in a for loop, it jumps to the “update” part of the
    // for loop


}
