public class Person implements Info {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("I am a human");
    }

    @Override
    public void showInfo() {
        System.out.println("My name is: " + name);
    }
}
