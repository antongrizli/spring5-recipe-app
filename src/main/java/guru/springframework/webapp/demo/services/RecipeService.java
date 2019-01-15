package guru.springframework.webapp.demo.services;

import guru.springframework.webapp.demo.domain.Recipe;

import java.util.List;
import java.util.Set;

public interface RecipeService {

    Set<Recipe>  getRecipes();
}
