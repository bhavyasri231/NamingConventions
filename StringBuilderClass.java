import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class StringBuilderClass {
    public static void main(String[] args) throws Exception
    {
        StringBuilder str = new StringBuilder();

        str.append("bhavya");//adding a string to string buffer

        System.out.println("String = " + str.toString());

        StringBuilder str1 = new StringBuilder("Sri");//directly added a string through a constructor

        System.out.println("String1 = " + str1.toString());

        StringBuilder str2 = new StringBuilder(10);//building with a capacity

        System.out.println("String2 capacity = " + str2.capacity());

        StringBuilder str3 = new StringBuilder(str1.toString());

        System.out.println("String3 = " + str3.toString());

        StringBuilder reverseStr = str.reverse();//reversing the string

        System.out.println("Reverse String = " + reverseStr);

        String reversed = reverseStr.toString();

        System.out.println("Modified StringBuilder = " + reversed);

    }
}
/*by using the naming convention it will be very easy to understand the code with less number of comments . so it is
suggested to use naming conventions like
clases = Nouns
functions = verb
variables = for what it is used for
        so, the when other programmers see your code they are easily able to understand the logic behing the code
 */
