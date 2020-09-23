package com.student.application.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.student.application.entity.Todos;

public interface ITodoService {
    List< Todos > getTodosByUser(String user);
    Optional < Todos > getTodoById(long id);
    void updateTodo(Todos todo);
    void addTodo(String name, String title,String desc, Date targetDate, boolean isDone);
    void deleteTodo(long id);
    void saveTodo(Todos todo);
}