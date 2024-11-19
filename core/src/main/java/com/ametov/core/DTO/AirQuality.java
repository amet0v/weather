package com.ametov.core.DTO;

import com.google.gson.annotations.SerializedName;

public class AirQuality {
    private Double co;
    private Double no2;
    private Double o3;
    private Double so2;
    private Double pm2_5;
    private Double pm10;
    @SerializedName("us-epa-index")
    private Double usEpaIndex;
    @SerializedName("gb-defra-index")
    private Double gbDefraIndex;

    @Override
    public String toString() {
        return "AirQuality{" +
                "co=" + co +
                ", no2=" + no2 +
                ", o3=" + o3 +
                ", so2=" + so2 +
                ", pm2_5=" + pm2_5 +
                ", pm10=" + pm10 +
                ", usEpaIndex=" + usEpaIndex +
                ", gbDefraIndex=" + gbDefraIndex +
                '}';
    }

    public Double getCo() {
        return co;
    }

    public void setCo(Double co) {
        this.co = co;
    }

    public Double getNo2() {
        return no2;
    }

    public void setNo2(Double no2) {
        this.no2 = no2;
    }

    public Double getO3() {
        return o3;
    }

    public void setO3(Double o3) {
        this.o3 = o3;
    }

    public Double getSo2() {
        return so2;
    }

    public void setSo2(Double so2) {
        this.so2 = so2;
    }

    public Double getPm2_5() {
        return pm2_5;
    }

    public void setPm2_5(Double pm2_5) {
        this.pm2_5 = pm2_5;
    }

    public Double getPm10() {
        return pm10;
    }

    public void setPm10(Double pm10) {
        this.pm10 = pm10;
    }

    public Double getUsEpaIndex() {
        return usEpaIndex;
    }

    public void setUsEpaIndex(Double usEpaIndex) {
        this.usEpaIndex = usEpaIndex;
    }

    public Double getGbDefraIndex() {
        return gbDefraIndex;
    }

    public void setGbDefraIndex(Double gbDefraIndex) {
        this.gbDefraIndex = gbDefraIndex;
    }
}
