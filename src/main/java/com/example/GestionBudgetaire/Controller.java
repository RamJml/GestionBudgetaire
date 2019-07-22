package com.example.GestionBudgetaire;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/projects"})
public class Controller {

    @Autowired
    ProjectService service;
    @GetMapping
    public List<Project>list(){
        return service.list();
    }

    @PostMapping
    public Project save(@RequestBody Project p){
        return service.add(p);

    }
    @GetMapping(path = {"/{id}"})
    public Project listId(@PathVariable("id") int id){
        return service.listId(id);
    }
    @PutMapping(path = {"/{id}"})
    public Project edit(@RequestBody Project p,@PathVariable("id") int id ){
        p.setId(id);
        return service.edit(p);
    }
    @DeleteMapping(path = {"/{id}"})
    public Project delete(@PathVariable("id") int id ){
        return service.delete(id);
    }



}
