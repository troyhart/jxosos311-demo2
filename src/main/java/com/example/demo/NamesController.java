package com.example.demo;

import java.util.Set;
import java.util.TreeSet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/names")
public class NamesController {

    private TreeSet<String> names = new TreeSet<>();

    @PutMapping("/{name}")
    public void addName(@PathVariable String name) {
        names.add(name);
    }

    @GetMapping()
    public Set<String> getNames() {
        return names;
    }
}