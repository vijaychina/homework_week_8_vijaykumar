package home_week5;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */

import java.util.*;

public class Programme_10_StationsName {

    public static void main(String[] args) {
        // Create a map to store station-line mapping for Zone 1 stations
        Map<String, List<String>> zone1Stations = new HashMap<>();
        zone1Stations.put("King's Cross St Pancras", new ArrayList<>(List.of("Circle Line", "Hammersmith & City Line", "Metropolitan Line", "Northern Line", "Piccadilly Line", "Victoria Line")));
        zone1Stations.put("Waterloo", new ArrayList<>(List.of("Bakerloo Line", "Jubilee Line", "Northern Line")));

        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a station name
        System.out.print("Enter a Zone 1 station name: ");
        String stationName = scanner.nextLine();

        // Check if the entered station is in the map
        if (zone1Stations.containsKey(stationName)) {
            List<String> lines = zone1Stations.get(stationName);
            System.out.println("The following lines pass through " + stationName + ": " + lines);
        } else {
            System.out.println("Station not found or not in Zone 1.");
        }

        scanner.close();
    }
}

