package ssm.dao;

import ssm.model.movie;

public interface movieMapper {
    int insert(movie record);

    int insertSelective(movie record);
}