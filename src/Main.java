import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

     // задача 1

        int[] numbers =  {1, 2 ,3};

        double[] numbers1 = {1.57, 7.654, 9.986};

        int[] ggg = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // задача 2

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(ggg));

        System.out.println( );

        // задача 3

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = numbers1.length - 1; i >= 0; i--) {
            System.out.print(numbers1[i]);
            if (i > 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = ggg.length - 1; i >= 0; i--) {
            System.out.print(ggg[i]);
            if (i > 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println( );

        // задача 4

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i]++;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}