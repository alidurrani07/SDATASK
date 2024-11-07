
public class User {
    private String username;
    private boolean isGroupLeader;

    public User(String username, boolean isGroupLeader) {
        this.username = username;
        this.isGroupLeader = isGroupLeader;
    }

    public String getUsername() {
        return username;
    }

    public boolean isGroupLeader() {
        return isGroupLeader;
    }
}
