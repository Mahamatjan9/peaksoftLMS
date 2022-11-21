package peaksoft.repository.repositoryImpl;

import org.springframework.stereotype.Repository;
import peaksoft.model.Company;
import peaksoft.model.Course;
import peaksoft.repository.CourseRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CourseRepositoryImpl implements CourseRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Course> getAllCourses() {
        return  entityManager.createQuery("from Course",Course.class).getResultList();
    }

    @Override
    public void addCourse(Course course) {
        entityManager.persist(course);

    }

    @Override
    public Company getCourseById(Long id) {
        return entityManager.find(Company.class,id);
    }

    @Override
    public void updateCourse(Course course) {
        entityManager.merge(course);

    }

    @Override
    public void deleteCourse(Course course) {
        entityManager.remove(entityManager.contains(course) ? course: entityManager.merge(course));

    }
}
