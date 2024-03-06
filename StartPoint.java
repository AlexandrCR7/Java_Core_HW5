package Lesson_5;

import java.io.File;
import java.io.IOException;

public class StartPoint {
    public static void main(String[] args) throws IOException {
        DirectoryCreater directoryCreater = new DirectoryCreater();
        directoryCreater.dirCreater();
        File sourse = new File("""
                "C:\\Коммерческий Директор это я\\Рабочая тетрадь\\java\\Lesson_5""");
        File dest = new File("C:\\Коммерческий Директор это я\\Рабочая тетрадь\\" +
                "java\\Lesson_5\\file_0.txt" +
                "src\\main\\java\\Lesson_5\\backup");
        DirectoryCreater directoryCreater1 = new DirectoryCreater();
        directoryCreater1.backupCreator();
    }
}
