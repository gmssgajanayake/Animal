public class Animal {
    private String name;

    public Animal() {
        name="No an animal";
    }

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal - \n\tname : " + name;
    }
}
