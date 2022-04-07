package com.myshop.accounts.service;

import com.myshop.accounts.model.Movement;
import com.myshop.accounts.model.MovementDto;
import com.myshop.accounts.repository.BaseRepository;
import com.myshop.accounts.repository.MovementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovementServiceImpl extends BaseServiceImpl<Movement, Long> implements MovementService {

    private final MovementRepository movementRepository;

    public MovementServiceImpl(BaseRepository<Movement, Long> baseRepository, MovementRepository movementRepository) {
        super(baseRepository);
        this.movementRepository = movementRepository;
    }

    public List<MovementDto> movementList(String filtro) throws Exception {
        try {
            return movementRepository.getMovementsByAccount(filtro);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }
}
