package HW8;

abstract class Fish {
    protected String name;
    protected String color;

    //constructor
    public Fish(String name, String color) {
        this.name = name;
        this.color = color;
    }

    //empty abstract method that will be implemented in subclasses
    abstract void swim();
}
