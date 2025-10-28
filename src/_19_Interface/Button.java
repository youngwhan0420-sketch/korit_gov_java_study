package _19_Interface;

public abstract class Button implements Press, Up, Down { //추상클래스로 만들기, 인터페이스는 다중 상속이 가능하다.
        //extends는 단일 상속, implements는 다중 상속
        @Override
        public void onDown() {};

        @Override
        public abstract void onPressed();
        //추상 메소드이기 때문에 필수적으로 구현해 준다.

        @Override
        public void onUp() {};
}
