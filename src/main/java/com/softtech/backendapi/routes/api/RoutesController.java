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
  
}
