package klyuev.solver.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AirflowModel {
    @NotNull(message = "Расход воздуха не может быть пустым")
    @Positive(message = "Расход воздуха должен быть положительным числом")
    private Integer airflowRate;

    @NotNull(message = "Ширина не может быть пустой")
    @Positive(message = "Ширина должна быть положительным числом")
    private Integer width;

    @NotNull(message = "Высота не может быть пустой")
    @Positive(message = "Высота должна быть положительным числом")
    private Integer height;

}