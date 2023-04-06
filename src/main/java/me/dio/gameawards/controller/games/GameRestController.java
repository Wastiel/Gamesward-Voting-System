package me.dio.gameawards.controller.games;

import me.dio.gameawards.controller.ApiErrorDTO;
import me.dio.gameawards.controller.BaseRestController;
import me.dio.gameawards.domain.model.Game;
import me.dio.gameawards.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class GameRestController extends BaseRestController {

    @Autowired // que o spring gerencie esta instancia
    private GameService businessLayer;

    @GetMapping("games")
    public ResponseEntity<List<Game>> findAll(){
        return ResponseEntity.ok(businessLayer.findAll());
        //List<Game> games = businessLayer.findAll();
        //return ResponseEntity.ok(games);
    }

    @GetMapping("games/{id}")
    public ResponseEntity<Game> findById(@PathVariable Long id){
                return ResponseEntity.ok(businessLayer.findById(id));

                //List<Game> games = businessLayer.findById(id);
                //return ResponseEntity.ok(games);
    }
    @PostMapping("games")
    public ResponseEntity<Game> insert(@RequestBody Game game){
        businessLayer.insert(game);
        return ResponseEntity.ok(game);
        //return (ResponseEntity<Game>) ResponseEntity.ok(businessLayer.insert(game));
    }

    @PutMapping("games/{id}")
    public ResponseEntity<Game> update(@PathVariable Long id, @RequestBody Game game){
        businessLayer.update(id, game);
        return ResponseEntity.ok(game);
        //return (ResponseEntity<Game>) ResponseEntity.ok(businessLayer.insert(game));
    }

    @DeleteMapping("games/{id}")
    public ResponseEntity<Game> delete(@PathVariable Long id){
        businessLayer.delete(id);
        return ResponseEntity.ok().build();
        //return (ResponseEntity<Game>) ResponseEntity.ok(businessLayer.insert(game));
    }

    @PatchMapping("games/{id}/vote")
    public ResponseEntity<Game> update(@PathVariable Long id){
        businessLayer.vote(id);
        return ResponseEntity.ok().build();
        //return (ResponseEntity<Game>) ResponseEntity.ok(businessLayer.insert(game));
    }






}
