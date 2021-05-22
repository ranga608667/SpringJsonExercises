package com.example.SpringJsonExercises;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Suitcase {
    private final int weight;
    private final int height;
    private final int depth;
    private final int width;

    @JsonCreator
    Suitcase(
            @JsonProperty("weight") int weight,
            @JsonProperty("height") int height,
            @JsonProperty("depth") int depth,
            @JsonProperty("width") int width){
        this.width=width;
        this.depth=depth;
        this.height=height;
        this.weight=weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    public int getWidth() {
        return width;
    }
}
