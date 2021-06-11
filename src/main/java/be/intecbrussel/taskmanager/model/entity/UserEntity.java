package be.intecbrussel.taskmanager.model.entity;

import be.intecbrussel.taskmanager.model.JobTitle;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class UserEntity extends BaseEntity{
    private String firstName;
    private String lastName;
    private JobTitle jobTitle;
    private String email;
    private String password;

    @OneToMany
    private Set<ProjectEntity> projects;
}
