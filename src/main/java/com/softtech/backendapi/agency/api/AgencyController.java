package com.softtech.backendapi.agency.api;

import com.softtech.backendapi.agency.domain.entity.Agency;
import com.softtech.backendapi.agency.service.AgencyServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/agencies")
@AllArgsConstructor
public class AgencyController {
    @Autowired
    private AgencyServiceImpl agencyCrudService;

    @PostMapping
    public Agency save(@RequestBody Agency agency){
        return agencyCrudService.save(agency);
    }

    @GetMapping
    public List<Agency> getAll() {return agencyCrudService.getAll();}

    @GetMapping("{id}")
    public Agency getById(@PathVariable Integer id) {
        return agencyCrudService.getById(id).get();
    }

    @PutMapping("{id}")
    public ResponseEntity<Agency> update (@PathVariable Integer id, @RequestBody Agency agency){
        if (id.equals(agency.getId())){
            agencyCrudService.update(agency);
            return new ResponseEntity<>(agency, HttpStatus.OK);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Agency> delete(@PathVariable Integer id){
        if (agencyCrudService.deleteById(id)){
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
