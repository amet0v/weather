package com.ametov.core.DTO;

public class CurrentResponse {
    private Location location;
    private Current current;
    private AirQuality air_quality;

    @Override
    public String toString() {
        return "CurrentResponse{" +
                "location=" + location +
                ", current=" + current +
                ", air_quality=" + air_quality +
                '}';
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public AirQuality getAir_quality() {
        return air_quality;
    }

    public void setAir_quality(AirQuality air_quality) {
        this.air_quality = air_quality;
    }
}
