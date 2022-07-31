package com.jinik.repository.dummy;

import com.jinik.domain.dummy.Dummy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DummyRepository extends JpaRepository<Dummy, Long> {
}
