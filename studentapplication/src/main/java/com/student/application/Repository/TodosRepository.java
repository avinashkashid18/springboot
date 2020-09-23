package com.student.application.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.application.entity.Todos;

public interface TodosRepository extends JpaRepository<Todos, Long> {
	List<Todos> findByUserName(String userName);
}
