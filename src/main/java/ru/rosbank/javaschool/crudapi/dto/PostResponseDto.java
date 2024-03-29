package ru.rosbank.javaschool.crudapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.rosbank.javaschool.crudapi.entity.PostEntity;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostResponseDto {
  private int id;
  private String content;
  private String media;
  private int likes;
}
