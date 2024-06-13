package hw;

import java.io.*;
import java.util.*;

public class te {

    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        try {
            // tạo file
            File file = new File("D:\\PT-HN\\MD2-JAVA-BAs\\Session05\\input.txt");
            if (file.createNewFile()) {
                System.out.println("create success");
            } else {
                System.out.println("File exists");
            }
            File file1 = new File("D:\\PT-HN\\MD2-JAVA-BAs\\Session05\\output.txt");
            if (file1.createNewFile()) {
                System.out.println("create success");
            } else {
                System.out.println("File exists");
            }
            // đọc file
            in = new FileReader(file);
            out = new FileWriter(file1, true);
            BufferedReader br = new BufferedReader(in);
            BufferedWriter bw = new BufferedWriter(out);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                // ghi file
                bw.write(line + "\n");
            }
            bw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // đóng file
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}



