package peaksoft.repository;

import peaksoft.model.Instructor;

import java.io.IOException;
import java.util.List;

public interface InstructorRepository {

    List<Instructor> getInstructorList();
    List<Instructor> getAlInstructors(Long courseId);

    void addInstructor(Long id,Instructor instructor);

    Instructor getInstructorById(Long id);

    void updateInstructor(Instructor instructor, Long id);

    void deleteInstructor(Long id);

    void assignInstructor(Long courseId,Long instructorId) throws IOException;
}
