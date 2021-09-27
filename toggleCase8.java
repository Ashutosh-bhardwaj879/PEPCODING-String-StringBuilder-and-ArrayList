import java.util.*;

class main8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // String str = scn.nextLine();
        StringBuilder str = new StringBuilder(scn.nextLine());
        System.out.println(toggleCase(str));
        scn.close();
    }

    // public static String toggleCase(String s)
    public static StringBuilder toggleCase(StringBuilder s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                char lower = (char) (ch + 'a' - 'A');
                sb.setCharAt(i, lower);
            } else if (ch >= 'a' && ch <= 'z') {
                char upper = (char) (ch + 'A' - 'a');
                sb.setCharAt(i, upper);
            }
        }
        // return sb.toString();
        return sb;
    }
}