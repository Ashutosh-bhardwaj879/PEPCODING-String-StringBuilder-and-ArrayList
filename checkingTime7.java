
class main7 {
    public static void main(String[] args) {

        int n = 100000;

        long start1 = System.currentTimeMillis();

        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + i;
        }
        long end1 = System.currentTimeMillis();
        long duration1 = end1 - start1;
        System.out.println(duration1);

        // long start2 = System.currentTimeMillis();

        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < n; i++) {
        // sb.append("i");
        // }
        // long end2 = System.currentTimeMillis();
        // long duration2 = end2 - start2;
        // System.out.println(duration2);
    }
}