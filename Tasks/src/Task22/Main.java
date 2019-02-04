package Task22;

public class Main {
    public static void ParkingAll(Transport[] transport, Parking parking) {
        int parkingPlaceNumber = -1;
        for (int i=0; i < transport.length; i++) {
            parkingPlaceNumber = parking.park(transport[i]);
        }
    }

    public static void UnparkingAll(Transport[] transport, Parking parking) {
        String transportNumber = "";
        for (int i=0; i < transport.length; i++) {
            transportNumber = transport[i].getNumber();
            parking.unpark(transport[i],transportNumber);
        }
    }

    public static void main(String[] args) {
        String transportNumber = "";
        int parkingPlaceNumber;

        Cars     car1      = new Cars("Lada Kalina 003",100, 50);
        Cars     car2      = new Cars("Lada Largus 005",110, 50);
        Tanks    tank1     = new Tanks("T-34 10000",70, 50);
        Tanks    tank2     = new Tanks("Т-14 Армата 20000",75, 60);
        Bicycles bicycle  = new Bicycles("Велосипед 1",10);

        Copter   copter1   = new Copter("МИ-8 777",180,350);
        Copter   copter2   = new Copter("МИ-8 888",180,350);
        Aircraft aircraft1 = new Aircraft("ТУ-154 12345",900,12000);
        Aircraft aircraft2 = new Aircraft("ТУ-154 67890",900,12000);
        Aerostat aerostat = new Aerostat("Аэростат 789",130);

        Parking parking1 = new Parking(1,3);
        Parking parking2 = new Parking(2,3);
        Transport[] transport1 = {tank1,tank2,car1,car2,bicycle};
        Transport[] transport2 = {aircraft1,aircraft2,copter1,copter2,aerostat};

        ParkingAll(transport1,parking1);
        System.out.println("__________________________________________________________");
        ParkingAll(transport2,parking2);
        System.out.println("__________________________________________________________");
        UnparkingAll(transport1,parking1);
        System.out.println("__________________________________________________________");
        UnparkingAll(transport2,parking2);


    }
}
