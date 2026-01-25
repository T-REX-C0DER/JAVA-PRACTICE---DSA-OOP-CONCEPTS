// //wap to show the use of this keyword

// class Person {
//     String name;
//     int age;
//     // Constructor using 'this' keyword to differentiate between instance variables and parameters
//     Person(String name, int age) {
//         this.name = name; // 'this.name' refers to the instance variable, 'name' refers to the parameter
//         this.age = age;   // 'this.age' refers to the instance variable, 'age' refers to the parameter
//     }
//     // Method to display person's details
//     void display() {
//         System.out.println("Name: " + this.name); // Using 'this' to refer to instance variable
//         System.out.println("Age: " + this.age);   // Using 'this' to refer to instance variable
//     }
// }
// public class OOP {
//     public static void main(String[] args) {
//         // Creating an object of Person class
//         Person person = new Person("Alice", 30);
        
//         // Displaying person's details
//         person.display();
//     }
// }


// //wap to show the all types of inheritance

// class Animal {
//     void eat() {
//         System.out.println("This animal eats food.");
//     }
// }
// class Dog extends Animal {
//     void bark() {
//         System.out.println("The dog barks.");
//     }
// }
// class Puppy extends Dog {
//     void weep() {
//         System.out.println("The puppy weeps.");
//     }
// }
// public class OOP {
//     public static void main(String[] args) {
//         Puppy puppy = new Puppy();
//         puppy.eat();  // Inherited from Animal class
//         puppy.bark(); // Inherited from Dog class
//         puppy.weep(); // Defined in Puppy class
//     }
// }


// // Program to show the implementation of polymorphism also method overloading & method overriding
// public class OOP{
//     //method overloading 
//     public static int poly(int a , int b){
//         return a+b;
//     }
//     public static int poly(int a){
//         int b = a*a;
//         return b;
//     }
//     public static void main(String[] args) {
//         OOP p1 = new OOP();
//        System.out.println(p1.poly(5)); 
//        System.out.println(p1.poly(5,7)); 

//     }
// }


// // Method Overriding

// class car{
//     void engine(){
//         System.out.println("car engine");
//     }
// }

// class Mercedes extends car{
//     @Override
//     void engine(){
//         System.out.println("Mercedes engine");
//     }
// }

// public class OOP{
//     public static void main(String[] args) {
//         car c = new Mercedes();
//         c.engine();
//     }
// }

// // program to show abstraction in oops
// abstract class bike{
//     abstract void run();
// }
// class Honda extends bike{
//     void run(){
//         System.out.println("Honda bike is running");
//     }
// }
// public class OOP{
//     public static void main(String[] args) {
//         bike b = new Honda();
//         b.run();
//     }
// }

// // program to show encapsulation in oops
// class Student{
//     private String name;
//     private int age;

//     //getter method for name
//     public String getName(){
//         return name;
//     }

//     //setter method for name
//     public void setName(String name){
//         this.name = name;
//     }

//     //getter method for age
//     public int getAge(){
//         return age;
//     }

//     //setter method for age
//     public void setAge(int age){
//         if(age>0){
//             this.age = age;
//         }else{
//             System.out.println("Invalid age");
//         }
//     }
// }
// public class OOP{
//     public static void main(String[] args) {
//         Student s = new Student();
//         s.setName("Sanjay");
//         s.setAge(21);

//         System.out.println("Name: " + s.getName());
//         System.out.println("Age: " + s.getAge());
//     }
// }

// // program to show use of arraylist in java
// // import java.util.ArrayList;                                                                  
// public class OOP{
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(10);
//         list.add(20);
//         list.add(30);   
//         System.out.println("ArrayList: " + list);
//     }
// }

// // program to show use of super keyword in java
// class Animal{
//     void eat(){
//         System.out.println("Animal is eating");
//     }
// }
// class Dog extends Animal{
//     void bark(){
//         System.out.println("Dog is barking");
//     }
//     void eat(){
//         System.out.println("Dog is eating");
//     }
//     void display(){
//         super.eat(); // calling parent class method
//         bark();      // calling current class method
//     }
// }
// public class OOP{
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.display();
//     }
// }

// import java.util.HashMap;

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for (int i = 0; i < nums.length; i++) {
//             int need = target - nums[i];

//             if (map.containsKey(need)) {
//                 return new int[]{ map.get(need), i };
//             }

//             map.put(nums[i], i);
//         }

//         return new int[]{}; // will never hit because exactly one solution exists
//     }
// }


// Multithreading in Java
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + i);
            try {   
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class OOP {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); // Start the thread
    }
}   