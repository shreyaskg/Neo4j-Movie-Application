package com.movie.application.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Person {
    
    @Id
    private String name;

    private String born;
}
