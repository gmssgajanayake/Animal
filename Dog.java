public class Dog extends Mammal{

    public Dog() {
        super();
    }

    public Dog(String name){
        super(name);
    }

    public void greets(){
        System.out.println("Woooooooooof");
    }

    public void greets(Dog anotherDog){
        anotherDog.greets();
    }

    @Override
    public String toString(){
        return "Dog - \n"+super.toString();
    }
}
