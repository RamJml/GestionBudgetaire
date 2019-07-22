package com.example.GestionBudgetaire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImp implements ProjectService {
    @Autowired
    private ProjectRepository repository;

    @Override
    public List<Project> list() {
        return repository.findAll();
    }

    @Override
    public Project listId(int id) {

        return repository.findOne(id);
    }

    @Override
    public Project add(Project p) {

        return repository.save(p);

    }

    @Override
    public Project edit(Project p) {
        return repository.save(p);

    }

    @Override
    public Project delete(int id) {
        Project p=repository.findOne(id);
        if (p!=null){
            repository.delete(p);
        }
        return p;
    }
}
