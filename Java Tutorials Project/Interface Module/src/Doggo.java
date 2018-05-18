//class can implement unlimited interfaces unlike only one parent class
//cannot use new Interface. (new Info)
public class Doggo implements Info{

    private String name;

    public Doggo(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println("Woof woof!");
    }
    //when you want methods that are shared among multiple classes. you can c
    @Override
    public void showInfo() {
        System.out.println("Woof woof! My name is: " + name);

    }
}
