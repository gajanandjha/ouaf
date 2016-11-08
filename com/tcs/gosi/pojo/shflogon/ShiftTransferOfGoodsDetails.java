
package com.tcs.gosi.pojo.shflogon;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "capacity",
    "depots"
})
public class ShiftTransferOfGoodsDetails {

    @JsonProperty("capacity")
    private String capacity;
    @JsonProperty("depots")
    private String depots;

    /**
     * 
     * @return
     *     The capacity
     */
    @JsonProperty("capacity")
    public String getCapacity() {
        return capacity;
    }

    /**
     * 
     * @param capacity
     *     The capacity
     */
    @JsonProperty("capacity")
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    /**
     * 
     * @return
     *     The depots
     */
    @JsonProperty("depots")
    public String getDepots() {
        return depots;
    }

    /**
     * 
     * @param depots
     *     The depots
     */
    @JsonProperty("depots")
    public void setDepots(String depots) {
        this.depots = depots;
    }

}
