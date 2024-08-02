public class operators {
    public static void main(String[] args) {
        //Arithmetic operators
        int a = 10;
        int b = 20;
        System.out.println(a + b); //30
        System.out.println(a - b); //-10
        System.out.println(a * b); //200
        System.out.println(a / b); //0
        System.out.println(a % b); //10

        //Assignment operators
        int c = 10;
        c += 5; //c = c + 5
        System.out.println(c); //15

        //Unary operators
        int d = 10;
        System.out.println(d++); //10
        System.out.println(d); //11
        System.out.println(++d); //12

        //Relational operators
        int e = 10;
        int f = 20;
        System.out.println(e == f); //false
        System.out.println(e != f); //true
        System.out.println(e > f); //false
        System.out.println(e < f); //true
        System.out.println(e >= f); //false
        System.out.println(e <= f); //true

        //Logical operators
        boolean g = true;
        boolean h = false;
        System.out.println(g && h); //false
        System.out.println(g || h); //true
        System.out.println(!g); //false

        //Bitwise operators
        int i = 10;
        int j = 20;
        System.out.println(i & j); //0
        System.out.println(i | j); //30
        System.out.println(i ^ j); //30
        System.out.println(~i); //-11
        System.out.println(i << 2); //40
        System.out.println(i >> 2); //2
        System.out.println(i >>> 2); //2

        //Ternary operator
        int k = 10;
        int l = 20;
        int result = (k > l) ? k : l;
        System.out.println(result); //20
    }
}
