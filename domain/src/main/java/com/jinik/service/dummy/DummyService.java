package com.jinik.service.dummy;

import com.jinik.domain.dummy.Dummy;
import com.jinik.repository.dummy.DummyRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public record DummyService(DummyRepository dummyRepository) {

    public Dummy findById(Long id) {
        return dummyRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public Dummy save(Dummy dummy) {
        return dummyRepository.save(dummy);
    }

    public List<Dummy> findAll() {
        return dummyRepository.findAll();
    }
}
