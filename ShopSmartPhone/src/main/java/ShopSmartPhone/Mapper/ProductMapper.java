package ShopSmartPhone.Mapper;

import ShopSmartPhone.DTO.CategoryDTO;
import ShopSmartPhone.DTO.ProductDTO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<ProductDTO>{

    @Override
    public ProductDTO mapRow(ResultSet rs) {
        try {
            ProductDTO productDTO = new ProductDTO();
            productDTO.setProduct_id(rs.getLong("product_id"));
            productDTO.setProduct_name(rs.getString("product_name"));
            productDTO.setProduct_price(rs.getString("product_price"));
            productDTO.setProduct_amount(rs.getInt("product_amount"));
            productDTO.setProduct_img(rs.getString("product_img"));
            productDTO.setProduct_detail(rs.getString("product_detail"));
            try {
                CategoryDTO categoryDTO = new CategoryDTO();
                categoryDTO.setCategory_id(rs.getLong("category_id"));
                categoryDTO.setName(rs.getString("name"));
                categoryDTO.setCode(rs.getString("code"));
                productDTO.setCategoryDTO(categoryDTO);
            }catch (Exception e){
                e.printStackTrace();
            }
            return productDTO;
        } catch (SQLException throwables) {
            return null;
        }

    }
}
