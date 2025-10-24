package _17_Inheritance;

public class Animal {
    private String animalName; //속성
    private  int animalAge;//속성


    public Animal(int animalAge, String animalName) {
        this.animalAge = animalAge;
        this.animalName = animalName;
    }

    public Animal(){

    }

    //AllArgs 생성자 하나 생성하고 getter/setter다 만들고
    //메소드에 move 만들기
    //move는 움직입니다. 출력.







    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public  void move() {
        System.out.println("움직입니다.");
    }
    public String getAnimalName() {
        return animalName;
    }

}
