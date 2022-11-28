package peaksoft.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.model.Group;
import peaksoft.repository.GroupRepository;
import peaksoft.service.GroupService;

import java.io.IOException;
import java.util.List;
@Service

public class GroupServiceImpl implements GroupService {

    private final GroupRepository groupRepository;

    @Autowired

    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public List<Group> getAllListGroups() {
        return groupRepository.getAllListGroups();
    }

    @Override
    public List<Group> getAlGroups(Long courseId) {
        return groupRepository.getAlGroups(courseId);
    }

    @Override
    public void addGroup(Group group, Long courseId) {
        groupRepository.addGroup(group, courseId);

    }

    @Override
    public Group getGroupById(Long id) {
        return groupRepository.getGroupById(id);
    }

    @Override
    public void updateGroup(Group group,Long id) {
        groupRepository.updateGroup(group,id);

    }

    @Override
    public void deleteGroup(Long id) {
        groupRepository.deleteGroup(id);

    }

    @Override
    public void assignGroup(Long courseId, Long groupId) throws IOException {
        groupRepository.assignGroup(courseId,groupId);

    }
}
