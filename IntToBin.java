/** Returns the binary representation of a given integer. */
public class IntToBin {

    public static void main(String[] args) {
        //int x = 13;
        int x = Integer.parseInt(args[0]);
        System.out.println("Binary representation of " + x + " is: " + toBinary(x));
    }

    /** Returns the binary representation of the given integer, as a string of 0's and 1's.  */
    public static String toBinary(int x) {
        String s = "";
        if (x == 1) return s = "1" + s;
        if (x == 0) return s = "0" + s;

        if (x >= 2)
        {
            if (x % 2 != 1 && x >= 0) s = "0";

            if (x % 2 == 1 && x >= 1) s = "1";

            return toBinary(x / 2) + s;
        }
        return s;
    }
 }
