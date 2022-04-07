package com.myshop.accounts.model;

import lombok.AllArgsConstructor;
import lombok.Value;

@AllArgsConstructor
@Value
public class MovementDto {
    String name;
    String number;
    String nameMovement;
    Float debitValue;
    Float creditValue;
}
