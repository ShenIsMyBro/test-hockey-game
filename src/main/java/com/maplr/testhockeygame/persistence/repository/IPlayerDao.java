package com.maplr.testhockeygame.persistence.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.maplr.testhockeygame.persistence.entity.PlayerEntity;
import com.maplr.testhockeygame.persistence.entity.TeamEntity;

@Repository
public interface IPlayerDao extends JpaRepository <PlayerEntity, Long> {

  Optional<PlayerEntity> findById(long id);

  Optional<PlayerEntity> findByTeamAndIsCaptainIsTrue(TeamEntity team);
}
