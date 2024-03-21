package project;

public class WhiteCap extends Cap{
    @Override
    public String name() {
        return "Cap";
    }

    @Override
    public String color() {
        return "white";
    }

    @Override
    public String nameOfFirm() {
        return "Smart caps";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
