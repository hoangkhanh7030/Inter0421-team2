package ShopSmartPhone.Service.impl;

import ShopSmartPhone.DTO.ProductDTO;
import ShopSmartPhone.Dao.IProductDao;
import ShopSmartPhone.Dao.impl.ProductDao;
import ShopSmartPhone.Service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private IProductDao productDao;
    public ProductService(){
        productDao = new ProductDao();
    }
    @Override
    public List<ProductDTO> findAll() {
        return productDao.findAll();
    }

    @Override
    public List<ProductDTO> findCategoryName(String name) {

        return productDao.findCategoryName(name);
    }
}
