package ru.rosbank.javaschool.crudapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.rosbank.javaschool.crudapi.entity.FileContainerEntity;
import ru.rosbank.javaschool.crudapi.entity.PostEntity;
import ru.rosbank.javaschool.crudapi.repository.FileContainerRepository;
import ru.rosbank.javaschool.crudapi.repository.PostRepository;

import java.util.List;

@SpringBootApplication
public class CrudApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(CrudApiApplication.class, args);
  }

  @Bean
  public CommandLineRunner runner(PostRepository repository, FileContainerRepository containerRepository) {
    return args -> {
      repository.saveAll(List.of(
              new PostEntity(0, "First", "img.png", false, 0),
              new PostEntity(0, "Second", null, false, 0),
              new PostEntity(0, "Third", null, false, 0)
      ));
      containerRepository.saveAll(List.of(
              new FileContainerEntity(0,"Это картинка", null, "image",false),
              new FileContainerEntity(0,"Это видео", null, "video",false),
              new FileContainerEntity(0,"Это аудио", null, "audio",false)
      ));
    };
  }

}
