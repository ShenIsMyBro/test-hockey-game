package com.maplr.testhockeygame.persistence.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "TEAM")
public class TeamEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teamSeq")
  @SequenceGenerator(name = "teamSeq", sequenceName = "SEQ_TEAM", allocationSize = 1)
  @Column(name = "id")
  private long id;

  @Column(name = "coach")
  private String coach;

  @Column(name = "year")
  private long year;

  @OneToMany(mappedBy = "team")
  private Set<PlayerEntity> players;
}
