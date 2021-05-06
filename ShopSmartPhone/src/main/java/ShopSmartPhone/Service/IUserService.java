package ShopSmartPhone.Service;

import ShopSmartPhone.DTO.UserDTO;

public interface IUserService {
    UserDTO findByUserNameAndPassword(String username, String password);
}
