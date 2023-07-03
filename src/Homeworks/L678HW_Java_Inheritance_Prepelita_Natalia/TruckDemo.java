package Homeworks.L678_Java_Inheritance_Prepelita_Natalia;

public class TruckDemo {
    public static void main(String[] args) {
        Truck semi = new Truck(2,200,7,44000);
        Truck pickup = new Truck(3,28,15,2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);
        System.out.println("Truck can carry: " + semi.getCargo() + " feet.");
        System.out.println("To cover " + dist + " miles truck needs " + gallons + " gallons of fuel.\n");
        gallons = pickup.fuelneeded(dist);

        System.out.println("Pickup can carry: " + pickup.getCargo() + " feet.");
        System.out.println("To cover " + dist + " miles pickup needs " + gallons + " gallons of fuel.\n");
    }

}

