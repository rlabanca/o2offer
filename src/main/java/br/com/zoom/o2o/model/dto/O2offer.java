package br.com.zoom.o2o.model.dto;

import org.elasticsearch.common.geo.GeoPoint;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="zo2om", type="o2offer")
public class O2offer {

	@Id
	private String id;
	
	private String ean;
	
	private String url;
	
	private Integer storeId;
	
	private String availability;
	
	private GeoPoint location;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public GeoPoint getLocation() {
		return location;
	}

	public void setLocation(GeoPoint location) {
		this.location = location;
	}
	
}
