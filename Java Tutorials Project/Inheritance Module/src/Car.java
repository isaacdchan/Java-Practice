public class Car extends Machine{
//    INEFFICIENT WAY.
//    public void start() {
//        System.out.println("Car Started");
//    }

//    Efficient way
//    Press CTRL + O to see a list of override methods
    @Override
    public void start() {
        System.out.println("Car Started");
    }

    public void rev() {
        System.out.println("vroom vroom");
    }
    public void show_info() {
        System.out.println("My name is " + name);
    }
}
