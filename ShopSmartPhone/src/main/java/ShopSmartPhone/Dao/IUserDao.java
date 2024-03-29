package ShopSmartPhone.Dao;

import ShopSmartPhone.DTO.UserDTO;

public interface IUserDao extends GenericDao<UserDTO>{
    UserDTO findByUserNameAndPassword(String username,String password);
    Long addUser(String username,String password,String fullname,int role_id);
    UserDTO findUsername(String username);
    UserDTO findOne(long id);
    Long updateProfile(Long id,String fullname,String email,int phone_number,String address,String country,String
                       bank_name,Long bank_account_number);
}
