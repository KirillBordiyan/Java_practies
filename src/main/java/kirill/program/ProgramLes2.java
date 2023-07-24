package kirill.program;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ProgramLes2 {
     public static void main(String[] args) {
         Path path = Path.of("input.txt"); //описывает путь
         boolean exist = Files.exists(path);
         System.out.println(exist); //true, существует ли файл

         //создание своего
         //dir/file.txt

//         Path dir = Path.of("root","dir");
//         Files.createDirectory(dir);
//
//         Path file = Path.of("dir", "file.txt");
//         Files.createDirectory(file);
//
//         Files.writeString(path,"cont cont", StandardOpenOption.WRITE); //запись, параметр StandardOpenOption можно менять

    }
}
