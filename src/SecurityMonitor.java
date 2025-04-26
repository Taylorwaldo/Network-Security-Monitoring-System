public interface SecurityMonitor {

    // dataPackets is a parameter (or argument) that's passed to the calculateThreatLevel method
    // use a double it's more flexable

    // interface declares a calculateThreatLevel method

    double calculateThreatLevel(int dataPackets);

    // For void... The method executes its instructions (in this case, logging security activity)
    // then simply flashes

    // Note: you can't assign the result of a void method to a variable
    void logActivity(String activity);
}
