package gr.aueb.cf.cf9.ch9;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NoReadWrite {
    public static void main(String[] args) {
        Path source = Path.of("C:\\Users\\giann\\OneDrive\\Εικόνες\\Screenshots\\sifis.png");
        Path target = Path.of("C:\\Users\\giann\\OneDrive\\Εικόνες\\Screenshots\\sifis-copy.png");
//        Path textTarget = Path.of("C:\\Users\\giann\\OneDrive\\Εικόνες\\Screenshots\\a.png");
//        try {
//            binaryReadWrite(source, target);
//        } catch (IOException e) {
//            System.out.println("Error");
//        }
    }

    public static void textWriter(Path path) throws IOException{
        Files.createDirectories(path.getParent());
        Files.writeString(
          path,
          "Hello Coding",
          StandardCharsets.UTF_8,
                StandardOpenOption.APPEND
        );
    }

    public static void textReader(Path path) throws IOException {
        String text = Files.readString(
                path,
                StandardCharsets.UTF_8
        );
        System.out.println(text);
    }

    public static void binaryReadWrite(Path source, Path target) throws IOException {
        try (var sourceStream = Files.newInputStream(source);
             var targetStream = Files.newOutputStream(target);) {
            sourceStream.transferTo(targetStream);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
