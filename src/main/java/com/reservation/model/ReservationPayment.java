package com.bookingcalendar.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "reservation_payment")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationPayment extends Base_Entity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;
    private short calculated_price;
    private short actual_price;
    private short advance_payment;
}
