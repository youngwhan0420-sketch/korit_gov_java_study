//package _16_Class.BankAccount;

//public class BankAccountMain {

    /*
    * BankAccount클래스에서 속성으로 balance선언
     * balance는 private로 제한
     * 해당 객체를 생성할때 balance에 값 주입
    * 객체가 생성될 때 "계좌가 개설되었습니다. 현재 잔액 : ***원" 출력이 되도록
    * balance의 값을 볼 수 있게 get만들기
    * 메소드로 deposit, withdraw 만들기
    * 이때 deposit = > 입금 금액이 0원 이상일 때 입금이 가i때 "계좌에 ****원이 입금되었습니다.
    * 현재 잔액: ***원" 출력
    * 출금액이 0원 이상이 되지 않으면 "출금액은 0원 초과이어야 합니다" 출력
    * 출금액이 잔액보다 많을 경우 "잔액이 부족합니다. 현재 잔액: ***" 출력
    * 메인에서 계좌 개설 후 한번씩 다 테스트 해보기
    * withdraw => 출금액이 0원 이상이면서 잔액이 출금액보다 이하일 경우 출금 가능하도록
    * */
//    public static void main(String[] args) {
//        BankAccount account = new BankAccount(20000);
//
//        account.deposit(-30000);
//        System.out.println(account.getBalance());
//        account.deposit(30000);
//        System.out.println(account.getBalance());
//
//        account.withdraw(-100);
//        System.out.println(account.getBalance());
//        account.withdraw(60000);
//        System.out.println(account.getBalance());
//        account.withdraw(30000);
//        System.out.println(account.getBalance());
//
//    }
//
//}
