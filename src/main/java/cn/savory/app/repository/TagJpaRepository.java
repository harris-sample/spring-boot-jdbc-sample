package cn.savory.app.repository;

import cn.savory.app.repository.entity.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 使用 JpaRepository
 */
public interface TagJpaRepository extends JpaRepository<TagEntity, Integer> {
}
