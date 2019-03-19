package chapter3;

public class Operators {

    // usual arithmetic operators +, -, *, / are used in Java for addition, subtraction, multiplication, and division.
    //Integer remainder (modulus) is denoted by %. For example, 15 / 2 is 7, 15 % 2 is 1
    //the Math class contains different mathematical functions; Math.sqrt() is used to square root an int
    //to raise a number to another number, you must use Math.pow(y,x), sets y to be raised by the x
    //both methods are type double so they return doubles.
    //The floorMod method makes it easier: floorMod(position + adjustment, 12) always yields a value between 0 and 11.

    //trig functions:Math.sin Math.cos Math.tan Math.atan Math.atan2
    // exponential function with its inverse, the natural logarithm, as well as the decimal logarithm:
    //Math.exp Math.log Math.log10
    //two constants denote the closest possible approximations to the mathematical constants π and e:
    //Math.PI Math.E

    //conversions
    //byte can go to short, short and char can go to int, int can go to long and double, float can go to double !with
    //no info lost!
    //int and long can go to float, long can go to double !precision will be lost!
    /*When two values are combined with a binary operator (like int and float),
    both operands are converted to a common type before the operation is carried out.
    //If either of the operands is of type double, the other one will be converted to a double.
    //if either of the operands is of type float, the other one will be converted to a float.
    //if either of the operands is of type long, the other one will be converted to a long.
    //Otherwise, both operands will be converted to an int.
     */

    // Conversions in which loss of information is possible are done by means of casts. The syntax for casting
    // is to give the target type in parentheses, followed by the variable name. For example:
    //double x = 9.997; int nx = (int) x;
    //Now, the variable nx has the value 9 because casting a floating-point value to an integer discards the fractional
    //part.

    //If you want to round a floating-point number to the nearest integer, use the Math.round method:
    //double x = 9.997; int nx = (int) Math.round(x);
    // Now the variable nx has the value 10. You still need to use the cast (int) when you call round.
    // reason is that the return value of the round method is a long, and a long can only be assigned to an int with
    // an explicit cast

    //x += 4; is equivalent to x = x + 4;

    //n++ adds 1 to the current value, and n-- subtracts 1 from it. For example, the code int n = 12; n++;

    // The prefix form does the addition first; the postfix form evaluates to the old value of the variable.
    //int m = 7; int n = 7;
    //int a = 2 * ++m; now a is 16, m is 8 int b = 2 * n++; // now b is 14, n is 8

    //3 == 7 is false. Use a != for inequality

    //the usual < (less than), > (greater than), <= (less than or equal), and >= (greater than or equal) operators.
    // && is and || is or; the second part of the && || expression is never evaluated if the first part is true

    // ternary ?: operator. The expression condition ? expression1 : expression2
    //evaluates to the first expression if the condition is true, to the second expression otherwise. For example,
    //x < y ? x : y gives the smaller of x and y.

    //with integer types, you have operators that can work directly with the bits that make up the integers.
    // This means that you can use masking techniques to get at individual bits in a number. The bitwise operators are
    //& ("and")
    //| ("or")
    //^ ("xor")
    //~ ("not")
    // These operators work on bit patterns. For example, if n is an integer variable, then
    //int fourthBitFromRight = (n & 0b1000) / 0b1000;
    // gives you a 1 if the fourth bit from the right in the binary representation of n is 1, and 0 otherwise.
    // Using & with the appropriate power of 2 lets you mask out all but a single bit.
    //There are also >> and << operators which shift a bit pattern to the right or left
    //int fourthBitFromRight = (n & (1 << 3)) >> 3; convenient when u need to build up bit patters for bit masking
    //Finally, a >>> operator fills the top bits with zero, unlike >> which extends the sign bit into the top bits

    //If no parentheses are used, operations are performed in the hierarchical order indicated. Operators on the same
    // level are processed from left to right; there are some exceptions

    //An enumerated type has a finite number of named values. For example:
    //enum Size { SMALL, MEDIUM, LARGE, EXTRA_LARGE }; Now you can declare variables of this type:
    //Size s = Size.MEDIUM;

}
