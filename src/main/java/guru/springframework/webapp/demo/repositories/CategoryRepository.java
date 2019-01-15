package guru.springframework.webapp.demo.repositories;

import guru.springframework.webapp.demo.domain.Category;
import guru.springframework.webapp.demo.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
