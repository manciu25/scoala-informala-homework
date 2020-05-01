package com.project.recipeswebapplication.model;


import org.apache.tomcat.util.codec.binary.Base64;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Date;

/**
 * Persistent class for recipes
 */
@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue
    private Long id;
    @Size(min = 6, message = "The title must contain minimum 6 characters")
    public String title;
    @Column(length = 3000)
    @Size(min = 20, message = "The description must contain minimum 20 characters")
    private String description;
    @Column(length = 3000)
    @Size(min = 20, message = "The ingredients must contain minimum 20 characters")
    private String ingredients;
    @Column(length = 3000)
    @Size(min = 20, message = "The directions must contain minimum 20 characters")
    private String directions;
    @NotNull(message = "Please insert an image")
    @Lob
    private byte[] image;
    @Enumerated(EnumType.ORDINAL)
    private Category category;
    @Column(updatable = false)
    @CreationTimestamp
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date created;
    @UpdateTimestamp
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date lastModified;

    public Recipe() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public String getImage() {
        if (image != null) {
            try {
                return new String(Base64.encodeBase64(image), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public void setImage(MultipartFile image) {
        if (image.isEmpty() == false) {
            try {
                this.image = image.getBytes();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", directions='" + directions + '\'' +
                ", image=" + Arrays.toString(image) +
                ", category=" + category +
                ", created=" + created +
                ", lastModified=" + lastModified +
                '}';
    }

}
