public class TestAnimal {
    public static void main(String[] args) {
        Cat c1=new Cat("Cat1");
        Dog d1=new Dog("Dog1");

        System.out.println(c1.toString());
        System.out.println();
        System.out.println(d1.toString());

        d1.greets(new Dog());
    }
}
