// //program to show operator precedence and associativity
// public class BASIC {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         int c = 30;
//         int result = a + b * c - b / a; 
//         System.out.println("Result: " + result); 
//     }
// }

// //program to show all types of operators
// class OperatorsDemo {
//     public static void main(String[] args) {
//         int a = 15;
//         int b = 10;

//         // Arithmetic Operators
//         System.out.println("Arithmetic Operators:");
//         System.out.println("Addition: " + (a + b));
//         System.out.println("Subtraction: " + (a - b));
//         System.out.println("Multiplication: " + (a * b));
//         System.out.println("Division: " + (a / b));
//         System.out.println("Modulus: " + (a % b));

//         // Relational Operators
//         System.out.println("\nRelational Operators:");
//         System.out.println("a > b: " + (a > b));
//         System.out.println("a < b: " + (a < b));
//         System.out.println("a >= b: " + (a >= b));
//         System.out.println("a <= b: " + (a <= b));
//         System.out.println("a == b: " + (a == b));
//         System.out.println("a != b: " + (a != b));

//         // Logical Operators
//         System.out.println("\nLogical Operators:");
//         System.out.println("(a > b) && (a < 20): " + ((a > b) && (a < 20)));
//         System.out.println("(a < b) || (a < 20): " + ((a < b) || (a < 20)));
//         System.out.println("!(a > b): " + (!(a > b)));

//         // Assignment Operators
//         System.out.println("\nAssignment Operators:");
//         int c = a; // Simple assignment
//         System.out.println("c = a: " + c);
//         c += b; // c = c + b
//         System.out.println("c += b: " + c);
//         c -= b; // c = c - b
//         System.out.println("c -= b: " + c);
//         c *= 2; // c = c * 2
//         System.out.println("c *= 2: " + c);
//         c /= 5; // c = c / 5
//         System.out.println("c /= 5: " + c);
//         c %= 3; // c = c % 3
//         System.out.println("c %= 3: " + c);
//     }
// }

// //program to show type casting and conversion
// class TypeCastingDemo {
//     public static void main(String[] args) {
//         // Implicit Type Casting (Widening)
//         int intVar = 100;
//         double doubleVar = intVar; // int to double
//         System.out.println("Implicit Type Casting:");
//         System.out.println("Integer value: " + intVar);
//         System.out.println("Converted to Double: " + doubleVar);

//         // Explicit Type Casting (Narrowing)
//         double anotherDoubleVar = 99.99;
//         int anotherIntVar = (int) anotherDoubleVar; // double to int
//         System.out.println("\nExplicit Type Casting:");
//         System.out.println("Double value: " + anotherDoubleVar);
//         System.out.println("Converted to Integer: " + anotherIntVar);

//         // Type Conversion using Wrapper Classes
//         String strNum = "123";
//         int parsedInt = Integer.parseInt(strNum); // String to int
//         String convertedStr = Integer.toString(parsedInt); // int to String
//         System.out.println("\nType Conversion using Wrapper Classes:");
//         System.out.println("String value: " + strNum);
//         System.out.println("Parsed to Integer: " + parsedInt);
//         System.out.println("Converted back to String: " + convertedStr);
//     }
// }

// //program to explain if - else, nested if, switch case
// class ControlFlowDemo {
//     public static void main(String[] args) {
//         int number = 20;

//         // If-Else Statement
//         if (number % 2 == 0) {
//             System.out.println(number + " is an even number.");
//         } else {
//             System.out.println(number + " is an odd number.");
//         }

//         // Nested If Statement
//         if (number > 0) {
//             if (number < 50) {
//                 System.out.println(number + " is a positive number less than 50.");
//             } else {
//                 System.out.println(number + " is a positive number greater than or equal to 50.");
//             }
//         } else {
//             System.out.println(number + " is not a positive number.");
//         }

//         // Switch Case Statement
//         int day = 3;
//         String dayName;
//         switch (day) {
//             case 1:
//                 dayName = "Monday";
//                 break;
//             case 2:
//                 dayName = "Tuesday";
//                 break;
//             case 3:
//                 dayName = "Wednesday";
//                 break;
//             case 4:
//                 dayName = "Thursday";
//                 break;
//             case 5:
//                 dayName = "Friday";
//                 break;
//             case 6:
//                 dayName = "Saturday";
//                 break;
//             case 7:
//                 dayName = "Sunday";
//                 break;
//             default:
//                 dayName = "Invalid day";
//         }
//         System.out.println("Day " + day + " is " + dayName + ".");
//     }
// }

// //program for for loop, while loop, do-while loop
//  public class BASIC {
//     public static void main(String[] args) {
//         // For Loop
//         System.out.println("For Loop:");
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Iteration: " + i);
//         }

//         // While Loop
//         System.out.println("\nWhile Loop:");
//         int j = 1;
//         while (j <= 5) {
//             System.out.println("Iteration: " + j);
//             j++;
//         }

//         // Do-While Loop
//         System.out.println("\nDo-While Loop:");
//         int k = 1;
//         do {
//             System.out.println("Iteration: " + k);
//             k++;
//         } while (k <= 5);
//     }
// }