Study Group Management System
This project implements a study group management system where users can upload study materials, receive notifications, and manage groups. The system involves various classes that interact with each other, and the application structure is modeled through a Package Diagram and Use Case Diagram.

Overview
The system is divided into multiple modules:

User Management: Users can be assigned roles as group leaders or regular members.
File Upload: Group members can upload study materials with validation checks.
Notification Service: Notifies all group members whenever new materials are uploaded to the group.
Group Management: Handles group creation, member addition, and material uploading.
Project Structure
Package Diagram
The system can be understood through the following package diagram:

User Management Package:

Contains the User class that handles user attributes like username and role (group leader or regular member).
File Management Package:

Contains the FileRepository class, which handles file validation and storage (checks file size and type).
Group Management Package:

Contains the Group class, which manages group members and handles file uploads for the group.
Notification Package:

Contains the NotificationService class that is responsible for notifying group members about new material uploads.
Use Case Diagram
The use case diagram models the core functionalities of the system. The main actors and use cases are:

Actors:

Group Leader: Can add members, upload materials, and manage the group.
Regular Member: Can upload materials but has limited management permissions.
Use Cases:

Add Member to Group: The group leader can add new members to the group.
Upload Material: Both group leaders and regular members can upload materials.
Notify Members: All group members are notified when a new material is uploaded by a member.
Java Classes and Functionality
1. User.java
Attributes:

username: The name of the user.
isGroupLeader: A boolean indicating whether the user is a group leader.
Methods:

getUsername(): Returns the username.
isGroupLeader(): Returns whether the user is a group leader.
2. FileRepository.java
Attributes:
MAX_FILE_SIZE: A constant that defines the maximum file size (100MB).
Methods:
storeFile(String filePath): Validates the file, checks size, and type, and stores it if valid.
isValidFileType(String fileName): Checks whether the file type is allowed (.pdf, .docx, .jpg).
3. NotificationService.java
Methods:
notifyMembers(List<User> members, String message): Sends a notification to all members of a group.
4. Group.java
Attributes:
groupName: The name of the group.
members: A list of users who are part of the group.
repository: An instance of FileRepository to handle file uploads.
Methods:
addMember(User user): Adds a user to the group.
uploadMaterial(User user, String filePath): Allows a member to upload a file to the group, if authorized.
5. Main.java
Functionality:
Simulates the user and group creation, material uploading, and notification sending.
