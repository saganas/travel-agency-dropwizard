package com.ciaran.upskill.travelagency.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

public class FlightOffer {

    @JsonProperty
    private UUID id;
    @JsonProperty
    private double price;
    @JsonProperty
    private String flightOriginId;
    @JsonProperty
    private String flightDestinationId;
    private double distance;
    @JsonProperty
    private String airline;
    @JsonProperty
    Date[] flightDates;

    public FlightOffer(double price, String flightOriginId, String flightDestinationId, String airline, Date[] flightDates) {
        this.id = UUID.randomUUID();
        this.price = price;
        this.flightOriginId = flightOriginId;
        this.flightDestinationId = flightDestinationId;
        this.airline = airline;
        //this.distance = CitiesRepository.getCityById(this.flightOriginId).getLocation().getDistance(CitiesRepository.getCityById(this.flightDestinationId).getLocation());
        this.flightDates = flightDates;
    }

    public FlightOffer(UUID id, double price, String flightOriginId, String flightDestinationId, String airline, Date[] flightDates) {
        this.id = id;
        this.price = price;
        this.flightOriginId = flightOriginId;
        this.flightDestinationId = flightDestinationId;
        this.airline = airline;
        //this.distance = CitiesRepository.getCityById(this.flightOriginId).getLocation().getDistance(CitiesRepository.getCityById(this.flightDestinationId).getLocation());
        this.flightDates = flightDates;
    }

    public FlightOffer() {

    }

    public UUID getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFlightOriginId() {
        return flightOriginId;
    }

    public String getFlightDestinationId() {
        return flightDestinationId;
    }

    public double getDistance() {
        return distance;
    }

    public String getAirline() {
        return airline;
    }

    public Date[] getFlightDates() {
        return flightDates;
    }

    public void setFlightDates(Date[] flightDates) {
        this.flightDates = flightDates;
    }

    @Override
    public String toString() {
        String flightDatesString = null;
        int i = 0;
        for(Date date : flightDates){
            if(flightDatesString == null){
                flightDatesString = "[" + flightDates[i].toString();
            } else {
                flightDatesString = flightDatesString + ";" + flightDates[i].toString();
            }
            i++;
        }
        flightDatesString = flightDatesString+"]";
        return id + "," + price + "," + flightOriginId + "," + flightDestinationId + "," + airline + "," + flightDatesString;
    }
}
