package com.example.myapp.controller;

import com.example.myapp.dao.ToDoDao;
import com.example.myapp.model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "*")
public class ToDoController {

    private ToDoDao toDoDao;

    @Autowired
    public ToDoController(ToDoDao toDoDao) {
        this.toDoDao = toDoDao;
    }

    @GetMapping("/todos")
    public List<ToDo> getAll() {
        return toDoDao.findAll();
    }

    @PostMapping("/todos")
    public ToDo createToDo(@RequestBody ToDo toDo) {
        return toDoDao.save(toDo);
    }
}
