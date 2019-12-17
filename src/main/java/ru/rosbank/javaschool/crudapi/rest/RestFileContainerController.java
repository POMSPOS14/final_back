package ru.rosbank.javaschool.crudapi.rest;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import ru.rosbank.javaschool.crudapi.dto.FileContainerDto;
import ru.rosbank.javaschool.crudapi.service.FileContainerService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/container")
public class RestFileContainerController {
    private final FileContainerService service;
    private final Logger logger = LoggerFactory.getLogger(RestPostController.class);

    @GetMapping
    public List<FileContainerDto> getAll() {
        logger.info(Thread.currentThread().getName());
        return service.getAll();
    }

    @GetMapping("/image")
    public List<FileContainerDto> getAllImage() {
        return service.findImages();
    }

    @GetMapping("/video")
    public List<FileContainerDto> getAllVideo() {
        return service.findVideos();
    }

    @GetMapping("/audio")
    public List<FileContainerDto> getAllAudio() {
        return service.findAudio();
    }

    @DeleteMapping("/{id}")
    public void removeById(@PathVariable int id) {
        service.removeById(id);
    }

    @PostMapping
    public FileContainerDto save(@RequestBody FileContainerDto dto) {
        return service.save(dto);
    }

}
