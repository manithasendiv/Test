package controllers;

import models.Toy;

public class toyStore {
    public static void main(String[] args) {
        Toy toy1 = new Toy();
        toy1.addToy("car", 256, 45.25f, "For Boys");
    }
}
