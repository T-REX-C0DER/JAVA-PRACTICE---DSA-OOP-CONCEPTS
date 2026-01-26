import java.util.*;

// Assignment 1

// public class NPTEL_Practice_Problems {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int number = in.nextInt();
//         if(number % 2 == 0 ){
//             System.out.println("Even");
//         }else{
//             System.out.println("Odd");
//         }
//         in.close();
//     }
// }


// public class NPTEL_Practice_Problems {
//     public static void main(String[] strings) {
//           double width;
//           double height;
//           Scanner in = new Scanner(System.in);
//           width = in.nextDouble();
//           height = in.nextDouble();
//           // calculate perimeter 
//           double perimeter  = 2*(width+height);
//           // calculate area of rectangle
//           double area = height*width;
//           System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f\n", height,width,perimeter);
//           System.out.printf("Area is %.1f * %1.f  = %.2f", height,width,area);    
//           in.close();
//     }
// }


// public class NPTEL_Practice_Problems {
//     public static void main(String[] strings) {
//           double radius;
//           double height;
//           double Pie = 3.14;
//           Scanner in = new Scanner(System.in);
//           radius = in.nextDouble();
//           height = in.nextDouble();
//           double volume = Pie*radius*radius*height;
//           System.out.printf("Volume is : %.2f",volume);
//           in.close();
//     }
// }


// public class NPTEL_Practice_Problems {
//     public static void main(String[] strings) {
//           Scanner in = new Scanner(System.in);
//           int number = in.nextInt();
//           for(int i = 1 ; i < 6 ; i++){
//             System.out.printf("%d * %d = %d \n" , number , i , number*i);
//           }
//           in.close();
//     }
// }


public class NPTEL_Practice_Problems {
    public static void main(String[] strings) {
          Scanner in = new Scanner(System.in);
          
          int x = in.nextInt();
          int y = in.nextInt();

          int quotient = x/y;
          int remainder = x%y;

          System.out.println(("The Quotient is = " + quotient));
          System.out.println(("The remainder is = " + remainder));

          in.close();
    }
}