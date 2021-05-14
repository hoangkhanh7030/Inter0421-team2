package ShopSmartPhone.Mapper;

import ShopSmartPhone.DTO.RoleDTO;
import ShopSmartPhone.DTO.UserDTO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<UserDTO>{

    @Override
    public UserDTO mapRow(ResultSet rs) {
        try {
            UserDTO userDTO = new UserDTO();
            userDTO.setId(rs.getLong("id"));
            userDTO.setUsername(rs.getString("username"));
            userDTO.setPassword(rs.getString("password"));
            userDTO.setFullname(rs.getString("fullname"));
            userDTO.setEmail(rs.getString("email"));
            userDTO.setPhone_number(rs.getInt("phone_number"));
            userDTO.setAddress(rs.getString("address"));
            userDTO.setCountry(rs.getString("country"));
            userDTO.setBank_name(rs.getString("bank_name"));
            userDTO.setBank_account_number(rs.getLong("bank_account_number"));
            try {
                RoleDTO roleDTO = new RoleDTO();
                roleDTO.setRole_id(rs.getInt("role_id"));
                roleDTO.setRole_name(rs.getString("role_name"));
                userDTO.setRole(roleDTO);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            return userDTO;

        } catch (SQLException throwables) {
            return null;
        }
    }
}
