package FactoryPattern;

public class Cat implements Pet {
    private final int noOfLives;

    public Cat(int noOfLives) {
        this.noOfLives = noOfLives;
    }

    public int getNoOfLives() {
        return noOfLives;
    }

    @Override
    public String makeSound() {
        return "Meow, meow!";
    }

    @Override
    public String play() {
        return "Catching/pursuing moving objects!";
    }
}
