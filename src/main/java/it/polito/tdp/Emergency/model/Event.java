package it.polito.tdp.Emergency.model;

import java.time.LocalTime;

public class Event implements Comparable <Event>{
	
	public enum EventType{
		ARRIVAL, //arrivo paziente
		TRIAGE, //assegnato codice colore al paziente --> vado in sala di attesa
		FREE_STUDIO, //si libera uno studio e chiamo un paziente
		TREATED, //paziente trattato e dimesso
		TIMEOUT, //attesa eccessiva in sala d'aspetto
		TICK, // evento periodico per verificare se ci sono studi vuoti
		
	}
	
	private LocalTime time;
	private EventType type;
	private Paziente paziente;
	
	
	public Event(LocalTime time, EventType type, Paziente paziente) {
		super();
		this.time = time;
		this.type = type;
		this.paziente= paziente;
	}




	public LocalTime getTime() {
		return time;
	}


	public EventType getType() {
		return type;
	}



	public Paziente getPaziente() {
		return paziente;
	}




	public void setPaziente(Paziente paziente) {
		this.paziente = paziente;
	}




	@Override
	public int compareTo(Event o) {
		// TODO Auto-generated method stub
		return this.time.compareTo(o.time);
	}




	@Override
	public String toString() {
		return "Event [time=" + time + ", type=" + type + ", paziente=" + paziente + "]";
	}
	
	
	
}
