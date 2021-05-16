package ShopSmartPhone.DTO;

public class ProductDTO {
    private Long product_id;
    private String product_name;
    private String product_price;
    private int product_amount;
    private String product_img;
    private String product_detail;
    private CategoryDTO categoryDTO = new CategoryDTO();

    public ProductDTO(){

    }

    public ProductDTO(Long product_id, String product_name, String product_price,
                      int product_amount, String product_img, String product_detail, CategoryDTO categoryDTO) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_amount = product_amount;
        this.product_img = product_img;
        this.product_detail = product_detail;
        this.categoryDTO = categoryDTO;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

    public int getProduct_amount() {
        return product_amount;
    }

    public void setProduct_amount(int product_amount) {
        this.product_amount = product_amount;
    }

    public String getProduct_img() {
        return product_img;
    }

    public void setProduct_img(String product_img) {
        this.product_img = product_img;
    }

    public String getProduct_detail() {
        return product_detail;
    }

    public void setProduct_detail(String product_detail) {
        this.product_detail = product_detail;
    }

    public CategoryDTO getCategoryDTO() {
        return categoryDTO;
    }

    public void setCategoryDTO(CategoryDTO categoryDTO) {
        this.categoryDTO = categoryDTO;
    }
}
