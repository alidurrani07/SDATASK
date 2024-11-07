
import java.util.List;

public class NotificationService {
    public static void notifyMembers(List<User> members, String message) {
        for (User member : members) {
            System.out.println("Notification to " + member.getUsername() + ": " + message);
        }
    }
}