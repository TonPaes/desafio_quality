package bc.desafio_quality.model;

import bc.desafio_quality.dto.DistrictDTO;

public interface DistrictRepository {
        public DistrictDTO getByName(String name);
}
