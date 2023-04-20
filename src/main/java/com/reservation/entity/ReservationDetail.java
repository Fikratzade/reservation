package com.reservation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "reservation_detail")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDetail extends Base_Entity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;
    private LocalDate request_date;
    private boolean is_family;
}
