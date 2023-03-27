package ss16.doc_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Country> countryArrayList = new ArrayList<>();
    private static final String COUNTRY_LIST_PATH = "/Applications/Cao_laptrinh/Cao_codegym/Module2/NguyenVietCao_Module2/src/ss16/doc_file_csv/countries.csv";

    public static void main(String[] args) {
        File file = new File(COUNTRY_LIST_PATH);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                String [] array = line.split(",");
                Country country = new Country(Integer.parseInt(array[0]),array[1],array[2]);
                countryArrayList.add(country);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (Country c:countryArrayList) {
            System.out.println(c);
        }
    }
}
