package com.example.GestionBudgetaire;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface ProjectRepository extends Repository<Project,Integer> {
    List<Project>findAll();
    Project findOne(int id);
    Project save(Project p);
    void delete(Project p);
}
