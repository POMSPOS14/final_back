package ru.rosbank.javaschool.crudapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.rosbank.javaschool.crudapi.constraint.StopList;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostSaveRequestDto {
  @Min(value = 0, message = "error.validation.value")
  private int id;
  @NotNull
  @Size(min = 2, message = "error.validation.min_size")
  @Size(max = 10, message = "error.validation.max_size")
  @StopList(value = {"bad", "dislike"}, message = "error.validation.stop_list")
  private String content;
  private String media;
}
