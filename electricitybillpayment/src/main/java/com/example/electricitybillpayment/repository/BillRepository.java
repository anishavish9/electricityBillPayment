package com.example.electricitybillpayment.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.electricitybillpayment.domain.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {
    Bill findBymeterNumber(String meterNumber);
    Optional<Bill> getByMeterNumber(String meterNumber);
}