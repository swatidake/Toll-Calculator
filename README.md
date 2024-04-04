
# Toll Calculator

This Java project implements a toll calculator system using object-oriented programming concepts.

## Overview

The toll calculator system allows users to calculate toll charges based on the type of vehicle and the number of passengers it carries. It provides a flexible and extensible framework for adding new vehicle types and calculating toll charges according to specific criteria.

## Object-Oriented Design

The project follows an object-oriented design approach, with the following key components.

- **Vehicle Class**: An abstract class representing a generic vehicle, with attributes such as the number of persons and toll charges.
- **Concrete Vehicle Classes**: Subclasses of the Vehicle class representing different types of vehicles, such as TwoWheeler, ThreeWheeler, FourWheeler, and HeavyVehicle.
- **Main Class**: The Main class serves as the entry point to the program, allowing users to select a vehicle type and input the number of persons to calculate the toll charges.


### Vehicle Hierarchy

The project defines a hierarchy of vehicle classes, with each class representing a specific type of vehicle. The hierarchy is as follows:

- Vehicle (Abstract Class)
  - TwoWheeler (Class)
  - ThreeWheeler (Class)
  - FourWheeler (Class)
  - HeavyVehicle (Class)

In this hierarchy:

- **Vehicle (Abstract Class):** Represents a generic vehicle. It contains common attributes and methods shared by all types of vehicles, such as `no_of_persons`, `total_toll`, `basic_toll`, and the abstract method `callToll()`.
- **TwoWheeler (Class):** Represents a two-wheeler vehicle.
- **ThreeWheeler (Class):** Represents a three-wheeler vehicle.
- **FourWheeler (Class):** Represents a four-wheeler vehicle.
- **HeavyVehicle (Class):** Represents a heavy vehicle.

## Usage

To use the toll calculator:

1. Run the Main class.
2. Select the type of vehicle (Two Wheeler, Three Wheeler, Four Wheeler, or Heavy Vehicle).
3. Enter the number of persons traveling in the vehicle.
4. The program will display the total toll charges based on the input.

## Example
```
1 : Two wheelers
2 : Three wheelers
3 : Four wheelers
4 : Heavy Vehicle

Enter your choice: 1
How many number of persons: 2
Total toll is: 20
```

## Technologies Used

- Core Java
- Object-Oriented Programming (OOP)

## Contributing

Contributions to this project are welcome! If you have suggestions for improvements or new features, feel free to open an issue or submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

