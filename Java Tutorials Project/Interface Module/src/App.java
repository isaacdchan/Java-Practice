public class App {
    public static void main(String[] args) {

        Doggo doggo1 = new Doggo("Taylor");
        doggo1.bark();

        Person person1 = new Person("Franny");
        person1.speak();

        // variable of type info pointing to an object of type machine
        // this is possible because the doggo class implements info
        Info info1 = new Doggo("Barry");
        // should not be able access Doggo specific methods unless specified in the Interface...?
        // Doggo becomes a little irrelevant. only care about Info now
        // like creating a linked list from a list. list object was needed originally. but then care more about the ll interface
        ((Doggo) info1).bark();

        // copying all the information of person1 (also implements info) but storing it in the info2 variable
        Info info2 = person1;
        info2.showInfo();

        // can pass any object that uses info interface
        outputInfo(person1);
        outputInfo(info1);
    }

    // has to be static since not creating a new App
    private static void outputInfo(Info info) {
        // can access any method defined within the Info interface
        // can pass different objects to the same interface. saves time. sharing.
        info.showInfo();
    }
}
