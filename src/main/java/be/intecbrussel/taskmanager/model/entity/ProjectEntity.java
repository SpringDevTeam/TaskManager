package be.intecbrussel.taskmanager.model.entity;

import lombok.*;

import javax.persistence.Entity;

@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Getter
@Setter
public class ProjectEntity extends BaseEntity {

    private String title;
    private String description;

}
