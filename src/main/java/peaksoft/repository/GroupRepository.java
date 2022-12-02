package peaksoft.repository;

import peaksoft.model.Group;

import java.io.IOException;
import java.util.List;

public interface GroupRepository {
    List<Group> getAllListGroups();
    List<Group> getAlGroups(Long courseId);

    void addGroup(Group group, Long courseId);

    Group getGroupById(Long id);

    void updateGroup(Group group, Long id);

    void deleteGroup(Long id);
    void assignGroup(Long courseId, Long groupId) throws IOException;
}
