import java.util.*;

class main4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = "malayalam";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (isPalindrome(s.substring(i, j)) == true) {
                    System.out.print(s.substring(i, j) + "  ");
                }
            }
        }
        scn.close();
    }

    public static boolean isPalindrome(String s) {
        int l = 0;
        int h = s.length() - 1;
        while (l <= h) {
            if (s.charAt(l) != s.charAt(h)) {
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
}