package com.luandias.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luandias.dslist.entities.GameList;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> {

}
