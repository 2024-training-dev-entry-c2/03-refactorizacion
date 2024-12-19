package org.bymarium.hotel.models;

import java.time.LocalDate;

public class DetailsStay extends Details {
    private LocalDate endDate;
    private Integer roomsQuantity;

    public DetailsStay(
        LocalDate startDate,
        AccommodationType accommodationType,
        Integer childrenQuantity,
        Integer adultsQuantity,
        String city,
        LocalDate endDate,
        Integer roomsQuantity
    ) {
        super(startDate, accommodationType, childrenQuantity, adultsQuantity, city);
        this.endDate = endDate;
        this.roomsQuantity = roomsQuantity;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Integer getRoomsQuantity() {
        return roomsQuantity;
    }

    public void setRoomsQuantity(Integer roomsQuantity) {
        this.roomsQuantity = roomsQuantity;
    }
}