package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.repositories.VisitsRepository;
import guru.springframework.sfgpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {

    private final VisitsRepository visitsRepository;

    public VisitSDJpaService(VisitsRepository visitsRepository) {
        this.visitsRepository = visitsRepository;
    }

    @Override
    public Set<Visit> findAll() {

        Set<Visit> visits = new HashSet<>();
        visitsRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long id) {
        return visitsRepository.findById(id).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitsRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitsRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        visitsRepository.deleteById(id);
    }
}
