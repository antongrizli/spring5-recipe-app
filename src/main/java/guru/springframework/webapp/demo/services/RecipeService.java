package guru.springframework.webapp.demo.services;

import guru.springframework.webapp.demo.commands.RecipeCommand;
import guru.springframework.webapp.demo.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);


    RecipeCommand findCommandById(Long l);

    void deleteById(Long idToDelete);
}