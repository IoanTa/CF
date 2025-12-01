//package gr.aueb.cf.cf9.ch9;
//
//import javax.imageio.IIOException;
//import java.io.BufferedInputStream;
//import java.io.BufferedOutputStream;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//
//public class BinaryFiles {
//    public static void main(String[] args) {
//        String inputFile = "C:\\Users\\giann\\OneDrive\\Εικόνες\\Screenshots\\sifis";
//        String outputFile = "C:\\Users\\giann\\OneDrive\\Εικόνες\\Screenshots\\sifis-copy";
//
//        try {
//            binaryFileReadWrite(inputFile, outputFile);
//        } catch (Exception e) {
//            System.out.println("Error");
//        }
//    }
//    public static void binaryFileReadWrite(String inputFile, String outputFile) throws IIOException {
//        final int bufferSize = 8192;
//        byte[] buffer = new byte[BUFFER_SIZE];
//        int bytesRead = 0;
//
//        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFile));
//            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFile))) {
//
//            while ((bytesRead = bis.read(buffer)) != -1) {
//                bos.write(buffer, 0, bytesRead);
//            }
//            System.out.println("File written successfully");
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw e;
//        }
//    }
//}
