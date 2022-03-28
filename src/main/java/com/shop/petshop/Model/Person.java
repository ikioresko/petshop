package com.shop.petshop.Model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString(of = {"id", "username", "lastName", "goods"})
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Version
    private int version;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private boolean active;
    @OneToOne
    private Wallet wallet;
    @OneToMany
    private Set<Goods> goods;

}
