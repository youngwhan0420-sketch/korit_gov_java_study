package _25_LayeredArchitecture.service;

import _25_LayeredArchitecture.dto.TodoRegisterReqDto;
import _25_LayeredArchitecture.entity.Todo;
import _25_LayeredArchitecture.repository.TodoList;

public class TodoService {
    private TodoList todoList;


    //생성자로 객체 주입
    public TodoService(TodoList todoList) {
        this.todoList = todoList;
    }
    //Todo 등록
    public void register(TodoRegisterReqDto todoRegisterReqDto) {
        //1. 엔티티
        Todo todo = todoRegisterReqDto.toEntity();
        //2. todoId를 만들어야 한다.
        todo.setTodoId(todoList.generatedTodoId());
        //3. todoList에 추가
        todoList.add(todo); //이제 레지스터를

    }
}
