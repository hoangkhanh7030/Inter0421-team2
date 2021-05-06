package ShopSmartPhone.Dao;

import ShopSmartPhone.DTO.UserDTO;

public interface IUserDao extends GenericDao<UserDTO>{
    UserDTO findByUserNameAndPassword(String username,String password);

}
