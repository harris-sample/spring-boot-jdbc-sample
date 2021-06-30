package cn.savory.app.repository;

import cn.savory.app.repository.entity.BrandEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 使用 JdbcTemplate
 */
@Repository
public class BrandRepository {

    @Autowired
    JdbcTemplate template;

    public List<BrandEntity> getEntityList() {

        String sql = "select * from tag";

        return template.query(sql, new BeanPropertyRowMapper<>(BrandEntity.class));
    }
}
