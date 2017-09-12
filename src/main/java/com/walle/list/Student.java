package com.walle.list;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zlkjzxj on 2017/7/7.
 */
public class Student {
    private String id;
    private String name;
    private Set courses;

    public Student(String id, String name, String courses) {
        this.id = id;
        this.name = name;
        this.courses = new HashSet<Course>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set getCourses() {
        return courses;
    }

    public void setCourses(Set courses) {
        this.courses = courses;
    }
}
