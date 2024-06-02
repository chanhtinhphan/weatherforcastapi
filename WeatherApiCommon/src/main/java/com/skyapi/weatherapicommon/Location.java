package com.skyapi.weatherapicommon;

import jakarta.persistence.*;


@Entity
@Table(name = "locations")
public class Location {
    @Id
    @Column(length = 12,nullable = false,unique = true)
    private String code;

    @Column(length = 128,nullable = false)
    private String cityName;

    @Column(length = 128)
    private String regionName;

    @Column(length = 64,nullable = false)
    private String countryName;

    @Column(length = 2,nullable = false)
    private String countrCode;

   private boolean enabled;
   private  boolean trashed;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountrCode() {
        return countrCode;
    }

    public void setCountrCode(String countrCode) {
        this.countrCode = countrCode;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isTrashed() {
        return trashed;
    }

    public void setTrashed(boolean trashed) {
        this.trashed = trashed;
    }
}
