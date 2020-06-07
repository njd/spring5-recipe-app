package com.njd.recipe.controllers;

import com.njd.recipe.model.Category;
import com.njd.recipe.model.UnitOfMeasure;
import com.njd.recipe.repositories.CategoryRepository;
import com.njd.recipe.repositories.UnitOfMeasureRepository;
import com.njd.recipe.services.RecipeService;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {

    private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }


    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        log.debug("Getting index page...");

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
