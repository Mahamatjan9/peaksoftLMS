package peaksoft.repository.repositoryImpl;

import org.springframework.stereotype.Repository;
import peaksoft.model.Company;
import peaksoft.model.Group;
import peaksoft.model.Instructor;
import peaksoft.model.Student;
import peaksoft.repository.StudentRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional


public class StudentRepositoryImpl implements StudentRepository {
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public List<Student> getAlStudents(Long groupId) {
//        return entityManager.createQuery("from Student", Student.class).getResultList();
//    }
//
//    @Override
//    public void addStudent(Long id, Student student) {
//        Group group = entityManager.find(Group.class,id);
//        group.addStudent(student);
//        student.setGroup(group);
//        entityManager.merge(student);
//
//
//
//    }
//
//    @Override
//    public Student getStudentById(Long id) {
//        return entityManager.find(Student.class,id);
//    }
//
//    @Override
//    public void updateStudent(Student student, Long id) {
//        Student student1 = entityManager.find(Student.class,id);
//        student1.setFirstName(student.getFirstName());
//        student1.setLastName(student.getLastName());
//        student1.setPhoneNumber(student.getPhoneNumber());
//        student1.setEmail(student.getEmail());
//        student1.setStudyFormat(student.getStudyFormat());
//        entityManager.merge(student1);
//
//
//    }
//
//    @Override
//    public void deleteStudent(Student student) {
//        student.setGroup(null);
//        entityManager.remove(student);
//
//    }
//
//    @Override
//    public void assignStudent(Long groupId, Long studentId) {
//        Group group = entityManager.find(Group.class,groupId);
//        Student student = entityManager.find(Student.class,studentId);
//        student.setGroup(group);
//        group.addStudent(student);
//        entityManager.merge(student);
//
//
//
//    }
}
