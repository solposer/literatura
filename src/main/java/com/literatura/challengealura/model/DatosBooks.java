package com.literatura.challengealura.model;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosBooks (
    @JsonAlias("title") String titulo,
    @JsonAlias("authors")String autores,
    @JsonAlias("languages")String lenguajes ){

}
