package _32_LayeredArchitecture2.repository;

import _32_LayeredArchitecture2.entity.User;

public interface UserRepository {
    void insert(User user);
    User findByUsername(String username);
}

//강제성을 주입하기 위해 만들었다 인터페이스는
//유저레퍼지를 두개 만든다 생각해보자.
//둘다 메소드가 insert와 파인이었어얗나다고 생각해보자.
//상속을 받으면 강제성 띄면서
//둘중 하나를 누락시키면 인터페이스에서 난리가 난다.그거 방지차원에서 인터를따로 빼서 두개를 만들어줬다.

/**/