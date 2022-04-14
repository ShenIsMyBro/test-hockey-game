package com.maplr.testhockeygame.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.maplr.testhockeygame.persistence.entity.TeamEntity;
import com.maplr.testhockeygame.persistence.repository.ITeamDao;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TeamService {

  private final ITeamDao teamDao;

  /**
   * Méthode permettant de récupérer l'équipe à partir d'une année
   * @param year L'année de l'équipe
   * @return L'équipe correspondant à l'année en paramètre
   */
  public Optional<TeamEntity> findTeamByYear(long year) {
    return teamDao.findByYear(year);
  }
}
