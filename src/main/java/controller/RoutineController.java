package controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Routine;
import entities.User;
import service.RoutineService;
import service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/routines")
public class RoutineController {

    @Autowired
    private RoutineService routineService;

    @GetMapping
    public List<Routine> getAllRoutines() {
        return routineService.getAllRoutines();
    }

    @GetMapping("/{id}")
    public Routine getRoutine(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    public Routine createRoutine(@RequestBody Routine routine) {
        return null;
    }

    @PutMapping("/{id}")
    public Routine updateRoutine(@PathVariable Long id, @RequestBody Routine routine) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteRoutine(@PathVariable Long id) {
        
    }
}