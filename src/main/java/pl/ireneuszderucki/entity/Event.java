package pl.ireneuszderucki.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="events")
public class Event {
	
	@Transient
	private final String YEAR = "2018";
	
	@Transient
	private final String SECONDS = "00";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Transient
	@Pattern(regexp="^([1-2]{1}[0-9]{1})|(3{1}[0-1]{1})|(0{1}[1-9]{1})$")
	private String day;
	
	@Transient
	@Pattern(regexp="^([0-5]{1}[0-9]{1})$")
	private String minutes;
	
	@Transient
	@Pattern(regexp="^(1{1}[0-9]{1})|(2{1}[0-4]{1})|(0{1}[1-9]{1})")
	private String hour;
	
	@Transient
	@Pattern (regexp="^(0{1}[1-9]{1})|^(1{1}[1-2]{1})$")
	private String month;
	
	@NotBlank
	private String date;
	
	@NotBlank
	private String time;

	private boolean isValid = true;
	
	@NotBlank
	private String location;
	
	private String description;
	
	private String contactPerson;
	
	@ManyToOne
	@JoinColumn(name="offer_id")
	private JobOffer offer;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMinutes() {
		return minutes;
	}

	public void setMinutes(String minutes) {
		this.minutes = minutes;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public JobOffer getOffer() {
		return offer;
	}

	public void setOffer(JobOffer offer) {
		this.offer = offer;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getYEAR() {
		return YEAR;
	}

	public String getSECONDS() {
		return SECONDS;
	}
	
	
	
	
	
}
