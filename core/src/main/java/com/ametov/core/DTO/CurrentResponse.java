package com.ametov.core.DTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
}
