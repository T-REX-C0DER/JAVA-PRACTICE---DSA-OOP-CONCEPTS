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

