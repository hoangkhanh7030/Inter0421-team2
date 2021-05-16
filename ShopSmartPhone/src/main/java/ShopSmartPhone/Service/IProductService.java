package ShopSmartPhone.Service;

import ShopSmartPhone.DTO.ProductDTO;

import java.util.List;

public interface IProductService {
    List<ProductDTO> findAll();
    List<ProductDTO>  findCategoryName(String name);
}
