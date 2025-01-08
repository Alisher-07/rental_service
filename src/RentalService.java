class RentalService {
    private String id;
    private Client client;
    private Vehicle vehicle;
    private int rentalDays;
    private double totalPrice;

    public RentalService(String id, Client client, Vehicle vehicle, int rentalDays) {
        this.id = id;
        this.client = client;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
        this.totalPrice = rentalDays * vehicle.getRentalPricePerDay();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
        this.totalPrice = rentalDays * vehicle.getRentalPricePerDay();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "RentalService{" +
                "id='" + id + '\'' +
                ", client=" + client +
                ", vehicle=" + vehicle +
                ", rentalDays=" + rentalDays +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
