package cn.savory.app.repository;

import cn.savory.app.repository.entity.TagEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TagRepository {

    @Autowired
    JdbcTemplate template;

    public List<TagEntity> getEntityList() {

        String sql = "select * from tag";

        return template.query(sql, new BeanPropertyRowMapper<>(TagEntity.class));
    }
}
