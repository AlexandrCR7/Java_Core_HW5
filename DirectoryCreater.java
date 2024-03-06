package Lesson_5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirectoryCreater {

    public void dirCreater() throws IOException{
        File theDir = new File("/C:\\Коммерческий Директор это я\\" +
                "Рабочая тетрадь\\" +
                "java\\Lesson_5\\src\\main\\" +
                "java\\Lesson_5/backup1");
        if (!theDir.exists()) {
            theDir.mkdir();
        }
    }

    public void backupCreator() throws IOException {
        File sourceFile = new File("/C:\\Коммерческий Директор это я\\" +
                "Рабочая тетрадь\\" +
                "java\\Lesson_5");
        File destinationDir = new File("C:\\Коммерческий Директор это я\\" +
                "Рабочая тетрадь\\java\\Lesson_5\\src\\" +
                "main\\java\\Lesson_5\\backup");
        for(File file : sourceFile.listFiles()) {
            if (file.isFile()) {
                Files.copy(file.toPath(), Paths.get(destinationDir.getPath() + "\\" + file.getName()));
                System.out.println("Файл " + file.getName() + " успешно скопирован");
            } else {
                System.out.println("Файл уже создан");
            }
        }
    }
}
