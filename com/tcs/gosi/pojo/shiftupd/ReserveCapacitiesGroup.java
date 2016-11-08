
package com.tcs.gosi.pojo.shiftupd;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "reserveCapacitiesList"
})
public class ReserveCapacitiesGroup {

    @JsonProperty("reserveCapacitiesList")
    private List<Object> reserveCapacitiesList = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The reserveCapacitiesList
     */
    @JsonProperty("reserveCapacitiesList")
    public List<Object> getReserveCapacitiesList() {
        return reserveCapacitiesList;
    }

    /**
     * 
     * @param reserveCapacitiesList
     *     The reserveCapacitiesList
     */
    @JsonProperty("reserveCapacitiesList")
    public void setReserveCapacitiesList(List<Object> reserveCapacitiesList) {
        this.reserveCapacitiesList = reserveCapacitiesList;
    }

}
