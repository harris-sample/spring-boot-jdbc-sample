package cn.savory.app.repository;

import cn.savory.app.repository.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * 使用 CrudRepository
 */
public interface CategoryCrudRepository extends CrudRepository<CategoryEntity, Integer> {

}
