package com.bookingcalendar.repository;

import com.bookingcalendar.model.ReservationDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationDetailRepository extends JpaRepository<ReservationDetail,Long> {
}
