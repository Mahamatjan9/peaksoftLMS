package peaksoft.service;

import peaksoft.model.Student;

import java.io.IOException;
import java.util.List;

public interface StudentService {
    List<Student> getStudentList();

    List<Student> getAlStudents(Long groupId);

    void addStudent(Long id,Student student);

    Student getStudentById(Long id);

    void updateStudent(Student student, Long id);

    void deleteStudent(Long id);

    void assignStudent(Long groupId,Long studentId) throws IOException;
}
