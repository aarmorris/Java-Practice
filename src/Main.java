import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name: ");
//        String name = scanner.nextLine().trim();
//        System.out.println(("You are " + name));

        // Method chaining is down below:
//        String result = NumberFormat.getPercentInstance().format(0.1);
//        System.out.println((result));

        NumberFormat number = NumberFormat.getNumberInstance();
        String result = number.format(1234567.87);
        System.out.println((result));


//        int result = (int) (Math.random() * 100);
//        System.out.println((result));

        // Implicit casting
        // byte > short > int > long > float > double
//        String x = "1.1";
//        double y = Double.parseDouble(x) + 2; // 2.0  // Explicit casting
//        System.out.println((y));


        // Older Syntax
//        int [] numbers = { 2, 3, 5, 1, 4 };
//        System.out.println(numbers.length);
//        Arrays.sort(numbers);
//        int [][] numbers = new int [2] [3];
//        numbers [0] [0] = 1;
//        System.out.println(Arrays.deepToString(numbers));

//        numbers[0] = 1;
//        numbers[1] = 2;

//        System.out.println(Arrays.toString(numbers));
////        int myAge = 37;
//        int herAge = myAge;
//        long viewsCount = 3_123_456_789L;
//        float price = 10.99F;
//        char letter = 'A';
//        boolean isEligible = true;
//        Date now = new Date();
//        System.out.println(now);
//        Point point1 = new Point(1, 1);
//        Point point2 = point1;
//        point1.x = 2;
//        System.out.println(point2);
//        String message = "c:\tWindows\\...";


    }
}