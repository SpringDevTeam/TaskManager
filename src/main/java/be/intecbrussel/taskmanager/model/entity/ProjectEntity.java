package be.intecbrussel.taskmanager.model.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class ProjectEntity extends BaseEntity {

    private String title;
    private String description;

}
