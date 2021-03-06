package com.bluemaple.ticketreservation.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Movie {
	private int timings_id;
	private Float ticket_rate;
	private Float ticket_rate1;
	private int ticketTypeId;
	private String movie_name;
	private Date release_date;
	private int no_of_shows;
	private String created_by = "admin";
	private String updated_by = "admin";
	private String active = "yes";
	private int movie_id;

	Date today = Calendar.getInstance().getTime();
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss");
	private String date = formatter.format(today);

	public int getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}

	public int getTimings_id() {
		return timings_id;
	}

	public void setTimings_id(int timings_id) {
		this.timings_id = timings_id;
	}

	public Float getTicket_rate() {
		return ticket_rate;
	}

	public void setTicket_rate(Float ticket_rate) {
		this.ticket_rate = ticket_rate;
	}

	public Float getTicket_rate1() {
		return ticket_rate1;
	}

	public void setTicket_rate1(Float ticket_rate1) {
		this.ticket_rate1 = ticket_rate1;
	}

	public int getTicketTypeId() {
		return ticketTypeId;
	}

	public void setTicketTypeId(int ticketTypeId) {
		this.ticketTypeId = ticketTypeId;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public Date getRelease_date() {
		return release_date;
	}

	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}

	public int getNo_of_shows() {
		return no_of_shows;
	}

	public void setNo_of_shows(int no_of_shows) {
		this.no_of_shows = no_of_shows;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Movie [timings_id=" + timings_id + ", ticket_rate="
				+ ticket_rate + ", ticket_rate1=" + ticket_rate1
				+ ", ticketTypeId=" + ticketTypeId + ", movie_name="
				+ movie_name + ", release_date=" + release_date
				+ ", no_of_shows=" + no_of_shows + ", created_by=" + created_by
				+ ", updated_by=" + updated_by + ", active=" + active
				+ ", movie_id=" + movie_id + ", date=" + date + "]";
	}

}
