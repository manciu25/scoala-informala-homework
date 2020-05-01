package com.project.recipeswebapplication.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface that reduce the coding for accessing the database extending JpaRepository
 */

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    Page<Recipe> findAllByOrderByCreatedDesc(Pageable pageable);

    Page<Recipe> findByCategoryOrderByLastModifiedDesc(Category category, Pageable pageable);
}
