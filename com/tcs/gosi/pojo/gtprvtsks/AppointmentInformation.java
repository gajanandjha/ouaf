
package com.tcs.gosi.pojo.gtprvtsks;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "appointment"
})
public class AppointmentInformation {

    @JsonProperty("appointment")
    private String appointment;

    /**
     * 
     * @return
     *     The appointment
     */
    @JsonProperty("appointment")
    public String getAppointment() {
        return appointment;
    }

    /**
     * 
     * @param appointment
     *     The appointment
     */
    @JsonProperty("appointment")
    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

}
