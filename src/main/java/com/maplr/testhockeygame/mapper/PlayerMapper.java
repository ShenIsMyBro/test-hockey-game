package com.maplr.testhockeygame.mapper;

import org.mapstruct.Mapper;
import com.maplr.testhockeygame.model.Player;
import com.maplr.testhockeygame.persistence.entity.PlayerEntity;

@Mapper(componentModel = "spring")
public interface PlayerMapper {

  PlayerEntity playerToPlayerEntity(Player player);

  Player playerEntityToPlayer(PlayerEntity playerEntity);
}
