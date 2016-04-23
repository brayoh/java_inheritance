package helloworld;

public class Main {

    public static void main(String[] args) {
       Animal animal = new Animal("Animal", 1, 1, 5, 5);
       Dog dog = new Dog("bruno", 8, 20, 2, 4, 1, 20, "brown");
       dog.eat();
       dog.walk();
    }
    
}
