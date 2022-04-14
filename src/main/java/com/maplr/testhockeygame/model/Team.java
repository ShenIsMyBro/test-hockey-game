package com.maplr.testhockeygame.model;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Team {

  private long id;

  private String coach;

  private long year;

  private Set<Player> players;
}
