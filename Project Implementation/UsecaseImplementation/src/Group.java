
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupName;
    private List<User> members = new ArrayList<>();
    private FileRepository repository = new FileRepository();

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public void addMember(User user) {
        members.add(user);
        System.out.println(user.getUsername() + " has joined the group " + groupName);
    }

    public void uploadMaterial(User user, String filePath) {
        if (members.contains(user)) {
            if (repository.storeFile(filePath)) {
                NotificationService.notifyMembers(members, "New material uploaded by " + user.getUsername());
            }
        } else {
            System.out.println("User not authorized to upload materials in this group.");
        }
    }
}

