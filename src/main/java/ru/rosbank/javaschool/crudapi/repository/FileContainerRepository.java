package ru.rosbank.javaschool.crudapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.rosbank.javaschool.crudapi.entity.FileContainerEntity;

import java.util.List;


public interface FileContainerRepository extends JpaRepository<FileContainerEntity, Integer> {

    @Query("SELECT f FROM FileContainerEntity f WHERE f.extension = 'image'")
    List<FileContainerEntity> findAllImage();

    @Query("SELECT f FROM FileContainerEntity f WHERE f.extension = 'video'")
    List<FileContainerEntity> findAllVideo();

    @Query("SELECT f FROM FileContainerEntity f WHERE f.extension = 'audio'")
    List<FileContainerEntity> findAllAudio();
}
