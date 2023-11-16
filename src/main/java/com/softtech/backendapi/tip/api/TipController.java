package com.softtech.backendapi.tip.api;

import com.softtech.backendapi.tip.domain.entity.Tip;
import com.softtech.backendapi.tip.service.TipServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/tip")
@AllArgsConstructor
public class TipController {

    @Autowired
    private TipServiceImpl tipService;

    @PostMapping
    public Tip save(@RequestBody Tip tip){
        return tipService.save(tip);
    }

    @GetMapping
    public List<Tip> getAll() {return tipService.getAll();}

    @GetMapping("{id}")
    public Tip getById(@PathVariable Integer id) {
        return tipService.getById(id).get();
    }

    @PutMapping("{id}")
    public ResponseEntity<Tip> update (@PathVariable Integer id, @RequestBody Tip tip){
        if (id.equals(tip.getId())){
            tipService.update(tip);
            return new ResponseEntity<>(tip, HttpStatus.OK);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Tip> delete(@PathVariable Integer id){
        if (tipService.deleteById(id)){
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
