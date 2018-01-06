package ssm.dao;

import ssm.model.recom;

public interface recomMapper {
    int insert(recom record);

    int insertSelective(recom record);
}