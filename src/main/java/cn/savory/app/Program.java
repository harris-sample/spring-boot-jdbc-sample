package cn.savory.app;

import cn.savory.app.repository.BrandRepository;
import cn.savory.app.repository.CategoryCrudRepository;
import cn.savory.app.repository.TagJpaRepository;
import cn.savory.app.repository.entity.BrandEntity;
import cn.savory.app.repository.entity.CategoryEntity;
import cn.savory.app.repository.entity.TagEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Program implements CommandLineRunner {

    @Autowired
    private BrandRepository brandRepository;

    @Autowired
    private CategoryCrudRepository categoryCrudRepository;

    @Autowired
    private TagJpaRepository tagJpaRepository;

    @Override
    public void run(String... strings) throws Exception {

        {
            List<BrandEntity> items = brandRepository.getEntityList();
            for (BrandEntity item : items) {
                System.out.println(item.getId() + " - " + item.getName());
            }

        }

        {
            Iterable<CategoryEntity> entityList = categoryCrudRepository.findAll();
            for (CategoryEntity item : entityList) {
                System.out.println(item.getId() + " - " + item.getName());
            }
        }

        {
            List<TagEntity> entityList = tagJpaRepository.findAll();
            for (TagEntity item : entityList) {
                System.out.println(item.getId() + " - " + item.getName());
            }
        }
    }
}
