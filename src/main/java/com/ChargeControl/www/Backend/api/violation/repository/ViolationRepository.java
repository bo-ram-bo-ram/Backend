package com.ChargeControl.www.Backend.api.violation.repository;

import com.ChargeControl.www.Backend.api.violation.domain.Violation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ViolationRepository extends JpaRepository<Violation, Long> {
    List<Violation> findByCarNumberAndResult(String carNumber, String result);
    List<Violation> findByResult(String result);
    Optional<Violation> findByViolationIdAndResult(Long violationId, String result);
}
