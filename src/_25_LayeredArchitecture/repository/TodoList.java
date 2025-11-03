package _25_LayeredArchitecture.repository;

import _25_LayeredArchitecture.entity.Todo;
public class TodoList {
    private Todo[] todos;

    public TodoList() {
        todos = new Todo[0];
    }
    public int generatedTodoId() {
        return todos.length == 0 ? 1 : todos[todos.length - 1].getTodoId() + 1;
    }
    public void add(Todo todo) {
        Todo[] temp = new Todo[todos.length + 1];
        for (int i = 0; i < todos.length; i++){
            temp[i] = todos[i];
        }
        temp[temp.length - 1] = todo;
        todos = temp;
    }
    //todo 배열을 반환하는 findAllByUserId
    //배열의 길이를 위해 foundToddCount를 마늗ㄴ다.
    //todos에는 유저아이디 사람꺼만 골라서 숫자를 센다. 왜 세냐면 새로운 배열을 만들어 반환을 해줘야 하기 때무넹
    //배열을 만들기 위해서는 길이가 필요해서 몇개 필요한지 카운트 해주낟.
}
//todo 배열을 만들어서
//찾은 애들 집어넣어주면 된다.
//만약 투두스에i번째 인덱스에
//j넣어주고 투두스에 아이번쨰 인덱스를 넣어라
//아이는 반복할 횟수
//리턴 해준다.