package ShopSmartPhone.Dao.impl;

import ShopSmartPhone.DTO.ProductDTO;
import ShopSmartPhone.Dao.IProductDao;
import ShopSmartPhone.Mapper.ProductMapper;

import java.util.List;

public class ProductDao extends AbtractDao<ProductDao> implements IProductDao {

    @Override
    public List<ProductDTO> findAll() {
        StringBuilder sql= new StringBuilder("SELECT * FROM product");

        return query(sql.toString(),new ProductMapper());
    }

    @Override
    public List<ProductDTO>  findCategoryName(String name) {
        StringBuilder sql =new StringBuilder("SELECT * FROM product AS pr ") ;
        sql.append("INNER JOIN category AS ct ON pr.category_id = ct.category_id ");
        sql.append("WHERE name = ?");
        return query(sql.toString(),new ProductMapper(),name);
    }
}
