
package com.tcs.gosi.pojo.syncdata;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "address1",
    "city",
    "state",
    "postal",
    "country",
    "geocodeLatitude",
    "geocodeLongitude"
})
public class SiteAddress {

    @JsonProperty("address1")
    private String address1;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("postal")
    private String postal;
    @JsonProperty("country")
    private String country;
    @JsonProperty("geocodeLatitude")
    private String geocodeLatitude;
    @JsonProperty("geocodeLongitude")
    private String geocodeLongitude;

    /**
     * 
     * @return
     *     The address1
     */
    @JsonProperty("address1")
    public String getAddress1() {
        return address1;
    }

    /**
     * 
     * @param address1
     *     The address1
     */
    @JsonProperty("address1")
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * 
     * @return
     *     The city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * @return
     *     The postal
     */
    @JsonProperty("postal")
    public String getPostal() {
        return postal;
    }

    /**
     * 
     * @param postal
     *     The postal
     */
    @JsonProperty("postal")
    public void setPostal(String postal) {
        this.postal = postal;
    }

    /**
     * 
     * @return
     *     The country
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The geocodeLatitude
     */
    @JsonProperty("geocodeLatitude")
    public String getGeocodeLatitude() {
        return geocodeLatitude;
    }

    /**
     * 
     * @param geocodeLatitude
     *     The geocodeLatitude
     */
    @JsonProperty("geocodeLatitude")
    public void setGeocodeLatitude(String geocodeLatitude) {
        this.geocodeLatitude = geocodeLatitude;
    }

    /**
     * 
     * @return
     *     The geocodeLongitude
     */
    @JsonProperty("geocodeLongitude")
    public String getGeocodeLongitude() {
        return geocodeLongitude;
    }

    /**
     * 
     * @param geocodeLongitude
     *     The geocodeLongitude
     */
    @JsonProperty("geocodeLongitude")
    public void setGeocodeLongitude(String geocodeLongitude) {
        this.geocodeLongitude = geocodeLongitude;
    }

}
