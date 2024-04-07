package HW8;

public class Catfish extends Fish{
    public Catfish(String name, String color) {
        super(name, color);
    }
    @Override
    public void swim() {
        System.out.println(name + " swims!");
    }
}
