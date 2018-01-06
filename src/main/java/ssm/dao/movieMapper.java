package movie.IDao;

import movie.domain.movie;

public interface movieMapper {
    int insert(movie record);

    int insertSelective(movie record);
}