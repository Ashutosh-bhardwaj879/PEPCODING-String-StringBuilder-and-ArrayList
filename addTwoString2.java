import java.util.*;

class main2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = "hello";
        s1+="world";
        String s2 = "world";
        s2+='q';
        s2+=20;
        s2+=" qwerty";
        String s3 = s1 + " + " + s2;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("hello " + 10 + 20);
        System.out.println( 10 + 20 + " hello");
        scn.close();
    }
}