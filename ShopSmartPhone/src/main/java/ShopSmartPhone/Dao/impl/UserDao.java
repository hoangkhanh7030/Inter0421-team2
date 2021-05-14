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

    @Override
    public Long addUser(String username,String password,String fullname,int role_id) {
        String sql ="INSERT INTO user (username,password,fullname,role_id) VALUES(?,?,?,?)";
        return insert(sql,username,password,fullname,role_id);
    }

    @Override
    public UserDTO findUsername(String username) {
        String sql ="SELECT * FROM user WHERE username = ?";
        List<UserDTO> users = query(sql,new UserMapper(),username);
        return users.isEmpty()?null:users.get(0);
    }

    @Override
    public UserDTO findOne(long id) {
        String sql = "SELECT * FROM user WHERE id = ?";
        List<UserDTO> news = query(sql, new UserMapper(), id);
        return news.isEmpty() ? null : news.get(0);
    }

    @Override
    public Long updateProfile(Long id,String fullname, String email, int phone_number, String address,
                              String country, String bank_name, Long bank_account_number) {
        String sql = "UPDATE user SET fullname = ? ,email = ? , phone_number = ? ,address = ? ,country = ?,bank_name = ?,bank_account_number = ? WHERE id = ?";
        return  update(sql,fullname,email,phone_number,address,country,bank_name,bank_account_number,id);
    }


}
