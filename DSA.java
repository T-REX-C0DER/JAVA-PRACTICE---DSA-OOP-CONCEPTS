// import java.util.*;

// //Bubble sort implementaion 

// public class DSA{

//        public static void BubbleSort(){
//               int arr[] = {1,34,53,2,544,34,57,5};

//               for(int i = 0 ; i<arr.length-1 ; i++){
//                          for(int j = 0 ; j<arr.length-i-1 ; j++){
//                             if(arr[j]>arr[j+1]){
//                                 //do swaping 
//                                 int temp = arr[j];
//                                 arr[j] = arr[j+1];
//                                 arr[j+1] = temp;
//                             }
//                          }
//               }

//               //printing 
//               for(int i = 0 ; i<=arr.length ; i++){
//                       System.out.println(arr[i]);
//               }
//        }

//     public static void SelectionSort(){
//             int arr[] = {1,34,53,2,544,34,57,5};

//               for(int i = 0 ; i<arr.length-1 ; i++){
//                     int smallest =i;
//                          for(int j = i+1 ; j<arr.length; j++){
//                                if(arr[smallest]>arr[j]){
//                                       smallest=j;
//                                }
//                          }
//                     int temp = arr[smallest];
//                     arr[smallest] = arr[i];
//                     arr[i] = temp;
//               }

//               //printing 
//               for(int i = 0 ; i<=arr.length ; i++){
//                       System.out.println(arr[i]);
//               }
//        }

       
//        public static void InsertionSort(){
        
//             int arr[] = {1,34,53,2,544,34,57,5};

//             for(int i = 1;i<arr.length ; i++){
//                 int current = arr[i];
//                 int j = i-1;

//                 while(j>=0&&current<arr[j]){
//                     arr[j+1] = arr[j];
//                     j--;
//                 }
                
//                 arr[j+1] = current;
//             }
//        }
//        public static void main(String args[]){
//               //bubble func call
//               BubbleSort();

//               //selection func sort
//               SelectionSort();

//               //insertion func sort
//               InsertionSort();
//        }


//     }
    


// //Recursion questions
// //to print sum of n numbers
// public static void printsum(int i , int n ,int sum){
//        if(i==n){
//               sum += 1;
//               System.out.println(sum);
//               return;
//        }
//        sum += 1;
//        printsum(i+1, n, sum);
// }
// public static void main(String[] args) {
//        printsum(1, 5, 0);
// }


// //to print the factorial of a num 
// public static int fact(int n){
//        if(n==1 || n==0){
//               return 1;
//        }
//        int fact = n*fact(n-1);
//        return fact;
// }
// public static void main(String[] args) {
//        int factorial = fact(5);
//        System.out.println(factorial);
// }

// //to print fibonacci series
// public static int fib(int n){
//        if(n==0){
//               return 0;
//        }
//        if(n==1){
//               return 1;
//        }
//        return fib(n-1)+fib(n-2);
// }
// public static void main(String[] args) {
//        int n = 7; // Example: Get the 7th Fibonacci number
//        int fibonacciNumber = fib(n);
//        System.out.println(fibonacciNumber);
// }

// //to print x^n (stack height = n)
// public static int power(int x , int n){
//        if(n==0){
//               return 1;
//        }
//        return x*power(x, n-1);
// }
// public static void main(String[] args) {
//        int x = 2;
//        int n = 5;
//        int result = power(x, n);
//        System.out.println(result);
// }

// //to print x^n (stack height = logn)
// public static int powerLog(int x , int n){
//        if(n==0){
//               return 1;
//        }
//        if(n%2==0){
//               return powerLog(x, n/2)*powerLog(x, n/2);
//        }else{
//               return x*powerLog(x, n/2)*powerLog(x, n/2);
//        }
// }
// public static void main(String[] args) {
//        int x = 2;
//        int n = 5;
//        int result = powerLog(x, n);
//        System.out.println(result);
// }

// //Tower of hanoi
// public static void toh(int n , String src , String dest , String helper){
//        if(n==1){
//               System.out.println("transfer disk "+ n + " from " + src + " to " + dest);
//               return;
//        }
//        toh(n-1, src, helper, dest);
//        System.out.println("transfer disk "+ n + " from " + src + " to " + dest);
//        toh(n-1, helper, dest, src);
// }
// public static void main(String[] args) {
//        int n = 3; //number of disks
//        toh(n, "A", "C", "B"); // A, B and C are names of rods
// }

// //print a string in reverse using recursion
// public static void reverseString(String str , int index){
//        if(index==0){
//               System.out.print(str.charAt(index));
//               return;
//        }
//        System.out.print(str.charAt(index));
//        reverseString(str, index-1);
// }
// public static void main(String[] args) {
//        String str = "hello";
//        reverseString(str, str.length()-1);
// }

// //to find the 1st and last occurrence of a character in a string
// public static int first = -1;
// public static int last = -1;

// public static void findOccurence(String str , int index , char element){
//        if(index==str.length()){
//               System.out.println("first occurence at "+ first);
//               System.out.println("last occurence at "+ last);
//               return;
//        }
//        char currentChar = str.charAt(index);
//        if(currentChar==element){
//               if(first==-1){
//                      first = index;
//               }else{
//                      last = index;
//               }
//        }
//        findOccurence(str, index+1, element);
// }

// public static void main(String[] args) {
//        String str = "abcaadefaah";
//        char element = 'a';
//        findOccurence(str, 0, element);
// }

