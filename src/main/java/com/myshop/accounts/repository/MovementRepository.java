package com.myshop.accounts.repository;

import com.myshop.accounts.model.Movement;
import com.myshop.accounts.model.MovementDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovementRepository extends BaseRepository<Movement, Long> {

    @Query(value = "SELECT new com.myshop.accounts.model.MovementDto( a.name,a.number, m.name, m.debitValue , m.creditValue) from  Account a inner join a.movements m where a.number =:filter")
    List<MovementDto> getMovementsByAccount(@Param("filter") String filter);
}
