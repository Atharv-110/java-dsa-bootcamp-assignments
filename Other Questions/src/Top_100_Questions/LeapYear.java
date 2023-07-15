// Check whether or not year is a leap year or not

package Top_100_Questions;

// Logic:
// 1. if year is divisible by 400 => leap true
// 2. also if year is divisible by 4 and not by 100 => leap true
// 3. else not leap

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeap(2012));
    }
    
    private static boolean isLeap(int year) {
        if (year % 400 == 0) {
            return true;
        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            return true;
        }
        return false;
    }
}
