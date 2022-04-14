package com.maplr.testhockeygame.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "PLAYER")
public class PlayerEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "playerSeq")
  @SequenceGenerator(name = "playerSeq", sequenceName = "SEQ_PLAYER", allocationSize = 1)
  @Column(name = "id_player")
  private long id;

  @Column(name = "number")
  private long number;

  @Column(name = "name")
  private String name;

  @Column(name = "lastname")
  private String lastname;

  @Column(name = "position")
  private String position;

  @Column(name = "isCaptain")
  private Boolean isCaptain;

  @ManyToOne
  @JoinColumn(name = "id_team")
  private TeamEntity team;
}
