package peaksoft.repository.repositoryImpl;

import org.springframework.stereotype.Repository;
import peaksoft.model.Company;
import peaksoft.model.Course;
import peaksoft.model.Group;
import peaksoft.repository.GroupRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;

@Repository
@Transactional

public class GroupRepositoryImpl implements GroupRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Group> getAllListGroups() {
        return entityManager.createQuery("select g from Group g").getResultList();
    }

    @Override
    public List<Group> getAlGroups(Long courseId) {
        List<Group> groupList = entityManager.find(Course.class, courseId).getGroupList();
        groupList.forEach(System.out::println);
        return groupList;

    }

    @Override
    public void addGroup(Group group, Long courseId) {
        Course course = entityManager.find(Course.class, courseId);
        course.addGroup(group);
        group.addCourse(course);
        entityManager.merge(course);
        entityManager.merge(group);

    }

    @Override
    public Group getGroupById(Long id) {
        return entityManager.find(Group.class, id);
    }

    @Override
    public void updateGroup(Group group, Long id) {
        Group group1 = getGroupById(id);
        group1.setGroupName(group.getGroupName());
        group1.setDateOfStart(group.getDateOfStart());
        group1.setImage(group.getImage());
        entityManager.merge(group1);


    }

    @Override
    public void deleteGroup(Long id) {
        Group group = entityManager.find(Group.class, id);
        for (Course c : group.getCourseList()) {
            c.getGroupList().remove(group);
        }
        entityManager.remove(group);

    }

    @Override
    public void assignGroup(Long courseId, Long groupId) throws IOException {
        Group group = entityManager.find(Group.class, groupId);
        Course course = entityManager.find(Course.class, courseId);
        if (course.getGroupList() != null) {
            for (Group g : course.getGroupList()) {
                if (g.getId() == groupId) {
                    throw new IOException("myndai group bar!!!");
                }
            }
        }
        group.addCourse(course);
        course.addGroup(group);
        entityManager.merge(group);
        entityManager.merge(course);
    }
}
