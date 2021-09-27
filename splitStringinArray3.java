import java.util.*;

class filename {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = "psab878@gmail.com";
        String[] arr = s.split("@");

        System.out.println("Username : " + arr[0]);
        System.out.println("Domain   : " +arr[1]);

        scn.close();
    }
}