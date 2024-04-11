package HW8.Birds;

public class Penguin extends Bird{
    public Penguin(String name, String location) {
        super(name, location);
    }

    @Override
    public void fly() {
        System.out.println(name + "cannot fly, but can swim");
    }

    @Override
    public void swim() {
        System.out.println(name + "can swim");
    }
}
