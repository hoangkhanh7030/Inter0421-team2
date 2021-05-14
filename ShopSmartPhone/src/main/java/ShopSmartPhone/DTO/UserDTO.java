package ShopSmartPhone.DTO;

public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private String fullname;
    private int role_id;
    private String email;
    private int phone_number;
    private String address;
    private String country;
    private String bank_name;
    private Long bank_account_number;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public Long getBank_account_number() {
        return bank_account_number;
    }

    public void setBank_account_number(Long bank_account_number) {
        this.bank_account_number = bank_account_number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDTO(){

   }

    public UserDTO(String username, String password, String fullname, int role_id) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.role_id = role_id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    private RoleDTO role = new RoleDTO();

    public RoleDTO getRole() {
        return role;
    }

    public void setRole(RoleDTO role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }
}
