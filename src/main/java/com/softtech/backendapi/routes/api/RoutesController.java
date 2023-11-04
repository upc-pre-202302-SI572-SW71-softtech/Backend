package com.softtech.backendapi.routes.api;

import com.softtech.backendapi.travel.domain.entity.Travel;
import com.softtech.backendapi.travel.service.TravelServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/travel")
@AllArgsConstructor
public class RoutesController {
    @Autowired
    private TravelServiceImpl travelCrudService;

    @PostMapping
    public Travel save(@RequestBody Travel travel){
        return travelCrudService.save(travel);
    }

    @GetMapping
    public List<Travel> getAll() {return travelCrudService.getAll();}

    @GetMapping("{id}")
    public Travel getById(@PathVariable Integer id) {
        return travelCrudService.getById(id).get();
    }

    @PutMapping("{id}")
    public ResponseEntity<Travel> update (@PathVariable Integer id, @RequestBody Travel travel  ){
        if (id.equals(travel.getId())){
            travelCrudService.update(travel);
            return new ResponseEntity<>(travel, HttpStatus.OK);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Travel> delete(@PathVariable Integer id){
        if (travelCrudService.deleteById(id)){
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
