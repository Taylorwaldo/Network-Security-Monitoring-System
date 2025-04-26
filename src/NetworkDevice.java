// Abstract class

/*
Use private for fields that should only be accessed by the current class
Use protected for fields that need to be accessed by subclasses but not outside classes
 */

public abstract class NetworkDevice implements SecurityMonitor {
    // Contains fields for device name, IP address, and baseline threat level
    protected String deviceName;
    protected String ipAddress;
    protected double baselineThreatLevel;

    // Constructor
    // REMEMBER: there's nothing after "public" and before "NetworkDevice" because this is a constructor, not a method that returns a value.

    public NetworkDevice(String deviceName, String ipAddress, double baselineThreatLevel) {
        this.deviceName = deviceName;
        this.ipAddress = ipAddress;
        this.baselineThreatLevel = baselineThreatLevel;
    }

    /*
    formating notes
    %s  ->  placeholder for string value NAMES (deviceName)
    %n  ->  adds a line break
    %.2f -> placeholder for floating point numbers

    An IP address is actually represented as a String in programming, not as a numeric type like int or double. Because it just is
     */
    public String getDeviceInfo() {
        return String.format("Device: %s%nIP Address: %s%nBaseline Threat: %.2f",
                this.deviceName, this.ipAddress, this.baselineThreatLevel);
    }

    // Interface aka SecurityMonitor.java method implementation

    // To implement an interface, we must provide a concrete implementation of all its methods
    public double calculateThreatLevel(int dataPackets) {
        // basic version that multiplies the packets by the baseline threat level, which makes conceptual sense for a security monitoring system
        return baselineThreatLevel * dataPackets;
    }

    // Method overloading
    // "includes both a basic and an overloaded version of the threat calculation method"
    // Method overloading means having multiple methods with the same name but different parameters (peep the boolean)


}
