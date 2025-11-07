// class Calculator {
//     public int add(int a, int b) {
//         return a + b;
//     }

//     public int add(int a, int b, int c) {
//         return a + b + c;
//     }

//     public double add(double a, double b) {
//         return a + b;
//     }
// }

// public class index {
//     public static void main(String[] args) {
//         Calculator sc = new Calculator();
//         System.out.println("Sum of two integers : " + sc.add(5, 10));
//         System.out.println("Sum of three integers : " + sc.add(5,10, 12));
//         System.out.println("Sum of two doubles : " + sc.add(5.8, 10.903));
//     }
// }   





// class calculator {
//     public double discount(double price, double percent) {
//         return price - (price * percent / 100);
//     }

//     public double discount(double price) {
//         double percent = 10;
//         return price - (price * percent / 100);
//     }

//     public double discount(double price, double percent, double bonus) {
//         double totaloff = percent + bonus;
//         return price - (price * totaloff / 100);
//     }
// }

// public class index {
//     public static void main(String[] args) {
//         calculator dc = new calculator();

//         System.out.println(dc.discount(1000, 20));
//         System.out.println(dc.discount(2000));
//         System.out.println(dc.discount(1000, 20, 15));
//     }
// }



// class Main {
//     void process(int a, float b) {
//         System.out.println("method 1 process(int , float)");
//     }

//     void process(float a, int b) {
//         System.out.println("method 2 process(float , int)");
//     }

//     public static void main(String[] args) {
//         Main t = new Main();
//         t.process(10, 10);  // ❌ This line causes error
//     }
// }


// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     @Override
//     void sound() {
//         System.out.println( "Dog barks");
//     }
// }

// public class main2 {
//     public static void main(String[] args) {
//         Animal a = new Dog();
//         a.sound();
//     }
// }




// class Shape {
//     double area() {
//         return 0;
//     }
// }

// class Circle extends Shape {
//     double radius;

//     Circle(double radius) {
//         this.radius = radius;
//     }

//     double area() {
//         return Math.PI * radius * radius;
//     }
// }

// class Rectangle extends Shape {
//     double length, breadth;

//     Rectangle(double length, double breadth) {
//         this.length = length;
//         this.breadth = breadth;
//     }

//     // Override area method
//     double area() {
//         return length * breadth;
//     }
// }

// public class main3 {
//     public static void main(String[] args) {
//         // Parent reference to Circle object
//         Shape s1 = new Circle(5);
//         System.out.println("Area of Circle: " + s1.area());

//         // Parent reference to Rectangle object
//         Shape s2 = new Rectangle(4, 6);
//         System.out.println("Area of Rectangle: " + s2.area());
//     }
// }


// class Amount {
//     private double balance;

//     public void deposit(double amount) {
//         if (amount <= 0) {
//             throw new IllegalArgumentException("Deposit amount must be positive");
//         }
//         balance += amount;
//         System.out.println("Deposited: " + amount);
//     }

//     public void withdraw(double amount) throws Exception {
//         if (amount <= 0) {
//             throw new IllegalArgumentException("Withdrawal amount must be positive");
//         } else if (amount > balance) {
//             throw new Exception("Insufficient balance");
//         } else {
//             balance -= amount;
//             System.out.println("Withdrew: " + amount);
//         }
//     }
// }


// import java.util.*;

// public class StudentGradingSystem {
//     static char grade(int m) {
//         if (m < 0 || m > 100)
//             throw new IllegalArgumentException("Invalid marks");
//         if (m >= 90) 
//             return 'A';
//         if (m >= 75) 
//             return 'B';
//         if (m >= 60) 
//             return 'C';
//         if (m >= 40) 
//             return 'D';
//         return 'F';
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         try {
//             System.out.print("Enter Name: ");
//             String n = sc.nextLine();
//             System.out.print("Enter Marks: ");
//             int m = sc.nextInt();
//             System.out.println("Name: " + n + "\nMarks: " + m + "\nGrade: " + grade(m));
//         } catch (Exception e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//         sc.close();
//     }
// }


// // q2 write a programm that converts temperature from clsius to FARENHITE THROW AN EXception if an user enters an non numerical value or an invalid range




public class StudentGradingSystem{
    public static void main(String[] args) {
        int arr [] = {1,2,5,7,5,3};
        int k = 3; 
        int currSum = 0;
        int maxSum;
        for(int i=0 ; i<k ; i++){
            currSum += arr[i];
        }
        maxSum = currSum;
        for(int right = k; right<arr.length ; right++){
            currSum += arr[right] - arr[right - k];
            maxSum = Math.max(maxSum,currSum);
        }
        System.out.println("max sum =" + maxSum);
    }
}