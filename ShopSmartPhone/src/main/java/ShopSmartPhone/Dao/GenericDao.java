package ShopSmartPhone.Dao;

import ShopSmartPhone.Mapper.RowMapper;

import java.util.List;

public interface GenericDao<T> {
    <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
}
