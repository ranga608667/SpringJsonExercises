package com.example.SpringJsonExercises;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class SingleFlight {

    @GetMapping("/flights/flight")
        public Flight singleFlightAPI(){

        Flight singleFlight = new Flight();
        Flight.Persons person1= new Flight.Persons();
        Flight.Tickets ticket1=new Flight.Tickets();
        person1.setFirstName("Some Name");
        person1.setLastName("some LName");

        List<Flight.Persons> passenger=new ArrayList<>();
        passenger.add(person1);

        ticket1.setPassenger(passenger);
        ticket1.setPrice(200);
        List<Flight.Tickets> tickets = new ArrayList<>();
        tickets.add(ticket1);
        singleFlight.setTickets(tickets);
        singleFlight.setDepartsOn(2021,1,1);
        return singleFlight;
    }


    @GetMapping("/flights")
    public List<Flight> FlightsAPI(){

        List<Flight> FlightList = new ArrayList<>();

        Flight flight1 = new Flight();
        Flight.Persons person1= new Flight.Persons();
        Flight.Tickets ticket1=new Flight.Tickets();

        person1.setFirstName("Some Name");
        person1.setLastName("some LName");

        List<Flight.Persons> passenger=new ArrayList<>();
        passenger.add(person1);

        ticket1.setPassenger(passenger);
        ticket1.setPrice(200);

        List<Flight.Tickets> tickets = new ArrayList<>();
        tickets.add(ticket1);

        flight1.setTickets(tickets);
        flight1.setDepartsOn(2021,1,2);
        FlightList.add(flight1);



         Flight flight2= new Flight();
        Flight.Persons person2= new Flight.Persons();
        Flight.Tickets ticket2=new Flight.Tickets();

        person2.setFirstName("New name");
        person2.setLastName("New Name");

        List<Flight.Persons> passenger2=new ArrayList<>();
        passenger2.add(person2);
        ticket2.setPassenger(passenger2);
        ticket2.setPrice(300);
        List<Flight.Tickets> tickets1 = new ArrayList<>();

        tickets1.add(ticket2);
        flight2.setTickets(tickets1);
        flight2.setDepartsOn(2021,1,2);
        FlightList.add(flight2);
        return FlightList;
    }

}
