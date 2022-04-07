package com.myshop.accounts.model;

import lombok.*;
import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Movement extends  Base{
    private String name;
    private Float debitValue;
    private Float creditValue;
}
