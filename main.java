class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is Barking");
    }
}

public class main {
    public static void main(String [] args){
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}