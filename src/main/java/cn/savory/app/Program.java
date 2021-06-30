package cn.savory.app;

import cn.savory.app.repository.entity.TagEntity;
import cn.savory.app.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Program implements CommandLineRunner {

    @Autowired
    TagRepository tagRepository;

    @Override
    public void run(String... strings) throws Exception {

        List<TagEntity> items = tagRepository.getEntityList();

        for (TagEntity item : items) {
            System.out.println(item.getId() + " - " + item.getName() + " - " + item.getRemark());
        }
    }
}
