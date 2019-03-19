package chapter3;

public class Strings {
    //strings are sequences of Unicode characters
    //String e = ""; // an empty string String greeting = "Hello";
    //You can extract a substring from a larger string with the substring method of the String class. For example,
    //String greeting = "Hello";
    // String s = greeting.substring(0, 3); creates a string consisting of the characters "Hel".
    //The second parameter of substring is the first position that you dont want to copy.we copied positions 0, 1, and 2
    //adding strings
    //int age = 13;
    // String rating = "PG" + age; sets rating to the string "PG13".
    //System.out.println("The answer is " + answer);

    // multiple strings together, separated by a delimiter, use the static join method:
    //String all = String.join(" / ", "S", "M", "L", "XL");    // all is the string "S / M / L / XL"

    // (greeting = hello in last chapter)
    //greeting = greeting.substring(0, 3) + "p!";
    // This declaration changes the current value of the greeting variable to "Help!".

    //To test whether two strings are equal, use the equals method; s.equals(t)
    //To test whether two strings are identical except for the upper/lowercase letter distinction, use equalsIgnoreCase
    //"Hello".equalsIgnoreCase("hello")
    //The empty string "" is a string of length 0. test whether a string is empty by calling
    //if (str.length() == 0) or if (str.equals(""))
    // To test whether a string is null, use the condition
    //if (str == null) if you need to test that a string is neither null nor empty. Then use the condition
    //if (str != null && str.length() != 0)

    //The length method yields the number of code units required for a given string in the UTF-16 encoding. For example:
    //String greeting = "Hello"; int n = greeting.length(); // is 5.
    // To get the true length—that is, the number of code points—call
    //int cpCount = greeting.codePointCount(0, greeting.length());
    // The call s.charAt(n) returns the code unit at position n, where n is between 0 and s.length() – 1. For example:
    //char first = greeting.charAt(0); // first is 'H' char last = greeting.charAt(4); // last is 'o'
    // To get at the ith code point, use the statements
    //int index = greeting.offsetByCodePoints(0, i); int cp = greeting.codePointAt(index);

    //API document

    //Follow these steps if you need to build a string from many small pieces. First, construct an empty string builder:
    //StringBuilder builder = new StringBuilder(); Each time you need to add another part, call the append method.
    //builder.append(ch); // appends a single character
    // builder.append(str); // appends a string When you are done building the string, call the toString method.
    // You will get a String object with the character sequence contained in the builder.
    //String completedString = builder.toString();

}
