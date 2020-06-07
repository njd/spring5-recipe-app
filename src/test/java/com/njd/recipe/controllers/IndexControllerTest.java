package com.njd.recipe.controllers;

import com.njd.recipe.repositories.CategoryRepository;
import com.njd.recipe.repositories.UnitOfMeasureRepository;
import com.njd.recipe.services.RecipeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class IndexControllerTest {

    @Mock
    RecipeService recipeService;

    @Mock
    CategoryRepository categoryRepository;

    @Mock
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Mock
    Model model;

    IndexController controller;

    @BeforeEach
    void setUp() {

//        MockitoAnnotations.initMocks(this);
        controller = new IndexController(recipeService);
    }

    @Test
    void getIndexPage() {
        String viewName = controller.getIndexPage(model);
        assertEquals("index", viewName);
        verify(recipeService, times(1)).getRecipes();
        verify(model, times(1)).addAttribute(eq("recipes"), anySet());
    }
}