package ru.rosbank.javaschool.crudapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.rosbank.javaschool.crudapi.dto.FileContainerDto;
import ru.rosbank.javaschool.crudapi.mapper.FileContainerMapper;
import ru.rosbank.javaschool.crudapi.repository.FileContainerRepository;


import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class FileContainerService {

    private final FileContainerRepository repository;
    private final FileContainerMapper mapper;


    public List<FileContainerDto> getAll() {
        return repository.findAll().stream()
                .map(mapper::entityToFileContainerDto)
                .collect(Collectors.toList());
    }

    public void removeById(int id) {
        repository.deleteById(id);
    }

    public FileContainerDto save(FileContainerDto dto){
        return mapper.entityToFileContainerDto(repository.save(mapper.dtoToFileContainerEntity(dto)));
    }

    public List<FileContainerDto> findImages(){
        return repository.findAllImage().stream()
                .map(mapper::entityToFileContainerDto)
                .collect(Collectors.toList());
    }

    public List<FileContainerDto> findVideos(){
        return repository.findAllVideo().stream()
                .map(mapper::entityToFileContainerDto)
                .collect(Collectors.toList());
    }

    public List<FileContainerDto> findAudio(){
        return repository.findAllAudio().stream()
                .map(mapper::entityToFileContainerDto)
                .collect(Collectors.toList());
    }

}
