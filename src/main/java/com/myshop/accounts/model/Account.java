package com.myshop.accounts.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Account extends Base {
private String name;
private String number;

@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
        @JoinTable(name = "account_movement",joinColumns =@JoinColumn(name = "account_id"), inverseJoinColumns = @JoinColumn(name = "movement_id"))
List<Movement> movements = new ArrayList<Movement>();

}
