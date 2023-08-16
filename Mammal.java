public class Mammal extends Animal {
    public Mammal(){
        super();
    }

    public Mammal(String name){
        super(name);
    }

    @Override
    public String toString() {
        return super.toString()+"\n*** This animal is a mammal ***";
    }
}
