package ShopSmartPhone.Dao.impl;

import ShopSmartPhone.DTO.UserDTO;
import ShopSmartPhone.Dao.IUserDao;
import ShopSmartPhone.Mapper.UserMapper;

import java.util.List;

public class UserDao extends AbtractDao<UserDTO> implements IUserDao {

    @Override
    public UserDTO findByUserNameAndPassword(String username, String password) {
        StringBuilder sql =new StringBuilder("SELECT * FROM user AS u ") ;
        sql.append("INNER JOIN role AS r ON r.role_id = u.role_id ");
        sql.append("WHERE username = ? AND password = ?");
        List<UserDTO> userDTOList = query( sql.toString(),new UserMapper(),username,password);
        return userDTOList.isEmpty() ? null : userDTOList.get(0);

    }
}
