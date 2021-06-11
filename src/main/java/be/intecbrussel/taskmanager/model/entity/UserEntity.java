package be.intecbrussel.taskmanager.model.entity;

import be.intecbrussel.taskmanager.model.JobTitle;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class UserEntity extends BaseEntity{
    private String firstName;
    private String lastName;
    private JobTitle jobTitle;
    private String email;
    private String password;

    @OneToMany
    private Set<ProjectEntity> projects;
}
