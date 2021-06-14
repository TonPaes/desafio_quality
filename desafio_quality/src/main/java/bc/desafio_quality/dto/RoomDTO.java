package bc.desafio_quality.dto;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Validated
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoomDTO {
    @JsonProperty("room_name")
    @NotBlank(message = "The room name cannot be empty")
    @Pattern(regexp = "[A-Z].*", message = "The room name must initiate with a Upper case letter")
    @Size(max = 30, message = "The maximum length of property name is 30")
    private String room_name;
    
    @JsonProperty("room_width")
    @NotNull(message = "The room width is required")
    @Max(value = 25, message = "The maximum value of width property is 25")
    @Min(value = 1, message = "The minimum value of width property is 1")
    private double room_width;

    @JsonProperty("room_length")
    @NotNull(message = "The room height is required")
    @Max(value = 33, message = "The maximum value of height property is 33")
    @Min(value = 1, message = "The minimum value of height property is 1")
    private double room_lenght;
}
