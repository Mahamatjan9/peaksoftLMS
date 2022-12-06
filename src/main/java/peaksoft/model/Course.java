package peaksoft.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.LAZY;

@Entity
@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_gen")
    @SequenceGenerator(name = "course_gen", sequenceName = "course_gen", allocationSize = 1)
    private Long id;

    @Column(length = 100000, name = "course_name")
    private String courseName;
    private int duration;

    @Column(length = 100000)
    private String description;

    @ManyToOne(cascade = {MERGE, DETACH, REFRESH, PERSIST,REMOVE}, fetch = FetchType.EAGER)
    private Company company;

    @ManyToMany(cascade = {MERGE, DETACH,REFRESH,REMOVE}, fetch = FetchType.LAZY,mappedBy = "courseList")
    private List<Group> groupList;

    public void addGroup(Group group) {
        if (groupList == null) {
            groupList = new ArrayList<>();
        }
        groupList.add(group);
    }

    @OneToMany(cascade = {ALL},fetch = LAZY, mappedBy = "course")
    private List<Instructor> instructors;

    public void addInstructors(Instructor instructor){
        if (instructors==null){
            instructors=new ArrayList<>();
        }
        instructors.add(instructor);
    }

    @OneToMany(cascade = {ALL}, fetch = LAZY, mappedBy = "course")
    private List<Lesson> lessons;

    public void addLesson(Lesson lesson){
        if (lessons==null){
            lessons=new ArrayList<>();
        }
        lessons.add(lesson);
    }


}
