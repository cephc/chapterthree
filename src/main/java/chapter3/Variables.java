package chapter3;

public class Variables {
    //In Java, every variable has a type. You declare a variable by placing the type first, followed by the name
    // of the variable. name must begin with a letter and must be a sequence of letters or digits.
    //can declare multiple variables on a single line (int i, j) however not recommended;

    //After you declare a variable, you must explicitly initialize it by means of an assignment statement
    //You assign to a previously declared variable by using the variable name on the left, an equal sign (=),
    // and then some Java expression with an appropriate value on the right. (int vacationDays; vacationDays = 12;)
    //You can both declare and initialize a variable on the same line. For example: (int vacationDays = 12;)
    //you can put declarations anywhere in your code.

    //in java you use the keyword final to denote a constant, example
    /* public class Constants {
     public static void main(String[] args){
     final double CM_PER_INCH = 2.54;
     double paperWidth = 8.5;
     double paperHeight = 11;
     System.out.println("Paper size in centimeters:" + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
     }
     } */
    //final indicates that you can assign to the variable once, and then that value is set once and for all
    //customary to name all constants in upper case;set us class constant with the keywords "static final" ex..
    /*public class Constants2 {
    public static final double CM_PER_INCH = 2.54;
    public static void main(String[] args){
    double paperWidth = 8.5;
    double paperHeight = 11;
    System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);*/
    //the definition of the class constant appears outside the main method; so constant can be used in other methods
    // of the same class


}
