
import java.io.File;

public class FileRepository {
    private static final long MAX_FILE_SIZE = 100 * 1024 * 1024; // 100 MB

    public boolean storeFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return false;
        }
        if (file.length() > MAX_FILE_SIZE) {
            System.out.println("Error: File size exceeds the limit of 100MB.");
            return false;
        }
        if (!isValidFileType(file.getName())) {
            System.out.println("Error: Invalid file format.");
            return false;
        }
        System.out.println("File " + file.getName() + " uploaded successfully.");
        return true;
    }

    private boolean isValidFileType(String fileName) {
        return fileName.endsWith(".pdf") || fileName.endsWith(".docx") || fileName.endsWith(".jpg");
    }
}