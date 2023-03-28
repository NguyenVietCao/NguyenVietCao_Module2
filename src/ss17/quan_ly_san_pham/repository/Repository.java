package ss17.quan_ly_san_pham.repository;


import ss17.quan_ly_san_pham.model.Product;
import ss17.quan_ly_san_pham.util.ReadAndWrite;

import java.util.List;

public class Repository implements IRepository {

    @Override
    public void add(Product product) {
        List<Product> productList = ReadAndWrite.readFileBinary();
        productList.add(product);
        ReadAndWrite.writeListProductToFileDat(productList);
    }

    @Override
    public List<Product> getList() {
        return ReadAndWrite.readFileBinary();
    }

}
