package com.maplr.testhockeygame.persistence.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.maplr.testhockeygame.persistence.entity.TeamEntity;

@Repository
public interface ITeamDao extends JpaRepository<TeamEntity, Long> {

  Optional<TeamEntity> findByYear(long year);
}
