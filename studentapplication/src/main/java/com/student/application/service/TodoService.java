package com.student.application.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.application.Repository.TodosRepository;
import com.student.application.entity.Todos;

@Service
public class TodoService implements ITodoService {

    @Autowired
    private TodosRepository TodosRepository;

    @Override
    public List <Todos> getTodosByUser(String user) {
        return TodosRepository.findByUserName(user);
    }

    @Override
    public Optional < Todos > getTodoById(long id) {
        return TodosRepository.findById(id);
    }

    @Override
    public void updateTodo(Todos todos ) {
        TodosRepository.save(todos );
    }

    @Override
    public void addTodo(String name,String title, String desc, Date targetDate, boolean isDone) {
        TodosRepository.save(new Todos(name,title, desc, targetDate));
    }

    @Override
    public void deleteTodo(long id) {
        Optional < Todos > todos = TodosRepository.findById(id);
        if (todos .isPresent()) {
            TodosRepository.delete(todos.get());
        }
    }

    @Override
    public void saveTodo(Todos todos ) {
        TodosRepository.save(todos );
    }


}