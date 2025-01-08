public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("V001", "Toyota", "Corolla", 2020, "Sedan", 50.0, true);
        Vehicle v2 = new Vehicle("V002", "Honda", "Civic", 2021, "Sedan", 55.0, true);
        Vehicle v3 = new Vehicle("V003", "Tesla", "Model 3", 2022, "Electric", 100.0, false);


        Client c1 = new Client("C001", "John Doe", "123456789", "john.doe@example.com");
        Client c2 = new Client("C002", "Jane Smith", "987654321", "jane.smith@example.com");

        RentalService r1 = new RentalService("R001", c1, v1, 3);
        RentalService r2 = new RentalService("R002", c2, v2, 5);

        List<Vehicle> vehicles = Arrays.asList(v1, v2, v3);
        List<Vehicle> availableVehicles = vehicles.stream()
                .filter(Vehicle::isAvailable)
                .collect(Collectors.toList());

        System.out.println("Available Vehicles:");
        availableVehicles.forEach(System.out::println);

        System.out.println("\nRental Records:");
        System.out.println(r1);
        System.out.println(r2);

        List<Vehicle> sortedVehicles = vehicles.stream()
                .sorted(Comparator.comparingDouble(Vehicle::getRentalPricePerDay))
                .collect(Collectors.toList());

        System.out.println("\nVehicles sorted by rental price:");
        sortedVehicles.forEach(System.out::println);
    }
}