//lets understand polymorphism in java

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
public class polymorphism {
    public static void main(String args[]) {
        Animal myanimal=new Animal();
        Animal mydog=new Dog();
        Animal mycat=new Cat();
        myanimal.sound();
        mydog.sound();
        mycat.sound();
    }
}