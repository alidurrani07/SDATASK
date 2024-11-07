
import com.elearningplatform.studygroup.Group;
import com.elearningplatform.studygroup.user.User;

public class Main {
    public static void main(String[] args) {
        // Create users
        User user1 = new User("Alice", true);  // Group leader
        User user2 = new User("Bob", false);   // Regular member

        // Create a study group and add members
        Group studyGroup = new Group("Math Study Group");
        studyGroup.addMember(user1);
        studyGroup.addMember(user2);

        // User attempts to upload a study material
        String filePath = "path/to/study_material.pdf";  // Example file path
        studyGroup.uploadMaterial(user1, filePath);       // Successful upload by authorized user
        studyGroup.uploadMaterial(user2, filePath);       // Successful upload by another member
    }
}
