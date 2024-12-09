package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/observations")
public class OumuamuaObservationController {
    @Autowired
    private OumuamuaObservationRepository repository;

    @GetMapping
    public List<OumuamuaObservation> getAllObservations() {
        return repository.findAll();
    }

    @PostMapping
    public OumuamuaObservation createObservation(@RequestBody OumuamuaObservation observation) {
        return repository.save(observation);
    }
}