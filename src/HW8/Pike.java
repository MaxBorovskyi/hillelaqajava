package HW8;

public class Pike extends Fish implements Swimmable {
    public Pike(String name, String color) {
        super(name, color);
    }

    @Override
    public void swim() {
        System.out.println(name + " swims!");
    }
}
