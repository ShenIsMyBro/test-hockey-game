package com.maplr.testhockeygame.mapper;

import org.mapstruct.Mapper;
import com.maplr.testhockeygame.model.Team;
import com.maplr.testhockeygame.persistence.entity.TeamEntity;

@Mapper(componentModel = "spring")
public interface TeamMapper {

 TeamEntity teamToTeamEntity(Team team);

 Team teamEntityToTeam(TeamEntity teamEntity);
}
