package com.jhcompany.annotationprocessingsample.model;

import com.jhcompany.annotations.Factory;

@Factory(
        id = "Tiramisu",
        type = Meal.class
)
public class Tiramisu implements Meal {
    @Override
    public float getPrice() {
        return 2.3f;
    }
}
