package _17_Inheritance;
/*
* SUPER는 부모에게 접근할 수 있는 키워드 이다.
* super를 사용하는데 두가지 방식이 존재하는데
* 1. super() : 부모 클래스의 생성자를 호출하는 키워드
* 만약 NoArgs이면 super()하고 안에 아무런 인자를 넣지 않는다.
* 만약 allArgs이면 super(필드 속성값들을 넣어줘야 한다.)
*
* 2.super.메소드명() : 부모 클래스의 메소드를 호출 한 것
* 3.super.필드명 : 부모 클래스의 필드 속성값을 불러온 것
*
* */

public class Tiger extends Animal {//animal은 상속받을 부모 클래스
    //tiger가 노아규 animal는 all이라 생성자를 만들어 줘야해서 생성자 만들어 준다.
    private boolean isStriped; //animal에게 상속받아 animal의 속성을 그대로 받은 상태인데 이때

    public Tiger(int animalAge, String animalName, boolean isStriped) {//여기도 이걸 boolean isStriped 추가해줘야한다.//
        //고유 필드속성을 대입하기 전에 부모의 속성을 먼저 생성자 호출해야한다.
        super(animalAge, animalName);
        this.isStriped = isStriped;
    }

//    //부모 클래스에는 없는 속성을 따로 추가할 수 있다.
//    //부모한테 없는 속성을 따로 만들었을때 isdw는 게터 세터가 없어서 새로만들었을때는 자식클래스에서 추가한 필드 속성도 게터세터도 새로만들어줘야 한다.
    public Tiger(int animalAge, String animalName) {
       super(animalAge, animalName); //super은 부모 클래스를 뜻하는데 //animalage와 animal을 tiger는 들고 있다. move도



    }
    //오버라이딩은 상속관계에서 자식 클래스가 부모 클래스의 메소드를 재정의하는 것
    //즉 부모로부터 물려받은 메소드를 자식이 '다르게' 실행되도록 바꾸는 것
    //부모 클래스의 메소드를 자식 클래스에서 동일한 이름, 매개변수, 리턴타입으로 다시 정의 하도록 되어있다.
    //왜냐면 자식 클래스에 맞게 다르게 동작시켜야 할때
    //부모 클래스의 접근 제어 범위가 더 좁아야 된다.

    /*
    * @란 어노테이션(시그니처)
    * 코드에 붙이는 꼬리표
    * 이 친구는 이런 용도로 사용되니까 좀 특별하게 유심히 잘 봐라는 뜻
    * 코드를 읽고 컴퓨터가 이해하도록 어노테이션을 달아주면 컴퓨터가 어노테이션을 보고 인식을 함.
    * */
    @Override //
    public void move(){
        //부모 클래스의 무브를 사용하고 싶다면
        super.move(); //이렇게 해주면 된다.
        //부모클래스인 animal클래스의 move()메소드를 호출 한것
        System.out.println("호랑이가 움직입니다."); //재정의를 하는것

    }
//    public void hunt() {
//        System.out.println("호랑이가 사냥을 합니다.");//출력하기 전에 이름을 같이 출력을 하고싶어서

//        public void hunt() {
//            System.out.println(getAnimalName() + "호랑이가 사냥을 합니다.");
            /*
            * 상속을 했을 때 메소드를 호출 시 탐색에는 순서가 있다.
            * 자식 클래스에서 해당 메소드가 없다면 부모 클래스에서 찾는다.
            * 그리고 이
            * */

}
