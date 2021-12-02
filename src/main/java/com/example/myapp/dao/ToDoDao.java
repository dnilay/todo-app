package com.example.myapp.dao;

import com.example.myapp.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoDao extends JpaRepository<ToDo,Integer> {
}
