package ShopSmartPhone.Service;

import ShopSmartPhone.DTO.UserDTO;

public interface IUserService {
    UserDTO findByUserNameAndPassword(String username, String password);
    UserDTO addUser(String username,String password,String fullname,int role_id);
    UserDTO findUsername(String username);
}
