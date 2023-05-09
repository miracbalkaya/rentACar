package kodlama.io.rentACar.businnes.rules;

import kodlama.io.rentACar.core.utilities.exceptions.BussinesException;
import kodlama.io.rentACar.dataAccess.abstractss.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BrandBussinesRules {

    private BrandRepository brandRepository;

    public void checkIfBrandNameExists(String name){
        if (this.brandRepository.existsByName(name)){
            throw new BussinesException("Brand name already exists");
        }
    }
}
