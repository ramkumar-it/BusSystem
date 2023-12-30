package com.model;

import java.util.*;

class BusRoute {
    private String origin;
    private String destination;
    private List<String> stops;

    public BusRoute(String origin, String destination, List<String> stops) {
        this.origin = origin;
        this.destination = destination;
        this.stops = stops;
    }

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public List<String> getStops() {
		return stops;
	}

	public void setStops(List<String> stops) {
		this.stops = stops;
	}

    // Getters and setters
}

class BusSchedule {
    private BusRoute route;
    private Date departureTime;
    private Date arrivalTime;

    public BusSchedule(BusRoute route, Date departureTime, Date arrivalTime) {
        this.route = route;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

	public BusRoute getRoute() {
		return route;
	}

	public void setRoute(BusRoute route) {
		this.route = route;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

    // Getters and setters
}

class BusTicket {
    private BusSchedule schedule;
    private String passengerName;

    public BusTicket(BusSchedule schedule, String passengerName) {
        this.schedule = schedule;
        this.passengerName = passengerName;
    }

	public BusSchedule getSchedule() {
		return schedule;
	}

	public void setSchedule(BusSchedule schedule) {
		this.schedule = schedule;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

    // Getters and setters
}

class BusReservationSystem {
    private List<BusRoute> routes;
    private List<BusSchedule> schedules;
    private List<BusTicket> tickets;

    public BusReservationSystem() {
        this.routes = new ArrayList<>();
        this.schedules = new ArrayList<>();
        this.tickets = new ArrayList<>();
    }

    public void addRoute(BusRoute route) {
        routes.add(route);
    }

    public void addSchedule(BusSchedule schedule) {
        schedules.add(schedule);
    }

    public void bookTicket(BusTicket ticket) {
        tickets.add(ticket);
    }

    public List<BusRoute> getRoutes() {
        return routes;
    }

    public List<BusSchedule> getSchedules() {
        return schedules;
    }

    public List<BusTicket> getTickets() {
        return tickets;
    }
}

public class AdminDashboard {
    public static void main(String[] args) {
        BusReservationSystem reservationSystem = new BusReservationSystem();

        // Create routes
        BusRoute route1 = new BusRoute("City A", "City B", Arrays.asList("Stop1", "Stop2", "Stop3"));
        BusRoute route2 = new BusRoute("City B", "City C", Arrays.asList("Stop4", "Stop5", "Stop6"));

        reservationSystem.addRoute(route1);
        reservationSystem.addRoute(route2);

        // Create schedules
        BusSchedule schedule1 = new BusSchedule(route1, new Date(), new Date());
        BusSchedule schedule2 = new BusSchedule(route2, new Date(), new Date());

        reservationSystem.addSchedule(schedule1);
        reservationSystem.addSchedule(schedule2);

        // Book a ticket
        BusTicket ticket = new BusTicket(schedule1, "John Doe");
        reservationSystem.bookTicket(ticket);

        // Display routes, schedules, and tickets
        System.out.println("Routes: " + reservationSystem.getRoutes());
        System.out.println("Schedules: " + reservationSystem.getSchedules());
        System.out.println("Tickets: " + reservationSystem.getTickets());
    }
}

	
