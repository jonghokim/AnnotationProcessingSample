package com.jhcompany.annotationprocessingsample.model;

import com.jhcompany.annotations.Factory;

@Factory(
        id = "CalzonePizza",
        type = Meal.class
)
public class CalzonePizza implements Meal {
    @Override
    public float getPrice() {
        return 10f;
    }
}
