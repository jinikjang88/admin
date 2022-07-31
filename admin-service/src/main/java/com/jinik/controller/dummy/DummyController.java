package com.jinik.controller.dummy;

import com.jinik.domain.dummy.Dummy;
import com.jinik.domain.dummy.dto.DummyDto;
import com.jinik.service.dummy.AdminDummyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dummy")
public class DummyController {

    private final AdminDummyService adminDummyService;

    public DummyController(AdminDummyService adminDummyService) {
        this.adminDummyService = adminDummyService;
    }

    @GetMapping
    public List<Dummy> findByAll() {
        return adminDummyService.findByAll();
    }

    @PostMapping
    public Dummy save(@RequestBody Dummy dummy) {
        return adminDummyService.save(dummy);
    }

    @GetMapping("/{dummyId}")
    public Dummy findById(@PathVariable(value = "dummyId") Long id) {
        return adminDummyService.findById(id);
    }
}
