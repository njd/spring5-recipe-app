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
        String viewName = controller.getIndexPage();
        assertEquals("index", viewName);
    }
}