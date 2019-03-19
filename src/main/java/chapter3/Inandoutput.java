package chapter3;

public class Inandoutput {

    // To read console input, you first construct a Scanner that is attached to System.in:
    //Scanner in = new Scanner(System.in);
    //Now you can use the various methods of the Scanner class to read input. the nextLine method reads a line of input.
    //System.out.print("What is your name? "); String name = in.nextLine();
    // Here, we use the nextLine method because the input might contain spaces. To read a single word, call
    //String firstName = in.next(); To read an integer, use the nextInt method.
    //System.out.print("How old are you? "); int age = in.nextInt(); Similarly, the nextDouble method reads the next
    //floating-point number. The program in Listing 3.2 asks for the user’s name and age and then prints a message like
    //Hello, Cay. Next year, you'll be 57 Finally, note the line
    //import java.util.*

    //You can print a number x to the console with the statement System.out.print(x).
    // That command will print x with the maximum number of nonzero digits for that type. For example,
    //double x = 10000.0 / 3.0; System.out.print(x); prints
    //3333.3333333333335
    //printf method (which you can supply mult. parameters to; the call
    //System.out.printf("%8.2f", x); prints x with a field width of 8 characters and a precision of 2 characters.
    // That is, the printout contains a leading space and the seven characters
    //3333.33
    //You can use the static String.format method to create a formatted string without printing it:
    //String message = String.format("Hello, %s. Next year, you'll be %d", name, age);

    //To read from a file, construct a Scanner object like this:
    //Scanner in = new Scanner(Paths.get("myfile.txt"), "UTF-8");
    // If the file name contains backslashes, remember to escape each of them with an additional backslash:
    // "c:\\mydirectory\\myfile.txt".
    //To write to a file, construct a PrintWriter object. In the constructor, supply the file name and the character
    // encoding:
    //PrintWriter out = new PrintWriter("myfile.txt", "UTF-8");
    // If the file does not exist, it is created. You can use the print, println, and printf commands.

}
