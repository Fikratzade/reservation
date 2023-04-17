package com.bookingcalendar.model;

import jakarta.persistence.MappedSuperclass;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Base_Entity {
    private boolean is_deleted;
    @UpdateTimestamp
    private Instant updated_date;
    @CreationTimestamp
    private Instant inserted_date;
}
