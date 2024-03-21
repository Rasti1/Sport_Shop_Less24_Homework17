package project;

public class BlackCap extends Cap{
    @Override
    public String name() {
        return "Cap";
    }

    @Override
    public String color() {
        return "black";
    }

    @Override
    public String nameOfFirm() {
        return "Smart caps";
    }

    @Override
    public float price() {
        return 7.0f;
    }
}
