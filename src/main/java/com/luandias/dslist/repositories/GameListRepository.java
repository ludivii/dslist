package com.luandias.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.luandias.dslist.entities.GameList;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> {
	
	@Modifying
	@Query(nativeQuery = true, value = "UPDATE tb_belonging SET position = :newPosition WHERE game_list_id = :gameListId AND game_id = :gameId")
	void updateBelongingPosition(Long gameListId, Long gameId, Integer newPosition);

}
