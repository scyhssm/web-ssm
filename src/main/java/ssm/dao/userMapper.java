package movie.IDao;

import movie.domain.user;

public interface userMapper {
    int insert(user record);

    int insertSelective(user record);
}