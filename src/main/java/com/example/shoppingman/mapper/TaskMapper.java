package com.example.shoppingman.mapper;

import com.example.shoppingman.domain.Task;
import com.example.shoppingman.domain.TaskDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TaskMapper {

    public Task maptotask(final TaskDto taskDto){
        return new Task(
                taskDto.getId(),
                taskDto.getItem(),
                taskDto.getQuantity());
    }
    public TaskDto maptotaskDto(final Task task){
        return new TaskDto(
                task.getId(),
                task.getItem(),
                task.getQuantity());
    }
    public List<TaskDto> mapToTaskDtoList(final List<Task> taskList){
        return taskList.stream()
                .map(t->new TaskDto(t.getId(),t.getItem(),t.getQuantity()))
                .collect(Collectors.toList());
    }
}

