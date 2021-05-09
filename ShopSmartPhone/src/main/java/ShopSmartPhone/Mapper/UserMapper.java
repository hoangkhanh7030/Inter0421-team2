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
            userDTO.setUsername(rs.getString("username"));
            userDTO.setPassword(rs.getString("password"));
            userDTO.setFullname(rs.getString("fullname"));
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
