package chapter3;

public class Arrays {
    //An array is a data structure that stores a collection of values of the same type.
    // You access each individual value through an integer index.
    // ex.  if a is an array of integers, then a[i] is the ith integer in the array.
    // Declare an array variable by specifying the array type—which is the element type followed by []—and the
    // array variable name
    // Use the new operator to create the array.
    //int[] a = new int[100]; declares and intializes an array of 100 integers

    // Once the array is created, you can fill the elements in an array, for example, by using a loop:
    //int[] a = new int[100]; for (int i = 0; i < 100; i++)   a[i] = i; // fills the array with numbers 0 to 99

    //When you create an array of numbers, all elements are initialized with zero.
    // Arrays of boolean are initialized with false.

    //To find the number of elements of an array, use array.length. For example:
    //for (int i = 0; i < a.length; i++)   System.out.println(a[i]);

    //Once you create an array, you cannot change its size

    //Java has a powerful looping construct that allows you to loop through each element in an array
    //without having to fuss with index values. The enhanced for loop
    //for (variable : collection) statement sets the given variable to each element of the collection and then
    // executes the statement
    // The collection expression must be an array or an object of a class that implements the Iterable interface,
    // such as ArrayList. For example,
    //for (int element : a)
    //System.out.println(element);
    // prints each element of the array a on a separate line

    //Java has a shortcut for creating an array object and supplying initial values at the same time.
    // Here’s an example of the syntax at work:
    //int[] smallPrimes = { 2, 3, 5, 7, 11, 13 };
    // smallPrimes = new int[] { 17, 19, 23, 29, 31, 37 }; is shorthand for
    //int[] anonymous = { 17, 19, 23, 29, 31, 37 }; smallPrimes = anonymous;

    //You can copy one array variable into another, but then both variables refer to the same array:
    //int[] luckyNumbers = smallPrimes; luckyNumbers[5] = 12; // now smallPrimes[5] is also 12
    // The second parameter is the length of the new array. A common use of this method is to increase the size of
    // an array:
    //luckyNumbers = Arrays.copyOf(luckyNumbers, 2 * luckyNumbers.length);

    //Every Java program has a main method with a String[] args parameter. This parameter indicates that the main method
    // receives an array of strings—namely, the arguments specified on the command line.

    // To sort an array of numbers, you can use one of the sort methods in the Arrays class:
    //int[] a = new int[10000]; . . . Arrays.sort(a)

    // Multidimensional arrays use more than one index to access array elements.
    // They are used for tables and other more complex arrangements
    // Java has no multidimensional arrays at all, only one-dimensional arrays.
    // Multidimensional arrays are faked as “arrays of arrays.”
    //It is also easy to make “ragged” arrays—that is, arrays in which different rows have different lengths.
    

}
