package com.elearningplatform.studygroup.notification;

import com.elearningplatform.studygroup.user.User;
import java.util.List;

public class NotificationService {
    public static void notifyMembers(List<User> members, String message) {
        for (User member : members) {
            System.out.println("Notification to " + member.getUsername() + ": " + message);
        }
    }
}
