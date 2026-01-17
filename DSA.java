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
// public class DSA {
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
//        public static void main(String[] args) {
//                 SelectionSort();
//        }
//     }
       
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

// // To check the array is sorted (strictly increasing)
// public static boolean isSorted(int idx , int arr[]){
//     if(idx == arr.length-1){
//         return true;
//     }
//     if(arr[idx]<arr[idx+1]){
//          return isSorted(idx+1, arr);
//     }else{
//         return false;
//     }
// }
// public static void main(String args[]){
//     int arr[] = {1,2,3};
//     System.out.println(isSorted(0, arr));
// }

// // To move all 'x' to the end of string
// public static void MoveallX(String str , int idx ,int count ,String newstring){
//     if(idx == str.length()){
//         for(int i=0;i<count;i++){
//             newstring += 'x';
//         }
//         System.out.println(newstring);
//         return;
//     }
//     char currchar = str.charAt(idx);
//     if(currchar == 'x'){
//         count++;
//         MoveallX(str, idx+1, count, newstring);
//     }else{
//         newstring += currchar;
//         MoveallX(str, idx+1, count, newstring);
//     }
// }
// public static void main(String args[]){
//     String str = "axbcxxd";
//     MoveallX(str, 0, 0, "");
// }

// // print keypad combinations
// public class DSA {

// public static String keypad[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
// public static void printcomb(String str , int idx , String combination){
//     if(idx == str.length()){
//         System.out.println(combination);
//         return;
//     }
//     char currchar = str.charAt(idx);
//     int digit = currchar - '0';
//     String mapping = keypad[digit];
//     for(int i=0;i<mapping.length();i++){
//         printcomb(str, idx+1, combination + mapping.charAt(i));
//     }
// }
// public static void main(String args[]){
//     String str = "23";
//     printcomb(str, 0, "");
// }
// }


// // To print all permutations of a string
// public class DSA {
//       public static void printperm(String str , String perm){
//             if(str.length() == 0){
//                   System.out.println(perm);
//                   return;
//             }
//             for(int i=0;i<str.length();i++){
//                   char currchar = str.charAt(i);
//                   String newstr = str.substring(0, i) + str.substring(i+1);
//                   printperm(newstr, perm + currchar);
//             }
//       }
//       public static void main(String args[]){
//             String str = "abc";
//             printperm(str, "");
//       }
//       }


// // BackTracking permutation of a string
// public class DSA {
//         public static void printperm(String str , String perm , boolean freq[]){
//                 if(str.length() == perm.length()){
//                     System.out.println(perm);
//                     return;
//                 }
//                 for(int i=0;i<str.length();i++){
//                     if(!freq[i]){
//                             freq[i] = true;
//                             char currchar = str.charAt(i);
//                             printperm(str, perm + currchar, freq);
//                             freq[i] = false;
//                     }
//                 }
//         }
//         public static void main(String args[]){
//                 String str = "abc";
//                 boolean freq[] = new boolean[str.length()];
//                 printperm(str, "", freq);
//         }
// }

// // MERGESORT ALGORITHM
// import java.util.*;
// public class DSA {
//        public static void merge(int arr[] , int si , int mid , int ei){
//               int temp[] = new int[ei - si + 1];
//               int i = si; //iterator for left part
//               int j = mid + 1; //iterator for right part
//               int k = 0; //iterator for temp array

//               while(i <= mid && j <= ei){
//                      if(arr[i] <= arr[j]){
//                             temp[k] = arr[i];
//                             i++;
//                      }else{
//                             temp[k] = arr[j];
//                             j++;
//                      }
//                      k++;
//               }

//               //left part
//               while(i <= mid){
//                      temp[k] = arr[i];
//                      i++;
//                      k++;
//               }

//               //right part
//               while(j <= ei){
//                      temp[k] = arr[j];
//                      j++;
//                      k++;
//               }

//               //copying temp to original array
//               for(k = 0 , i = si ; k < temp.length ; k++ , i++){
//                      arr[i] = temp[k];
//               }
//        }

//        public static void mergeSort(int arr[] , int si , int ei){
//               if(si >= ei){
//                      return;
//               }
//               int mid = si + (ei - si) / 2;
//               mergeSort(arr, si, mid);
//               mergeSort(arr, mid + 1, ei);
//               merge(arr, si, mid, ei);
//        }

//        public static void main(String args[]){
//               int arr[] = {38, 27, 43, 3, 9, 82, 10};
//               mergeSort(arr, 0, arr.length - 1);
//               System.out.println(Arrays.toString(arr));
//        }
// }
// // QUICK SORT ALGORITHM
// // import java.util.*;
// public class DSA {
//          public static int partition(int arr[] , int si , int ei){
//                   int pivot = arr[ei];
//                   int i = si - 1;
    
//                   for(int j = si ; j < ei ; j++){
//                         if(arr[j] <= pivot){
//                              i++;
//                              //swap arr[i] and arr[j]
//                              int temp = arr[i];
//                              arr[i] = arr[j];
//                              arr[j] = temp;
//                         }
//                   }
//                   //swap arr[i+1] and arr[ei] (or pivot)
//                   int temp = arr[i + 1];
//                   arr[i + 1] = arr[ei];
//                   arr[ei] = temp;
    
//                   return i + 1;
//          }
    
//          public static void quickSort(int arr[] , int si , int ei){
//                   if(si < ei){
//                         int pi = partition(arr, si, ei);
//                         quickSort(arr, si, pi - 1);
//                         quickSort(arr, pi + 1, ei);
//                   }
//          }
    
//          public static void main(String args[]){
//                   int arr[] = {10, 7, 8, 9, 1, 5};
//                   quickSort(arr, 0, arr.length - 1);
//                   System.out.println(Arrays.toString(arr));
//          }
//     }


// Single Linked List 

class Node { // node struct
    String data;
    Node next;

    Node(String data){
        this.data = data;
        this.next = null;
    }
}

class DSA {
    Node  head ;

    // Insertion at beginning 
    void AtBegining(String data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    // Insertion at end

    void AtEnd(String data){
        Node newnNode = new Node(data);
        if(head == null ){
            System.out.println("The list is empty");
            return;
        }

        Node temp = head;
        while(temp.next != null ){
            temp = temp.next;
        }
        temp.next = newnNode;
    }

    // Func dor deletion at beginning
    void  deletefrombeg(){
        if(head == null ){
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
        System.out.println("Deleted from beginning ");
    }
}