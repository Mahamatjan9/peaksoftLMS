package peaksoft.repository.repositoryImpl;

import org.springframework.stereotype.Repository;
import peaksoft.model.Company;
import peaksoft.model.Course;
import peaksoft.model.Group;
import peaksoft.repository.GroupRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

//@Repository
//@Transactional

public class GroupRepositoryImpl implements GroupRepository {
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public List<Group> getAlGroups() {
//        return entityManager.createQuery("from Group", Group.class).getResultList();
//    }
//
//    @Override
//    public void addGroup(Group group) {
//        entityManager.persist(group);
//
//    }
//
//    @Override
//    public Group getGroupById(Long id) {
//        return entityManager.find(Group.class,id);
//    }
//
//    @Override
//    public void updateGroup(Group group) {
//        entityManager.merge(group);
//
//    }
//
//    @Override
//    public void deleteGroup(Group group) {
//        entityManager.remove(entityManager.contains(group) ? group: entityManager.merge(group));
//
//    }
}
