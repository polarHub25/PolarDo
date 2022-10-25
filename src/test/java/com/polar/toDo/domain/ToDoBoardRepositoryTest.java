package com.polar.toDo.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.task.SyncTaskExecutor;

import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class ToDoBoardRepositoryTest {

    @Autowired
    ToDoBoardRepository todoRepository;

    @Test
    public void InsertTest(){
        IntStream.rangeClosed(1, 10).forEach(i -> {
            ToDoBoard toDoBoard = ToDoBoard.builder()
                    .userId("SampleUser"+i)
                    .toDoTitle("SampleTitle"+i)
                    .toDoContent("Sample..." + i)
                    .build();

            //create!!
            todoRepository.save(toDoBoard);
        });
    }
    @Test
    public void SelectTest(){

        Long id = 10L;

        Optional<ToDoBoard> result = todoRepository.findById(id);

        System.out.println("=================================================");

        if(result.isPresent()){
            ToDoBoard toDo = result.get();
            System.out.println(toDo);
        }
    }

    @Test
    public void UpdateTest(){
        ToDoBoard toDoBoard = ToDoBoard.builder()
                            .id(10L)
                            .userId("SampleUser10")
                            .toDoTitle("SampleTitle10")
                            .toDoContent("UpdateTest...")
                            .build();

        todoRepository.save(toDoBoard);
    }
    @Test
    public void DeleteTest(){

        Long id = 10L;

        todoRepository.deleteById(id);
    }

}

