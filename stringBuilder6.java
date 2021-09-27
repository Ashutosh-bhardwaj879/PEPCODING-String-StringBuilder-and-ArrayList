import java.util.*;

class main6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scn.nextLine());
        // get
        char ch1 = sb.charAt(0);
        System.out.println(ch1);
        // set
        sb.setCharAt(1, 'd');
        System.out.println(sb);
        // insert
        sb.insert(2, 'y');
        System.out.println(sb);
        // remove
        sb.deleteCharAt(2);
        System.out.println(sb);
        // add at last character
        sb.append('g');
        System.out.println(sb);
        // length
        System.out.println(sb.length());
        scn.close();
    }
}