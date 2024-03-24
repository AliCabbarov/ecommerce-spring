package com.example.ecommerse.model.entity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private OrderStatus orderStatus;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Cart cart;
}
