package guru.springframework.webapp.demo.repositories;

import guru.springframework.webapp.demo.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
