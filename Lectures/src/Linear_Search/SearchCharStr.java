// Search a particular character in array
package Linear_Search;

public class SearchCharStr {
    public static void main(String[] args) {
        String str = "Hello World";
        char ch = 'o';
        boolean ans = find_Char(str, ch);
        if (ans == true) {
            System.out.println("Character Found");
        }
        else {
            System.out.println("Character not Found");
        }
    }

    static boolean find_Char(String str, char ch) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
