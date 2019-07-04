package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Set;

@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {


    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findBy(id);
    }

    @Override
    public Visit save(Visit visit) {

        if (Objects.isNull(visit.getPet()) || Objects.isNull(visit.getPet().getOwner()) || Objects.isNull(visit.getPet().getId())
                || Objects.isNull(visit.getPet().getOwner().getId())) {
            throw new RuntimeException("Invalid Visit");
        }

        return super.save(visit);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
