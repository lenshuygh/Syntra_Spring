package be.lens.spring.baeldung_tutorial.command;

import be.lens.spring.baeldung_tutorial.model.Fuel;
import be.lens.spring.baeldung_tutorial.model.Transmission;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    @NotEmpty
    private String brand;
    @NotEmpty
    private String type;
    @Min(1970)
    private int year;
    @NotEmpty
    private Fuel fuel;
    @Min(0)
    private int horsePower;
    @NotEmpty
    private Transmission transmission;
    private boolean towBar;
    private String[] options;
    @Past
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate entryIntoService;
    @Pattern(regexp = "\\d-\\D\\D\\D-\\d\\d\\d")
    private String licensePlate;
    @Positive
    @NotEmpty
    @Digits(integer = 10, fraction = 2)
    private float price;
}
