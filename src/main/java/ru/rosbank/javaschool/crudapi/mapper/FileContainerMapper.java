package ru.rosbank.javaschool.crudapi.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.rosbank.javaschool.crudapi.dto.FileContainerDto;
import ru.rosbank.javaschool.crudapi.entity.FileContainerEntity;


@Mapper(componentModel = "spring")
public interface FileContainerMapper {

    FileContainerDto entityToFileContainerDto(FileContainerEntity entity);

    @Mapping(target = "removed", constant = "false")
    FileContainerEntity dtoToFileContainerEntity (FileContainerDto dto);
}
