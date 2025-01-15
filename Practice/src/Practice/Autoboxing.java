package Practice;
import java.util.ArrayList;

public class Autoboxing {
    public static void main(String[] args) {
        ArrayList<Character> charList = new ArrayList<>();
        charList.add('C'); // Autoboxing
        charList.add('D');
        
        for (Character ch : charList) {
            char primitiveCh = ch; // Unboxing
            ch = primitiveCh;
            System.out.println(ch);
        }
        
        
        
     // Using primitive type
        int primitiveInt = 5;

        // Using wrapper class
        Integer wrapperInt = primitiveInt;

        // Converting back to primitive type
        int convertedInt =wrapperInt;
        System.out.println(convertedInt);

    }
}
