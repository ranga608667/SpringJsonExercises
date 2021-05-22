package com.example.SpringJsonExercises;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Flight {
    private LocalDate departsOn;

    public LocalDate getDepartsOn() {
        return departsOn;
    }

    public void setDepartsOn(int year, int month, int day) {
        this.departsOn = LocalDate.of(year,month,day);
    }

    private List<Tickets> tickets;

    public List<Tickets> getTickets() {
        return tickets;
    }

    public void setTickets(List<Tickets> tickets) {
        this.tickets = tickets;
    }


    @JsonFormat(pattern = "yyyy-dd-mm")

    static class Tickets{
        private List<Persons> passenger;
        private int price;

        public List<Persons> getPassenger() {
            return passenger;
        }

        public void setPassenger(List<Persons> passenger) {
            this.passenger = passenger;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }
    static class Persons {
        private String firstName;
        private String lastName;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }


}
