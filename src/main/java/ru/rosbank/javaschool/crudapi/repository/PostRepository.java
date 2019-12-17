package ru.rosbank.javaschool.crudapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.rosbank.javaschool.crudapi.entity.PostEntity;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<PostEntity, Integer> {
  List<PostEntity> findAllByContentLike(String q);
  @Modifying
  @Query("UPDATE PostEntity p SET p.likes = p.likes + :increment WHERE p.id = :id")
  void increaseLikesById(@Param("id") int id, @Param("increment") int increment);
}
