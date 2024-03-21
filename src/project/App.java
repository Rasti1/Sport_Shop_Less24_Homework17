package project;

public class App {
    public static void main(String[] args) {

        getOutput();

    }

    private static void getOutput(){
        OrderBuilder orderBuilder = new OrderBuilder();

        Order orderA = orderBuilder.prepareOrderA();
        System.out.println("Order A: ");
        orderA.showItems();
        System.out.println("Total Cost: " + orderA.getCost());

        Order orderB = orderBuilder.prepareOrderB();
        System.out.println("\nOrder B: ");
        orderB.showItems();
        System.out.println("Total Cost: " + orderB.getCost() + Constants.CURRENCY);
    }
}

