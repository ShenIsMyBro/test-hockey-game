package com.maplr.testhockeygame.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.maplr.testhockeygame.mapper.PlayerMapper;
import com.maplr.testhockeygame.model.Player;
import com.maplr.testhockeygame.service.PlayerService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/api")
@AllArgsConstructor
public class PlayerController {

  private final PlayerService playerService;
  private final PlayerMapper playerMapper;

  /**
   * Endpoint permettant de changer le capitaine d'une équipe à partir de l'id d'un joueur
   * @param id L'id du joueur qui devient capitaine
   * @return Réponse 200 avec le joueur dans le body, en cas d'erreur (Joueur non trouvé) on retourne un 404
   */
  @PutMapping(value = "/player/captain/{ID}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Player> updateCaptain(@PathVariable(value = "ID") long id) {
      return ResponseEntity.ok(playerMapper.playerEntityToPlayer(playerService.updateCaptain(id)));
  }
}
