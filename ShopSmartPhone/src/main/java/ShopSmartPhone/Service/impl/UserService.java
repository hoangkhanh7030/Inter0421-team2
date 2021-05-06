package ShopSmartPhone.Service.impl;

import ShopSmartPhone.DTO.UserDTO;
import ShopSmartPhone.Dao.IUserDao;
import ShopSmartPhone.Dao.impl.UserDao;
import ShopSmartPhone.Service.IUserService;

public class UserService implements IUserService {
    private IUserDao userDao;
    public UserService(){
        userDao = new UserDao();
    }
    @Override
    public UserDTO findByUserNameAndPassword(String username, String password) {
        return userDao.findByUserNameAndPassword(username,password);
    }
}
