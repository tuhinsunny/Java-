public class datatypes {
    public static void main(String[] args) {
        // Primitive Data Types -> They are of fixed length
        byte num1 = 127; // 1 byte (-128 to 127)
        short num2 = 32767; // 2 bytes
        int num3 = 2147483647; // 4 bytes
        long num4 = 9223372036854775807L; // 8 bytes
        float num5 = 3.4028235E38f; // 4 bytes
        double num6 = 1.7976931348623157E308; // 8 bytes
        char letter = 'A'; // 2 bytes
        boolean flag = true; // 1 bit

        // Non-Primitive Data Types -> They are of variable length
        // They can be declared using the 'new' keyword
        String name = "John Doe";
        System.out.println(name.length()); // 8
        String name2 = new String("Tuhin Sunny");
        System.out.println(name2.length()); // 11
        int[] numbers = {1, 2, 3, 4, 5};
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; 
    }
}
