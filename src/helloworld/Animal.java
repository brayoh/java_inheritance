package helloworld;

/**
 *
 * @author brainiac
 */
public class Animal extends Main {
    String name;
    private int body;
    private int brain;
    private int size;
    private int weight;
    
    public Animal(String name,int body, int brain,int size, int weight){
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.weight = weight;
        this.size = size;
    }
    
    public void eat(){
        System.out.println("Animal.eat() called");
    }
    public void move(int speed){
        System.out.println("Animal moving at "+ speed);
    }
    
    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public int getBrain() {
        return brain;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
