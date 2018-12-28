package springpetclinic.services.map;

import springpetclinic.model.Pet;
import org.springframework.stereotype.Service;
import springpetclinic.services.PetService;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteByID(id);

    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
