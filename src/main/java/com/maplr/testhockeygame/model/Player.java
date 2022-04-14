package com.maplr.testhockeygame.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Player {

  private long number;

  private String name;

  private String lastname;

  private String position;

  private Boolean isCaptain;
}
