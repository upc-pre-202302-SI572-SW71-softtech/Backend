package com.softtech.backendapi.activity.api;

import com.softtech.backendapi.activity.domain.entity.Activity;
import com.softtech.backendapi.activity.service.ActivityServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/activity")
@AllArgsConstructor
public class ActivityController {

    @Autowired
    private ActivityServiceImpl activityService;

    @PostMapping
    public Activity save(@RequestBody Activity activity){
        return activityService.save(activity);
    }

    @GetMapping
    public List<Activity> getAll() {return activityService.getAll();}

    @GetMapping("{id}")
    public Activity getById(@PathVariable Integer id) {
        return activityService.getById(id).get();
    }

    @PutMapping("{id}")
    public ResponseEntity<Activity> update (@PathVariable Integer id, @RequestBody Activity activity){
        if (id.equals(activity.getId())){
            activityService.update(activity);
            return new ResponseEntity<>(activity, HttpStatus.OK);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Activity> delete(@PathVariable Integer id){
        if (activityService.deleteById(id)){
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}