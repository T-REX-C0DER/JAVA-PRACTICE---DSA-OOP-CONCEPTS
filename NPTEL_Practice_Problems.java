import java.util.*;

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



public class NPTEL_Practice_Problems {
    public static void main(String[] strings) {
          double width;
          double height;

          Scanner in = new Scanner(System.in);
          width = in.nextDouble();
          height = in.nextDouble();

          // calculate perimeter 
          double perimeter  = 2*(width+height);

          // calculate area of rectangle
          double area = height*width;
 
          System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f\n", height,width,perimeter);
          System.out.printf("Area is %.1f * %1.f  = %.2f", height,width,area);
        
          in.close();
    }
}
