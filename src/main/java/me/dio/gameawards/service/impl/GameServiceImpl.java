package me.dio.gameawards.service.impl;

import me.dio.gameawards.domain.model.Game;
import me.dio.gameawards.domain.model.GameRepository;
import me.dio.gameawards.service.GameService;
import me.dio.gameawards.service.exception.BusinessException;
import me.dio.gameawards.service.exception.NoContentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository repository;

    @Override
    public List<Game> findAll() {
        //List<Game> games = repository.findAll();
        //return games;
        return repository.findAll(Sort.by(Sort.Direction.DESC, "votes"));
    }

    @Override
    public Game findById(Long id) {
        //Optional<Game> game = repository.findById(id);
        //return game.orElseThrow(() -> new NoContentException());
        return repository.findById(id).orElseThrow(() -> new NoContentException());
    }

    @Override
    public void insert(Game game) {
        //repository.save(game);
        if (game.getId() !=null){
            throw new BusinessException("Os IDs é diferente de NULL na inclusão.");
        }
        repository.save(game);
    }

    @Override
    public void update(Long id, Game game) {
        Game gameDb = findById(id);
        if(gameDb.getId().equals(game.getId())){
            repository.save(game);
        }
        else{throw new BusinessException("Os IDs para alteração são divergentes");}

    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void vote(Long id) {
        Game gameDb = findById(id);
        gameDb.setVotes(gameDb.getVotes()+1);

        repository.save(gameDb);

    }
}
