package com.reservation.repository;

import com.reservation.entity.ReservationPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationPaymentRepository extends JpaRepository<ReservationPayment,Long> {
}
