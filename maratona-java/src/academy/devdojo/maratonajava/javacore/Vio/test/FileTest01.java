package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreate = file.createNewFile();
            System.out.println("Create = " + isCreate);

            System.out.println("path"+ file.getAbsolutePath());
            System.out.println("path directory "+ file.isDirectory());
            System.out.println("path file "+ file.isFile());
            System.out.println("path "+ file.isHidden());

            System.out.println("Last modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));

            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deleted = " + file.delete());
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
