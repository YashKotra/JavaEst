import java.io.*;
class CompileDemo {
    void openFile() throws IOException {
        FileReader fr = new FileReader("abc.txt");
        System.out.println("Opened");
    }

    public static void main(String[] args) {
        CompileDemo c = new CompileDemo();
        try {
            c.openFile();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
