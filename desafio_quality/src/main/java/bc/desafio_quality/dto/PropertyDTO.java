package bc.desafio_quality.dto;

import java.util.List;

import javax.validation.Valid;
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
public class PropertyDTO {
    @JsonProperty("prop_name")
    @NotBlank(message = "No Property Name was given")
    @Pattern(regexp = "[A-Z].*", message = "Property Name should start with Upper Case letter")
    @Size(max = 30, message = "The maximun lenght of Property Name is 30 chars")
    protected String propMame;

    @JsonProperty("prop_district")
    @NotBlank(message = "No Property District was given")
    @Size(max = 45, message = "The maximun lenght of Property District is 45")
    protected String propDistrict;

    @JsonProperty("rooms")
    @NotNull(message = "The number of rooms ")
    @Size(min = 1)
    @Valid
    protected List<RoomDTO> rooms;

}
