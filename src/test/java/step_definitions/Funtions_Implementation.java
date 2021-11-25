package step_definitions;

import java.util.ArrayList;
import java.util.List;


public class Funtions_Implementation {



    public static void check_Multiplier_Function(){

        int numArray[] = {23, 36, 56, 78, 100, 34, 10, 87, 45, 88, 4, 6, 12, 24, 28};
        Integer temp[] = filter_Mutlipliers_Numbers(numArray);

        System.out.println("List of All returned multiplier Numbers ");
        for (int z = 0; z < temp.length; z++) {
            System.out.print(temp[z] + " ");
        }
    }

    public static Integer[] filter_Mutlipliers_Numbers(int numArray[]) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < numArray.length; i++) {

            if (numArray[i] % 4 == 0 && numArray[i] % 6 == 0) {      // in this if statement checks if number is multipliers of both(4,6)
                System.out.println(numArray[i] + "  is mulitpier of both 4 & 6");
                list.add(numArray[i]);
                continue;                                                             // due to Continue loop will rotate again instead go down
            } else if (numArray[i] % 4 == 0) {
                System.out.println(numArray[i] + "  is Multiplier of 4");  // in this if statement checks if number is multipliers of 4)
                list.add(numArray[i]);
            }
            if (numArray[i] % 6 == 0) {
                System.out.println(numArray[i] + " is Multiplier of 6");  // in this if statement checks if number is multipliers of 6)
                list.add(numArray[i]);
            }

        }
        System.out.println("**************************************");
        return list.toArray(new Integer[0]);
    }



    public  static boolean check_Palindrome_String(String originalString) {

        String temp_String = "";


        System.out.println("The original String is " + originalString);
        originalString = originalString.toLowerCase();                  // whole string is converted to lower case to avoid the capital and lower letter difference

        for (int i = originalString.length() - 1; i >= 0; i--) {            // This loop reverse the whole original string
            temp_String = temp_String + originalString.charAt(i);
        }

        if (temp_String.equals(originalString)) {                    //  comparision of original string and reverse String
            System.out.println("Reverse String is "+temp_String+"\nso the String is palindrome");
            return true;
        } else {
            System.out.println("Reverse String is "+temp_String+ "\nso the String is not palindrome");
            return false;
        }


    }
}