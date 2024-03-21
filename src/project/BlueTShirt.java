package project;

public class BlueTShirt extends TShirt{
    @Override
    public String name() {
        return "T-Shirt";
    }

    @Override
    public String color() {
        return "blue";
    }

    @Override
    public String nameOfFirm() {
        return "Active sports";
    }

    @Override
    public float price() {
        return 20.0f;
    }
}
