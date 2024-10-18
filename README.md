# Taximeter Calculator Program

A simple Java program that calculates the fare for a taxi ride based on the distance traveled. The program takes into account an initial start fee, a per-kilometer rate, and a minimum payable amount to ensure fair pricing for shorter distances.

## Features
- **Start Fee**: A fixed initial start fee of 10 units is applied to every ride.
- **Per-Kilometer Charge**: The cost per kilometer is set at 2.20 units.
- **Minimum Fare**: Ensures that the minimum fare for any ride is 20 units.

## How to Use
1. When you run the program, it will prompt you to enter the distance traveled in kilometers.
   - Enter a positive number to proceed with the calculation.
   - If a value of `0` or less is entered, the program will inform you that the distance entered is invalid.
2. The program will calculate the total fare based on the formula:
   
   ```
   Total Fare = Start Fee + (Distance Traveled * Rate per Kilometer)
   ```
3. If the calculated fare is less than 20 units, it will automatically be set to the minimum fare of 20 units.

## Example

### Valid Input
```
Kaç km gidildi : 5
Toplam tutar : 21.0
```

### Invalid Input
```
Kaç km gidildi : -3
Geçersiz km girildi
```

## Requirements
- Java Development Kit (JDK) 8 or higher

## How to Run
1. Clone this repository.
2. Compile the Java file:
   ```
   javac Main.java
   ```
3. Run the program:
   ```
   java Main
   ```

## Author
- Hekim Can Aktas

## License
This project is licensed under the MIT License.

