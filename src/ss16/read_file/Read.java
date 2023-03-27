package ss16.read_file;

import java.io.*;

public class Read {
    public static void main(String[] args) {
        File file = new File("/Applications/Cao_laptrinh/Cao_codegym/Module2/NguyenVietCao_Module2/src/ss16/read_file/hello.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        while (true){
            try {
                if (!((line = bufferedReader.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.printf(line);
        }
    }
}
