package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.services.VisitService;
<<<<<<< HEAD
import org.springframework.context.annotation.Profile;
=======
>>>>>>> 010a1c0... implemented map impl for visit service #46
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Set;

@Service
<<<<<<< HEAD
@Profile({"default", "map"})
=======
>>>>>>> 010a1c0... implemented map impl for visit service #46
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

<<<<<<< HEAD
        if (Objects.isNull(visit.getPet()) || Objects.isNull(visit.getPet().getOwner())
=======
        if (Objects.isNull(visit.getPet()) || Objects.isNull(visit.getPet().getOwner()) || Objects.isNull(visit.getPet().getId())
>>>>>>> 010a1c0... implemented map impl for visit service #46
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
