import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File f = new File("C://Games1");
        if (f.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Произошла ошибка");

        File dir = new File(f, "src");
        if (dir.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Произошла ошибка");

        File dir1 = new File(f, "res");
        if (dir1.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Произошла ошибка");

        File dir2 = new File(f, "savegames");
        if (dir2.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Произошла ошибка");

        File dir3 = new File(f, "temp");
        if (dir3.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Произошла ошибка");


        File catalog = new File(dir, "main");
        if (catalog.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Произошла ошибка");

        File catalog1 = new File(dir, "test");
        if (catalog1.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Произошла ошибка");


        File subdirectory = new File(dir1, "drawables");
        if (subdirectory.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Произошла ошибка");

        File subdirectory1 = new File(dir1, "vectors");
        if (subdirectory1.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Произошла ошибка");

        File subdirectory2 = new File(dir1, "icons");
        if (subdirectory2.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Произошла ошибка");


        File file = new File("main","Main.java");
        try {
            if (file.createNewFile())
                System.out.println("Файл был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File file1 = new File( "main", "Utils.java");
        try {
            if (file1.createNewFile())
                System.out.println("Файл был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


//        В директории temp создайте файл temp.txt.
//        (Для сохранения лога используйте экземпляр класса StringBuilder. Добавляйте в него всю информацию о создании файлов и каталогов. Далее возьмите из него текст и запишите его в файл temp.txt с помощью класса FileWriter.)























    }
}