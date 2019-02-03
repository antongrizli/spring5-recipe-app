package guru.springframework.webapp.demo.services;

import guru.springframework.webapp.demo.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
