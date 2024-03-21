package project;

public class RedTShirt extends TShirt{
    @Override
    public String name() {
        return "T-Shirt";
    }

    @Override
    public String color() {
        return "red";
    }

    @Override
    public String nameOfFirm() {
        return "Active sports";
    }

    @Override
    public float price() {
        return 15.0f;
    }
}
