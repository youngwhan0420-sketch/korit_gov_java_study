package _28_WildCard;

public class Main {
    public static void main(String[] args) {
        Box<Dog> dogBox = new Box<>();
        Dog dog = new Dog();
        dogBox.setValue(dog);
        Box<Cat> catBox = new Box<>();
        catBox.setValue(new Cat());

        Unbounded.inspect(dogBox);
        Unbounded.inspect(catBox);

        System.out.println("===================");


        Box<Corgi> corgiBox = new Box<>();
        corgiBox.setValue(new Corgi());

        UpperBounded.inspect((dogBox));
        UpperBounded.inspect(corgiBox);

        Box<Animal> animalBox = new Box<>();
        Box<Object> objectBox = new Box<>();
        dogBox.setValue(new Dog());
        LowerBounded.putDog(animalBox);
        LowerBounded.putDog(objectBox);
        //LowerBounded.putDog(dogBox);

        //상한 박스로 이루어져있고 자식 클래스만 받을수있기때문에 캣박스안에는 캣이라는 클래스가 들어있어서 타입이 아맞다. 불가능


    }
}


