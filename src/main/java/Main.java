import javax.annotation.processing.SupportedSourceVersion;
import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {
    public static <fileWriter> void main(String[] args) throws InterruptedException {
        File file = new File("F:\\Games"); // путь к корневой папки

        File filetemp = new File("F:\\Games", "temp");
        try {
            if (filetemp.mkdir()) {
                System.out.println("директорий \"temp\" успешно создан!!!");
                System.out.println("Получаю путь к директорию: " + filetemp.getPath());
            } else {
                throw new IOException("Ошибка в создании директория: \"temp\"");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File fileSrc = new File("F:\\Games", "src"); // создание вложенной папки src
        try {
            if (fileSrc.mkdir()) {
                System.out.println("директорий \"src\"успешно создан!!!");
                System.out.println("Получаю путь к директорию: " + fileSrc.getPath());
            } else {
                throw new IOException("Ошибка в создании директория: \"src\"");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File filerRes = new File("F:\\Games", "res");
        try {
            if (filerRes.mkdir()) {
                System.out.println("Директорий: \"res\" - успешно создан!!!");
                System.out.println("Получаю путь к директорию: " + filerRes.getPath());
            } else {
                throw new IOException("Ошибка в создании директория: \"res\"");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File fileSavegames = new File("F:\\Games", "savegames");
        try {
            if (fileSavegames.mkdir()) {
                System.out.println("Директорий: \"savegames\" - успешно создан!!!");
                System.out.println("Получаю путь к директорию: " + fileSavegames.getPath());
            } else {
                throw new IOException("Ошибка в создании директория: \"savegames\"");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File fileTemp = new File("F:\\Games", "temp");
        try {
            if (fileSavegames.mkdir()) {
                System.out.println("Директорий: \"temp\" - успешно создан!!!");
                System.out.println("Получаю путь к директорию: " + fileTemp.getPath());
            } else {
                throw new IOException("Ошибка в создании директория: \"temp\"");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File fileMain = new File("F:\\Games\\src", "main");
        try {
            if (fileMain.mkdir()) {
                System.out.println("директорий: \"main\" - успешно создан");
                System.out.println("Получаю путь к директорию: " + fileMain.getPath());
            } else {
                throw new IOException("Ошибка при создании директория: \"main\"");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File fileTest = new File("F:\\Games\\src", "test");
        try {
            if (fileTest.mkdir()) {
                System.out.println("директорий: \"test\" - успешно создан");
                System.out.println("Получаю путь к директорию: " + fileMain.getPath());
            } else {
                throw new IOException("Ошибка при создании директория: \"test\"");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File fileMainJava = new File("F:\\Games\\src\\main", "Main.java");
        try {
            if (fileMainJava.createNewFile()) {
                System.out.println("Файл: \"Main.java\" - успешно создан!!!");
                System.out.println("Получаю путь к файлу: " + fileMainJava.getPath());
            } else {
                throw new IOException("Ошибка при создании файла: \"Main.java\"");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File fileUtils = new File("F:\\Games\\src\\main", "Utils.java");
        try {
            if (fileUtils.createNewFile()) {
                System.out.println("Файл: \"Utils.java\" - успешно создан!!!");
                System.out.println("Получаю путь к файлу: " + fileUtils.getPath());
            } else {
                throw new IOException("Ошибка при создании файла: \"Utils.java\"");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File fileTempText = new File("F:\\Games\\temp", "temp.txt");
        try {
            if (fileTempText.createNewFile()) {
                System.out.println("Файл: \"temp.txt\" - успешно создан");
                System.out.println("Получаю путь к файлу: " + fileTempText.getPath());
            } else {
                throw new IOException("Ошибка при создании файла: \"temp.txt\"");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("директорий \"temp\" успешно создан!!!" + "\r\n");
        stringBuilder.append("Получаю путь к директорию: F:\\Games\\temp" + "\r\n");
        stringBuilder.append("директорий \"src\"успешно создан!!!" + "\r\n");
        stringBuilder.append("Получаю путь к директорию: F:\\Games\\src" + "\r\n");
        stringBuilder.append("Директорий: \"res\" - успешно создан!!!" + "\r\n");
        stringBuilder.append("Получаю путь к директорию: F:\\Games\\res" + "\r\n");
        stringBuilder.append("Директорий: \"savegames\" - успешно создан!!!" + "\r\n");
        stringBuilder.append("Получаю путь к директорию: F:\\Games\\savegames" + "\r\n");
        stringBuilder.append("Ошибка в создании директория: \"temp\"" + "\r\n");
        stringBuilder.append("директорий: \"main\" - успешно создан" + "\r\n");
        stringBuilder.append("Получаю путь к директорию: F:\\Games\\src\\main" + "\r\n");
        stringBuilder.append("директорий: \"test\" - успешно создан" + "\r\n");
        stringBuilder.append("Получаю путь к директорию: F:\\Games\\src\\main" + "\r\n");
        stringBuilder.append("Файл: \"Main.java\" - успешно создан!!!" + "\r\n");
        stringBuilder.append("Получаю путь к файлу: F:\\Games\\src\\main\\Main.java" + "\r\n");
        stringBuilder.append("Файл: \"Utils.java\" - успешно создан!!!" + "\r\n");
        stringBuilder.append("Получаю путь к файлу: F:\\Games\\src\\main\\Utils.java" + "\r\n");
        stringBuilder.append("Файл: \"temp.txt\" - успешно создан" + "\r\n");
        stringBuilder.append("Получаю путь к файлу: F:\\Games\\temp\\temp.txt" + "\r\n");
        try (FileWriter write = new FileWriter("F:\\Games\\temp\\temp.txt", false)) {
            write.write(stringBuilder.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        GameProgress gameProgress = new GameProgress(10, 8, 10, 5.5);
        GameProgress gameProgress1 = new GameProgress(8, 10, 5, 10.5);
        GameProgress gameProgress2 = new GameProgress(5, 10, 10, 100.05);

        // № 1
        FileOutputStream fileOutputStreamOne = null;
        try {
            fileOutputStreamOne = new FileOutputStream("F:\\Games\\savegames\\savegamesOne");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStreamOne);
            objectOutputStream.writeObject(gameProgress);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (fileOutputStreamOne != null) {
                    fileOutputStreamOne.close();
                    ;
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        // № 2
        FileOutputStream fileOutputStreamTwo = null;
        try {
            fileOutputStreamTwo = new FileOutputStream("F:\\Games\\savegames\\savegamesTwo");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStreamTwo);
            objectOutputStream.writeObject(gameProgress1);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (fileOutputStreamTwo != null) {
                    fileOutputStreamTwo.close();
                    ;
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        // № 3
        FileOutputStream fileOutputStreamFree = null;
        try (FileOutputStream fileOutputStream = new FileOutputStream("F:\\Games\\savegames\\savegamesFree")) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(gameProgress2);
            fileOutputStreamFree = fileOutputStream;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (fileOutputStreamFree != null) {
                    fileOutputStreamFree.close();
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        FileInputStream fileResultOne = null;
        FileInputStream fileResultTwo = null;
        FileInputStream fileResultFree = null;
        // Создание ахрива
        try (ZipOutputStream zip = new ZipOutputStream(new FileOutputStream("F:\\Games\\savegames\\zip_game.zip"))) {
            // запись в архив
            fileResultOne = new FileInputStream("F:\\Games\\savegames\\savegamesOne");
            fileResultTwo = new FileInputStream("F:\\Games\\savegames\\savegamesTwo");
            fileResultFree = new FileInputStream("F:\\Games\\savegames\\savegamesFree");
            ZipEntry entry1 = new ZipEntry("savegamesOneArchive");
            ZipEntry entry2 = new ZipEntry("savegamesTwoArchive");
            ZipEntry entry3 = new ZipEntry("savegamesFreeAchive");
            zip.putNextEntry(entry1);
            zip.putNextEntry(entry2);
            zip.putNextEntry(entry3);
            byte[] bufferOne = new byte[fileResultOne.available()];
            byte[] bufferTwo = new byte[fileResultTwo.available()];
            byte[] bufferFree = new byte[fileResultFree.available()];
            fileResultOne.read(bufferOne);
            fileResultFree.read(bufferTwo);
            fileResultFree.read(bufferFree);
            zip.write(bufferOne);
            zip.write(bufferTwo);
            zip.write(bufferFree);
            zip.closeEntry(); // закрываю поток

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (fileResultOne != null && fileResultTwo != null && fileResultFree != null) {
                    fileResultOne.close();
                    fileResultTwo.close();
                    fileResultFree.close();
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        // удаление файлов кроме архива
        String dirPath = "F:\\Games\\savegames"; // Папка, где находятся файлы
        String excludeFileName = "zip_game.zip";
        File directory = new File(dirPath);
        File[] filesInDir = directory.listFiles();
        if (filesInDir != null) {
            for (File file1 : filesInDir) {
                if (!file1.getName().equals(excludeFileName)) {
                    if (file1.delete()) {
                        System.out.println("Файл: " + file1.getName() + " удалён");
                    } else {
                        System.err.println("Ошибка при удалении файла: " + file1.getName());
                    }
                }
            }
        }
    }
}
