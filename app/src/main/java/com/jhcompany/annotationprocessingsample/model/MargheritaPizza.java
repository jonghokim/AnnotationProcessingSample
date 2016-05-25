package com.jhcompany.annotationprocessingsample.model;

import com.jhcompany.annotations.Factory;

@Factory(
        id = "MargheritaPizza",
        type = Meal.class
)
public class MargheritaPizza implements Meal {
    @Override
    public float getPrice() {
        return 8.5f;
    }
}
