import java.util.*;

class main5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(compression1(s));
        System.out.println(compression2(s));
        scn.close();
    }

    public static String compression1(String s) {

        String result = s.charAt(0) + "";
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i - 1);
            if (curr != prev) {
                result += curr;
            }
        }
        return result;
    }

    public static String compression2(String s) {
        int count = 1;
        String res = s.charAt(0) + "";

        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i - 1);

            if (curr == prev) {
                count++;
            } else {
                if (count > 1) {
                    res += count;
                    count = 1;
                }
                res += curr;
            }
        }
        if (count > 1) {
            res += count;
            count = 1;
        }
        return res;
    }
}