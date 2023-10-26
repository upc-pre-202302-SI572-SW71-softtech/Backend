package com.softtech.backendapi.user.api;

import com.softtech.backendapi.travel.domain.entity.Travel;
import com.softtech.backendapi.user.domain.entity.User;
import com.softtech.backendapi.user.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/user")
@AllArgsConstructor
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @PostMapping
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping
    public List<User> getAll() {return userService.getAll();}

    @GetMapping("{id}")
    public User getById(@PathVariable Integer id) {
        return userService.getById(id).get();
    }

    @PutMapping("{id}")
    public ResponseEntity<User> update (@PathVariable Integer id, @RequestBody User user  ){
        if (id.equals(user.getId())){
            userService.update(user);
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<User> delete(@PathVariable Integer id){
        if (userService.deleteById(id)){
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
