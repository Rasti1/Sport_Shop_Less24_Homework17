package project;

public abstract class Cap implements Item{
    @Override
    public abstract String name();

    @Override
    public abstract String color();

    @Override
    public abstract String nameOfFirm();

    @Override
    public abstract float price();
}
