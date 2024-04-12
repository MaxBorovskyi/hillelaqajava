package HW8.Watercraft;

public class Boat extends Watercraft implements Floatable{
    public Boat(String model, int waterCapacity) {
        super(model, waterCapacity);
    }

    @Override
    void start() {
        System.out.println(model + " has started");
    }

    @Override
    public void move() {
        System.out.println(model + " is moving on water");
    }
}
