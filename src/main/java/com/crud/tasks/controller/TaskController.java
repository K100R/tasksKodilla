package com.crud.tasks.controller;

import com.crud.tasks.domain.TaskDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/task")
public class TaskController {

    // ------------ http://localhost:8080/v1/task/
    @RequestMapping(method = RequestMethod.GET,value = "getTasks")
    public List<TaskDto> getTasks(){
        return new ArrayList<>();
    }

    // ------------ http://localhost:8080/v1/task/getTask?id=2 or http://localhost:8080/v1/task/getTask
    @RequestMapping(method = RequestMethod.GET,value = "getTask")
    public TaskDto getTask(@RequestParam(value = "id",required = false) Long taskId){
        if (taskId == null) return new TaskDto(1L,"Test Title","test_content");
        return new TaskDto(taskId,"Test Title","test_content");
    }
    // ------------ http://localhost:8080/v1/task/deleteTask?id=2
    @RequestMapping(method = RequestMethod.DELETE,value = "deleteTask")
    public void deleteTask(@RequestParam(value = "id") Long taskId){
    }

    @RequestMapping(method = RequestMethod.PUT,value = "updateTask")
    public TaskDto updateTask(TaskDto taskDto){
        return new TaskDto(1L,"Edited Title","edited_content");
    }

    @RequestMapping(method = RequestMethod.POST,value = "createTask")
    public void createTask(TaskDto taskDto){

    }
}
