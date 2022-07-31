package com.jinik.service.dummy;

import com.jinik.domain.dummy.Dummy;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public record AdminDummyService(DummyService dummyService) {

    public List<Dummy> findByAll() {
        return dummyService.findAll();
    }

    public Dummy save(@RequestBody Dummy dummy) {
        return dummyService.save(dummy);
    }

    public Dummy findById(@PathVariable(value = "dummyId") Long id) {
        return dummyService.findById(id);
    }
}
