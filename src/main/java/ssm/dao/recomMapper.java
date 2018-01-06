package movie.IDao;

import movie.domain.recom;

public interface recomMapper {
    int insert(recom record);

    int insertSelective(recom record);
}