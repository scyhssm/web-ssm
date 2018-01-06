package ssm.dao;

import ssm.model.user;

public interface userMapper {
    int insert(user record);

    int insertSelective(user record);
}