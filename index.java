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


