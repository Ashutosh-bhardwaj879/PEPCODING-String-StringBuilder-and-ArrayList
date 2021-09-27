import java.util.*;

class main11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(scn.nextInt());
        }
        solution(al);
        System.out.println(al);
        scn.close();
    }

    public static void solution(ArrayList<Integer> s) {
        for (int i = s.size() - 1; i >= 0; i--) {
            int val = s.get(i);
            if (isPrime(val) == true) {
                s.remove(i);
            }
        }
    }

    public static boolean isPrime(int val) {
        for (int div = 2; div * div <= val; div++) {
            if (val % div == 0) {
                return false;
            }
        }
        return true;
    }
}