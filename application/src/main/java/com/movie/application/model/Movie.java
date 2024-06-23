package com.movie.application.model;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import lombok.Data;

@Node
@Data
public class Movie {
    
    @Id
	private final String title;

	private final String tagline;

	private Integer released;

}
