package com.maplr.testhockeygame.service;

import static java.lang.Boolean.TRUE;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.maplr.testhockeygame.exception.PlayerNotFoundException;
import com.maplr.testhockeygame.exception.TeamNotFoundException;
import com.maplr.testhockeygame.persistence.entity.PlayerEntity;
import com.maplr.testhockeygame.persistence.entity.TeamEntity;
import com.maplr.testhockeygame.persistence.repository.IPlayerDao;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PlayerService {

  private final IPlayerDao playerDao;
  private final TeamService teamService;

  /**
   * Méthode permettant d'ajouter un joueur dans une équipe
   * @param player Le joueur à ajouter
   * @param year L'année de l'équipe dans laquelle on ajoute le joueur
   * @return Le joueur qui a été ajouté
   */
  public PlayerEntity addPlayer(PlayerEntity player, long year) {
    return teamService.findTeamByYear(year).map(team -> {
      player.setTeam(team);
      if (TRUE.equals(player.getIsCaptain())) {
        return updateCaptain(player.getId());
      }
    return player;
    }).orElseThrow(() -> new TeamNotFoundException("Team of " + year + " doesn't exist"));
  }

  /**
   * Méthode permettant de changer le capitaine d'une équipe
   * @param id L'id du joueur en base qui devient capitaine
   * @return Le joueur devenu capitaine
   */
  public PlayerEntity updateCaptain(long id) {
    return this.findById(id).map(newCaptain -> {
      var oldCaptainOpt = this.findByTeamAndIsCaptainIsTrue(newCaptain.getTeam());
      oldCaptainOpt.ifPresent(oldCaptain -> {
        oldCaptain.setIsCaptain(false);
        playerDao.save(oldCaptain);
      });
      newCaptain.setIsCaptain(true);
      return playerDao.save(newCaptain);
    }).orElseThrow(() -> new PlayerNotFoundException("Player with the id " + id + " doesn't exist"));
  }

  /**
   * Méthode permettant de récupérer un joueur à partir de son id
   * @param id L'id du joueur en base
   * @return Le joueur si l'id correspond sinon null
   */
  public Optional<PlayerEntity> findById(long id) {
    return playerDao.findById(id);
  }

  /**
   * Méthode permettant de récupérer le capitaine d'une équipe
   * @param teamEntity L'équipe à laquelle le joueur appartient
   * @return Le joueur capitaine actuel de l'équipe
   */
  public Optional<PlayerEntity> findByTeamAndIsCaptainIsTrue(TeamEntity teamEntity) {
    return playerDao.findByTeamAndIsCaptainIsTrue(teamEntity);
  }
}
