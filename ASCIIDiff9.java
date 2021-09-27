import java.util.*;

class main9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(ASCIIDiff(s));
        scn.close();
    }

    public static String ASCIIDiff(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i - 1);
            int diff = curr - prev;
            sb.append(diff);
            sb.append(curr);
        }
        return sb.toString();
    }
}