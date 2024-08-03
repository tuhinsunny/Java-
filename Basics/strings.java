public class strings {
    public static void main(String[] args) {
        // Strings
        // concatenate
        String name1 = "John";
        String name2 = "Doe";
        String name3 = name1 + " and " + name2;
        System.out.println(name3); // John and Doe

        //charAt -> to know the character at a specific index
        System.out.println(name1.charAt(0)); // J   
        System.out.println(name3.charAt(5)); // a

        //replace
        String name = "Sunny";
        System.out.println(name.replace('S', 'T')); // Tunny
        //In java strings are immutable so the original string is not changed

        //substring
        name = "Tuhin and Sunny";
        System.out.println(name.substring(0, 5)); // Tuhin -> the first index is inclusive and the second index is exclusive
        System.out.println(name.substring(6)); //and Sunny
    }
}
