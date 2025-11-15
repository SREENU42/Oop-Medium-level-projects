import java.util.*;

class SmartDevice {
    private String name;
    private boolean isOn;

    SmartDevice(String name) {
        this.name = name;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public String getStatus() {
        return name + " is " + (isOn ? "ON" : "OFF");
    }
}

class SmartHome {
    private ArrayList<SmartDevice> devices = new ArrayList<>();

    
    public void addDevice(String name) {
        devices.add(new SmartDevice(name));
    }

    
    public void turnOnAll() {
        for (SmartDevice d : devices) {
            d.turnOn();
        }
    }

    
    public void turnOffDevice(String name) {
        for (SmartDevice d : devices) {
            if (d.getStatus().startsWith(name)) {
                d.turnOff();
            }
        }
    }

    
    public void showStatus() {
        for (SmartDevice d : devices) {
            System.out.println(d.getStatus());
        }
    }
}

public class SmartHomeAutomation {
    public static void main(String[] args) {
        SmartHome home = new SmartHome();

        home.addDevice("Light");
        home.addDevice("Fan");
        home.addDevice("AC");

        home.turnOnAll();       
        home.turnOffDevice("Fan"); 

        home.showStatus();        
    }
}
