package co.com.sofka.catalog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sofkau/courses/")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.OPTIONS, RequestMethod.DELETE}, maxAge = 3600)
public class CourseController {
    @GetMapping
    private ResponseEntity<String> getArtists() {
        return ResponseEntity.status(200).body("Llego la piton");
    }
}
