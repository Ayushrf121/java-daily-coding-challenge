public class ShortestPath {
    public static float SPL(String str) {
        int x = 0, y = 0;
        float z;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'W') {
                x = x - 1;
            } else if (str.charAt(i) == 'E') {
                x = x + 1;
            }
            if (str.charAt(i) == 'N') {
                y = y + 1;
            }
            if (str.charAt(i) == 'S') {
                y = y - 1;
            }
        }
        z = x * x + y * y;

        return (float) Math.sqrt(z);
    }

    public static void main(String[] args) {
        String str = new String("WNEENESENNN");
        System.out.println(str);
        System.out.println("The shortest Path : " + SPL(str));
    }
}
