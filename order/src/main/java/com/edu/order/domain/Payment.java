package com.edu.order.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne
    User payUser;

    @NotEmpty
    String cardNumber;
    @NotEmpty
    String cardName;
    @NotEmpty
    String expMonthYear;
    @NotEmpty
    String cvv;
}
