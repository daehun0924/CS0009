import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class copy {
    public static void main(String[] args) throws IOException { // ���� ����
        File source = new File(args[0]); // chmod a=r
        File target = new File(args[1]);

        if (source.exists()) {
            if (target.exists()) { // ���� ����� �����
                Scanner sc = new Scanner(System.in);
                System.out.print("Overwrite?(y/n): ");
                char ch = sc.next().charAt(0);
                if (ch == 'y') {
                    Files.copy(source.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    System.out.println("Overwrited");
                } else
                    System.out.println("Canceled");
                sc.close();
            } else {
                Files.copy(source.toPath(), target.toPath());
                System.out.println("Copied");
            }
        } else
            System.out.println(source+" not found");
    }
}