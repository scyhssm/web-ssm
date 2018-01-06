package movie.IDao;

import movie.domain.rating;

public interface ratingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(rating record);

    int insertSelective(rating record);

    rating selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(rating record);

    int updateByPrimaryKey(rating record);
}