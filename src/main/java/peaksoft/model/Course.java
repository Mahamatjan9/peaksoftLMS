package peaksoft.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.*;

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

    @ManyToOne(fetch = FetchType.EAGER)
    private Company company;

//    @ManyToMany(cascade = {MERGE, DETACH, PERSIST, REFRESH}, fetch = FetchType.LAZY, mappedBy = "courses")
//    private List<Group> groupList;
//
//    public void addGroup(Group group) {
//        if (groupList == null) {
//            groupList = new ArrayList<>();
//        }
//        groupList.add(group);
//    }
//
//    @OneToMany(cascade = {ALL}, fetch = FetchType.LAZY, mappedBy = "courses")
//    private List<Instructor> instructorList;
//
//    public void addInstructor(Instructor instructor) {
//        if (instructorList == null) {
//            instructorList = new ArrayList<>();
//        }
//        instructorList.add(instructor);
//    }
//
//    @OneToMany(cascade = {MERGE, DETACH, PERSIST, REFRESH}, fetch = FetchType.LAZY, mappedBy = "courses")
//    private List<Lesson> lessonList;
//
//    public void addLesson(Lesson lesson) {
//        if (lessonList == null) {
//            lessonList = new ArrayList<>();
//        }
//        lessonList.add(lesson);
//    }


}
