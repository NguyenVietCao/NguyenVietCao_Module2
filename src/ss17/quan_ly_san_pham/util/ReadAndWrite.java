package ss17.quan_ly_san_pham.util;

import ss16.doc_file_csv.Country;
import ss17.quan_ly_san_pham.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ReadAndWrite {

    Scanner scanner = new Scanner(System.in);
    static ArrayList<Product> productArrayList = new ArrayList<>();
    private static final String COUNTRY_LIST_PATH = "/Applications/Cao_laptrinh/Cao_codegym/Module2/NguyenVietCao_Module2/src/ss17/quan_ly_san_pham/data/Product.csv";
     static  File file = new File(COUNTRY_LIST_PATH);

    public static List<Product> readFileBinary(){
        List<Product> productList = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            if (file.length()>0){
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                productList = (List<Product>) objectInputStream.readObject();
            }
        }catch (IOException ioException){

    } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return productList;
}
public static void writeListProductToFileDat(List<Product> productList){
    FileOutputStream fileOutputStream = null;
    ObjectOutputStream objectOutputStream = null;
    try {
        fileOutputStream = new FileOutputStream(file);
        objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(productList);

    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
}