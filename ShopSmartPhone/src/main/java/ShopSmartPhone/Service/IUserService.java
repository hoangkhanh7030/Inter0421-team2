package ShopSmartPhone.Service;

import ShopSmartPhone.DTO.UserDTO;

public interface IUserService {
    UserDTO findByUserNameAndPassword(String username, String password);
    UserDTO addUser(String username,String password,String fullname,int role_id);
    UserDTO findUsername(String username);
    UserDTO updateProfile(Long id,String fullname, String email, int phone_number, String address,
                          String country, String bank_name, Long bank_account_number);
}
