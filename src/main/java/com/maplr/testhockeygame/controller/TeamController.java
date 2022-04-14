package com.maplr.testhockeygame.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.maplr.testhockeygame.exception.TeamNotFoundException;
import com.maplr.testhockeygame.mapper.PlayerMapper;
import com.maplr.testhockeygame.mapper.TeamMapper;
import com.maplr.testhockeygame.model.Player;
import com.maplr.testhockeygame.model.Team;
import com.maplr.testhockeygame.service.PlayerService;
import com.maplr.testhockeygame.service.TeamService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/api")
@AllArgsConstructor
public class TeamController {

  private final TeamService teamService;
  private final PlayerService playerService;
  private final TeamMapper teamMapper;
  private final PlayerMapper playerMapper;


  /**
   * Endpoint permettant de récupérer une équipe à partir de l'année
   * @param year L'année de l'équipe
   * @return Réponse 200 avec l'équipe dans le body, en cas d'erreur (Equipe non trouvé) on retourne un 404
   */
  @GetMapping(value = "/team/{year}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Team> getTeamByYear(@PathVariable(value = "year") long year) {
      return ResponseEntity.ok(this.teamMapper.teamEntityToTeam(teamService.findTeamByYear(year).orElseThrow(() -> new TeamNotFoundException("Team of " + year + " doesn't exist"))));
  }

  /**
   * Endpoint permettant d'ajouter un joueur dans une équipe
   * @param player Body de la requête : le joueur
   * @param year L'année de l'équipe
   * @return Réponse 201 avec le joueur ajouté, en cas d'erreur (Equipe non trouvé) on retourne un 404
   */
  @PostMapping(value = "/team/{year}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Player> addPlayer(@RequestBody Player player,
      @PathVariable(value = "year") long year) {
    var newPlayer = this.playerMapper.playerToPlayerEntity(player);
      return new ResponseEntity<>(this.playerMapper.playerEntityToPlayer(playerService.addPlayer(newPlayer, year)),
          HttpStatus.CREATED);
  }
}
