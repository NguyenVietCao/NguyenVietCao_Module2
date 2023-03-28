package ss17.quan_ly_san_pham.repository;


import ss17.quan_ly_san_pham.model.Product;

import java.util.List;

public interface IRepository {
    void add(Product product);
    List<Product>getList();
}

