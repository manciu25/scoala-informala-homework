package com.project.recipeswebapplication.Controller;

import com.project.recipeswebapplication.model.Category;
import com.project.recipeswebapplication.model.Recipe;
import com.project.recipeswebapplication.model.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.EntityManager;
import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Controller that contains the business logic of recipes
 */
@Controller
@RequestMapping("recipe")
public class RecipeController {

    private EntityManager entityRecipe;
    @Autowired
    private RecipeRepository repo;

    @GetMapping(value = "page/{page}")
    public ModelAndView listArticlesPageByPage(@PathVariable("page") int page) {
        ModelAndView modelAndView = new ModelAndView("album");
        PageRequest pageable = PageRequest.of(page - 1, 6);
        Page<Recipe> articlePage = repo.findAllByOrderByCreatedDesc(pageable);
        int totalPages = articlePage.getTotalPages();
        modelAndView.addObject("type", "HOME");
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
            modelAndView.addObject("pageNumbers", pageNumbers);
        }
        modelAndView.addObject("lista", articlePage.getContent());
        return modelAndView;
    }

    @GetMapping(value = "salad/{page}")
    public ModelAndView getSalad(@PathVariable("page") int page) {
        ModelAndView modelAndView = new ModelAndView("album");
        PageRequest pageable = PageRequest.of(page - 1, 6);
        Page<Recipe> articlePage = repo.findByCategoryOrderByLastModifiedDesc(Category.SALAD, pageable);
        int totalPages = articlePage.getTotalPages();
        modelAndView.addObject("type", "SALAD");
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
            modelAndView.addObject("pageNumbers", pageNumbers);
        }
        modelAndView.addObject("lista", articlePage.getContent());
        return modelAndView;
    }

    @GetMapping(value = "dessert/{page}")
    public ModelAndView getDessert(@PathVariable("page") int page) {
        ModelAndView modelAndView = new ModelAndView("album");
        PageRequest pageable = PageRequest.of(page - 1, 6);
        Page<Recipe> articlePage = repo.findByCategoryOrderByLastModifiedDesc(Category.DESSERT, pageable);
        modelAndView.addObject("type", "DESSERT");
        int totalPages = articlePage.getTotalPages();

        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
            modelAndView.addObject("pageNumbers", pageNumbers);
        }
        modelAndView.addObject("lista", articlePage.getContent());
        return modelAndView;
    }

    @GetMapping(value = "main-dish/{page}")
    public ModelAndView getMainDish(@PathVariable("page") int page) {
        ModelAndView modelAndView = new ModelAndView("album");
        PageRequest pageable = PageRequest.of(page - 1, 6);
        Page<Recipe> articlePage = repo.findByCategoryOrderByLastModifiedDesc(Category.MAIN_DISH, pageable);
        int totalPages = articlePage.getTotalPages();
        modelAndView.addObject("type", "MAIN DISH");
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
            modelAndView.addObject("pageNumbers", pageNumbers);
        }
        modelAndView.addObject("lista", articlePage.getContent());
        return modelAndView;
    }

    @GetMapping(value = "miscellaneous/{page}")
    public ModelAndView getMiscellaneous(@PathVariable("page") int page) {
        ModelAndView modelAndView = new ModelAndView("album");
        PageRequest pageable = PageRequest.of(page - 1, 6);
        Page<Recipe> articlePage = repo.findByCategoryOrderByLastModifiedDesc(Category.MISCELLANEOUS, pageable);
        int totalPages = articlePage.getTotalPages();
        modelAndView.addObject("type", "MISCELLANEOUS");
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
            modelAndView.addObject("pageNumbers", pageNumbers);
        }
        modelAndView.addObject("lista", articlePage.getContent());
        return modelAndView;
    }

    @GetMapping(value = "soup/{page}")
    public ModelAndView getSoup(@PathVariable("page") int page) {
        ModelAndView modelAndView = new ModelAndView("album");
        PageRequest pageable = PageRequest.of(page - 1, 6);
        Page<Recipe> articlePage = repo.findByCategoryOrderByLastModifiedDesc(Category.SOUP, pageable);
        int totalPages = articlePage.getTotalPages();
        modelAndView.addObject("type", "SOUP");
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
            modelAndView.addObject("pageNumbers", pageNumbers);
        }
        modelAndView.addObject("lista", articlePage.getContent());
        return modelAndView;
    }

    @GetMapping(path = "oreteta/{id}")
    public ModelAndView oreteta(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("o-reteta");
        Recipe recipesList = repo.findById(id).get();
        System.out.println("test spatiu " + recipesList.toString());
        modelAndView.addObject("obiectDeTipReteta", recipesList);
        return modelAndView;
    }

    @GetMapping(path = "add")
    public ModelAndView recipeAddForm() {
        ModelAndView modelAndView = new ModelAndView("add-man");
        modelAndView.addObject("retetaDeAdaugat", new Recipe());
        return modelAndView;
    }

    @PostMapping(path = "add")
    public String recipeSubmit(@Valid @ModelAttribute(name = "retetaDeAdaugat") Recipe recipe, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add-man";
        }
        repo.save(recipe);
        return "redirect:/recipe/page/1";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView getRecipeById(@PathVariable Long id) {
        Recipe recipe = repo.findById(id).get();
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("retetaDeEditat", recipe);
        return modelAndView;
    }

    @PostMapping(path = "/edit/{id}")
    public String recipeUpdate(@Valid @ModelAttribute(name = "retetaDeEditat") Recipe recipe, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "edit";
        }
        repo.save(recipe);
        return "redirect:/recipe/page/1";
    }

    @PostMapping(value = "delete/{id}")
    public String deleteRecipeById(@RequestParam("idRecipe") Long id) {
        repo.deleteById(id);
        return "redirect:/recipe/page/1";
    }

    @GetMapping(path = "about")
    public String aboutMe() {
        return "about-me";
    }

}
