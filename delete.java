import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class delete {
    public static void main(String[] args) throws IOException { 
        File target = new File(args[0]);
        
        if (target.exists()) {
            if (target.isDirectory()) {
                String[] files = target.list();
                if (files.length > 0) { 
                    System.out.println("Dir is Empty");
                    Files.delete(target.toPath());
                    System.out.println("Dir Deleted");
                } else {
                    System.out.println("Dir is not Empty");
		Files.delete(target.toPath());
                    System.out.println("Failed");
                }
            } else {
                Files.delete(target.toPath());
                System.out.println("File Deleted");
            }
        }
        else System.out.println(target+" not Found");
    }
}