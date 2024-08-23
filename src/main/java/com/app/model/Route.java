package com.app.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
;



@Entity
public class Route {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer routeId;
	
	@NotNull(message = "This Field can not be null..")
	@NotBlank(message = "This Field can not be blank..")
	@NotEmpty(message = "This Field can not be empty..")
	private String  routeFrom;
	
	@NotNull(message = "This Field can not be null..")
	@NotBlank(message = "This Field can not be blank..")
	@NotEmpty(message = "This Field can not be empty..")
	private String routeTo;
	
	private Integer distance;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "route")
	private List<Bus> bus;
	
	
	public Integer getRouteId() {
		return routeId;
	}
	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
	}
	public String getRouteFrom() {
		return routeFrom;
	}
	public void setRouteFrom(String routeFrom) {
		this.routeFrom = routeFrom;
	}
	public String getRouteTo() {
		return routeTo;
	}
	public void setRouteTo(String routeTo) {
		this.routeTo = routeTo;
	}
	public Integer getDistance() {
		return distance;
	}
	public void setDistance(Integer distance) {
		this.distance = distance;
	}
	public List<Bus> getBus() {
		return bus;
	}
	public void setBus(List<Bus> bus) {
		this.bus = bus;
	}
	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", routeFrom=" + routeFrom + ", routeTo=" + routeTo + ", distance="
				+ distance + ", bus=" + bus + "]";
	}
	public Route(Integer routeId, String routeFrom, String routeTo, Integer distance, List<Bus> bus) {
		super();
		this.routeId = routeId;
		this.routeFrom = routeFrom;
		this.routeTo = routeTo;
		this.distance = distance;
		this.bus = bus;
	}
	
	public Route() {
		// TODO Auto-generated constructor stub
	}
	

}
