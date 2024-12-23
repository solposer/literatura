package com.literatura.challengealura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosAutores (
    @JsonAlias("name")String autor,
    @JsonAlias("birth_year")int nacimiento,
    @JsonAlias("death_year")int muerte ){

    }

