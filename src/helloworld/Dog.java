package helloworld;

/**
 *
 * @author brainiac
 */
public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    String Coat;
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String Coat) {
        super(name, 1, 1, size, weight);
        this.Coat = Coat;
        this.tail = tail;
        this.eyes = eyes;
        this.teeth = teeth;
        this.legs = legs;
    }
    private void chew(){
        System.out.println("dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat() called");
        super.eat();
        chew();
    }
    public void walk(){
         System.out.println("dog.walk() called");
         move(9);
    }

    public void run(){
         System.out.println("dog.run() called");
         move(19);
    }
    public void move_legs(int speed){
        System.out.println("dog.movelegs() called");
    }
      @Override
    public void move(int speed) {
        System.out.println("dog.move called");
        move_legs(speed);
        super.move(speed); //To change body of generated methods, choose Tools | Templates.
    }
}
