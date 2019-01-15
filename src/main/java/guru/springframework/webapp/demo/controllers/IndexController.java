package guru.springframework.webapp.demo.controllers;

import guru.springframework.webapp.demo.domain.Category;
import guru.springframework.webapp.demo.domain.UnitOfMeasure;
import guru.springframework.webapp.demo.repositories.CategoryRepository;
import guru.springframework.webapp.demo.repositories.UnitOfMeasureRepository;
import guru.springframework.webapp.demo.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
