package bc.desafio_quality.dto;

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
public class PropertyPriceResponseDTO {
    @JsonProperty("price")
    private double price;
    private String name;
    private String district;
}
