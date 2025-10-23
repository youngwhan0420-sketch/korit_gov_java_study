package _16_Class.BankAccount;

public class BankAccount {
    private int balance;    //BankAccount클래스에서 속성으로 balance선언, balance는 private로 제한

    BankAccount(int balance) { //생성자
        this.balance = balance;
        System.out.println("계좌가 개설되었습니다. 현재 잔액 : ***원");
    } //해당 객체를 생성할때 balance에 값 주입, 객체가 생성될 때 "계좌가 개설되었습니다. 현재 잔액 : ***원" 출력이 되도록
    int getBalance(){
        return balance;
    }
    void deposit(int money) {
        if (money >= 0){
            balance += money;
            System.out.println("입금완료");
        }
    }
    void withdraw(int money) {
        if (money <= 0){
            System.out.println("출금액은 0원 초과이어야 합니다");
        } else if (money > balance){
            System.out.println("잔액이 부족합니다. 현재 잔액: ***");
        } else {
            balance -= money;
        }
    }

}
