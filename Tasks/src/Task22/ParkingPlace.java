package Task22;

class ParkingPlace {
    private Transport transport;
    private String number;
    private int placeNumber;

    public void setNumber(String number) {
        this.number = number;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public String getNumber() {
        return number;
    }

    public Transport getTransport() {
        return transport;
    }


}