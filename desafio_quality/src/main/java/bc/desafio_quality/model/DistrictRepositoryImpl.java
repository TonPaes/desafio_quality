package bc.desafio_quality.model;

import java.util.Map;

import org.springframework.stereotype.Repository;

import bc.desafio_quality.dto.DistrictDTO;
import bc.desafio_quality.exception.DistrictDoestNotExistsException;

@Repository
public class DistrictRepositoryImpl {
    public static  Map<String, DistrictDTO> districts = Map.of(
            "Mooca", new DistrictDTO("Mooca", 10D),
            "Osasco", new DistrictDTO("Osasco", 1D),
            "Interlagos", new DistrictDTO("Interlagos", 7D),
            "Morumbi", new DistrictDTO("Morumbi", 5D)
    );

    public static DistrictDTO getByName(String name) {
        DistrictDTO district = DistrictRepositoryImpl.districts.get(name);
        
        if(district == null)
            throw new DistrictDoestNotExistsException(name);
        
        return district;
    }
}
