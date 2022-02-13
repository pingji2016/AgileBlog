package edu.nju.mapper;

import edu.nju.bean.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by agile group on 2022/1/19.
 */
@Mapper
public interface CategoryMapper {
    List<Category> getAllCategories();

    int deleteCategoryByIds(@Param("ids") String[] ids);

    int updateCategoryById(Category category);

    int addCategory(Category category);
}
