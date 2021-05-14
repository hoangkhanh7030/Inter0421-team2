package ShopSmartPhone.Service.impl;

import ShopSmartPhone.DTO.UserDTO;
import ShopSmartPhone.Dao.IUserDao;
import ShopSmartPhone.Dao.impl.UserDao;
import ShopSmartPhone.Service.IUserService;

public class UserService implements IUserService {
    private final IUserDao userDao;
    public UserService(){
        userDao = new UserDao();
    }
    @Override
    public UserDTO findByUserNameAndPassword(String username, String password) {
        return userDao.findByUserNameAndPassword(username,password);
    }

    @Override
    public UserDTO addUser(String username,String password,String fullname,int role_id) {
        Long userId = userDao.addUser(username,password,fullname,role_id);
        return userDao.findOne(userId);
    }


    @Override
    public UserDTO findUsername(String username) {
        return userDao.findUsername(username);
    }

    @Override
    public UserDTO updateProfile(Long id,String fullname, String email, int phone_number, String address,
                                 String country, String bank_name, Long bank_account_number) {
                 Long update = userDao.updateProfile(id,fullname,email,phone_number,address,
              country,bank_name,bank_account_number);
                return userDao.findOne(id);
    }


}
