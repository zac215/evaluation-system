package org.isge.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
@Data
@Getter
@Setter
public class CreateEvaluationDto {
    private Integer note;
    private String utilisateur;
}
