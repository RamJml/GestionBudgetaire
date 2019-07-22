package com.example.GestionBudgetaire;

import java.util.List;

public interface ProjectService {
    List<Project>list();
    Project listId(int id);
    Project add(Project p);
    Project edit(Project p);
    Project delete(int id);

}
