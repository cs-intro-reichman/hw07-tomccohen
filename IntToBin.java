/** Returns the binary representation of a given integer. */
public class IntToBin {

    public static void main(String[] args) {
        //int x = 13;
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        System.out.println("Binary representation of " + x + " is: " + toBinary(x));
        System.out.println("Binary representation of " + x + " is: " + toBin(y));
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
    
    public static String toBin(int y) {
        String s = "";
        if (y == 1) return s = "1" + s;
        if (y == 0) return s = "0" + s;

        return toBin(y / 2) + y % 2;
    }
 }
