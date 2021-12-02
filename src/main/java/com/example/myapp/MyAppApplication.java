package com.example.myapp;

import com.example.myapp.dao.ToDoDao;
import com.example.myapp.model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyAppApplication implements CommandLineRunner {
private ToDoDao toDoDao;

@Autowired
    public MyAppApplication(ToDoDao toDoDao) {
        this.toDoDao = toDoDao;
    }

    public static void main(String[] args) {
        SpringApplication.run(MyAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        toDoDao.save(new ToDo("Compile"));
        toDoDao.save(new ToDo("E2E Testing"));
        toDoDao.save(new ToDo("Unit Testing"));
        toDoDao.save(new ToDo("Design"));
    }
}
