import java.util.Arrays;
public class array {
    public static void main(String[] args) {
        // int[] marks = new int[3];
        int marks[] = new int[3];
        marks[0] = 90;
        marks[1] = 80;
        marks[2] = 70;
        System.out.println(marks[1]); //80
        int arr[] = new int[10];
        System.out.println(arr[7]); //0
        System.out.println(marks.length); //3
            
        System.out.println(marks[0]); //90
        Arrays.sort(marks);
        System.out.println(marks[0]); //70
        int arr2[] = {1,2,3,4,5};

        // 2 d arrays
        int[][] matrix = new int[2][3];
        int finalMarks[][] = {{1,2,3},{4,5,6}};
        System.out.println(finalMarks[1][2]); //6

        
        
    }
}
