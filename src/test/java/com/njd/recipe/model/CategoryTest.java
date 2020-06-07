package com.njd.recipe.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    Category category = new Category();
    Set<Recipe> expectedRecipes = new HashSet<>();

    @BeforeEach
    void setUp() {

        category.setId(99L);
        category.setDescription("Description");
        category.setRecipes(expectedRecipes);
    }

    @Test
    void getId() {
        category.setId(90L);
        assertEquals(90L, category.getId());
    }

    @Test
    void setId() {
        assertDoesNotThrow(() -> {
            category.setId(99L);
        });
    }

    @Test
    void getDescription() {
        assertEquals("Description", category.getDescription());
    }

    @Test
    void setDescription() {
    }

    @Test
    void getRecipes() {
        assertSame(expectedRecipes, category.getRecipes());
    }

    @Test
    void setRecipes() {
        Set<Recipe> newRecipes = new HashSet<>();
        newRecipes.add(new Recipe());
        category.setRecipes(newRecipes);
        assertSame(newRecipes, category.getRecipes());
    }
}