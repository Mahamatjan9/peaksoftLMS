package peaksoft.repository;

import peaksoft.model.Company;
import peaksoft.model.Course;

import java.util.List;

public interface CourseRepository {
    List<Course> getAllCourses();

    void addCourse(Course course);

    Company getCourseById(Long id);

    void updateCourse(Course course);

    void deleteCourse(Course course);
}
