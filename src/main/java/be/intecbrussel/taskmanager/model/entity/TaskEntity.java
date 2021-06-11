package be.intecbrussel.taskmanager.model.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class TaskEntity extends BaseEntity{

   private String title;
   private String description;
   private TaskLabel taskLabel;
   private Date createdAt;
   private Date modifiedAt;
   private Date deadline;
//   private Set<UserEntity> users;
//   private ProjectEntity project;
}
