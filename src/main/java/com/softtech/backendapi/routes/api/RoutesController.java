package com.softtech.backendapi.routes.api;


import com.softtech.backendapi.routes.domain.entity.Routes;
import com.softtech.backendapi.routes.service.RoutesServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/routes")
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class RoutesController {

    @Autowired
    private RoutesServiceImpl routesService;

    @PostMapping
    public Routes save(@RequestBody Routes routes){
        return routesService.save(routes);
    }

    @GetMapping
    public List<Routes> getAll() {return routesService.getAll();}

    @GetMapping("{id}")
    public Routes getById(@PathVariable Integer id) {
        return routesService.getById(id).get();
    }

    @PutMapping("{id}")
    public ResponseEntity<Routes> update (@PathVariable Integer id, @RequestBody Routes routes){
        if (id.equals(routes.getId())){
            routesService.update(routes);
            return new ResponseEntity<>(routes, HttpStatus.OK);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Routes> delete(@PathVariable Integer id){
        if (routesService.deleteById(id)){
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}