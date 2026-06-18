package br.api.todolist.task;

import java.util.UUID;
import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import java.time.LocalDateTime;

@Data
@Entity(name="TB_TASK")
public class TaskModel {
    @Id
    @GeneratedValue(generator="UUID")
    private UUID id;
    private String desciption;
    @Column(length=50)
    private String tiltle;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority;
    private UUID idUser;
    private LocalDateTime createAt;
    
}
