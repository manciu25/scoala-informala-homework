package com.objectcontainers;

import java.awt.*;
import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;


public class Persoane {
    private String name;
    private Integer age;

    public Persoane(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Persoane() {

    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoane persoane = (Persoane) o;
        return Objects.equals(name, persoane.name) &&
                Objects.equals(age, persoane.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Persoane{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
//equals ca sa comparam 2 persoane  si hashcode  how to implememt equals and
}
