//package gr.aueb.cf.cf9.ch9;
//import java.io.*;
//import java.nio.charset.StandardCharsets;
//
//public class FileWritersJavaIo {
//    public static void main(String[] args) {
//        File file = new File("C:\\Users\\giann\\IdeaProjects\\P1_D1_CF\\src\\gr\\aueb\\cf\\cf9\\ch9\\file.txt");
//
//        try {
//            fileWriter("C:\\Users\\giann\\IdeaProjects\\P1_D1_CF\\src\\gr\\aueb\\cf\\cf9\\ch9\\file.txt");
//        } catch (IOException e) {
//            System.out.println("Error");
//        }
//    }
//
//    public static void fileWriter(String file) throws IOException{
//        try (FileWriter fw = new FileWriter(file, StandardCharsets.UTF_8, true)) {
//            fw.write("Hello World");
//            fw.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//            throw e;
//        }
//    }
//    public static void bufferWriter(String file) throws IOException{
//        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, StandardCharsets.UTF_8, true))) {
//            bw.write("Hello World");
//            bw.newLine();
//            bw.flush();
//        } catch (IOException e){
//            e.printStackTrace();
//            throw e;
//        }
//    }
//
//    public static void printStream(String file) {
//        try (PrintStream ps = new PrintStream(file);) {
//            ps.println("Hello World");
//        } catch (IOException e) {
//            throw e;
//        }
//    }
//
//    public static void printSayHello(PrintStream ps) {
//        ps.println("Hello coding");
//    }
//
//}
