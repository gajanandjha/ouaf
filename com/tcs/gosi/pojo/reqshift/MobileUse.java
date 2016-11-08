
package com.tcs.gosi.pojo.reqshift;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "vehicleResourceIdType",
    "logonLocationDescription",
    "logoffLocationDescription"
})
public class MobileUse {

    @JsonProperty("vehicleResourceIdType")
    private String vehicleResourceIdType;
    @JsonProperty("logonLocationDescription")
    private String logonLocationDescription;
    @JsonProperty("logoffLocationDescription")
    private String logoffLocationDescription;

    /**
     * 
     * @return
     *     The vehicleResourceIdType
     */
    @JsonProperty("vehicleResourceIdType")
    public String getVehicleResourceIdType() {
        return vehicleResourceIdType;
    }

    /**
     * 
     * @param vehicleResourceIdType
     *     The vehicleResourceIdType
     */
    @JsonProperty("vehicleResourceIdType")
    public void setVehicleResourceIdType(String vehicleResourceIdType) {
        this.vehicleResourceIdType = vehicleResourceIdType;
    }

    /**
     * 
     * @return
     *     The logonLocationDescription
     */
    @JsonProperty("logonLocationDescription")
    public String getLogonLocationDescription() {
        return logonLocationDescription;
    }

    /**
     * 
     * @param logonLocationDescription
     *     The logonLocationDescription
     */
    @JsonProperty("logonLocationDescription")
    public void setLogonLocationDescription(String logonLocationDescription) {
        this.logonLocationDescription = logonLocationDescription;
    }

    /**
     * 
     * @return
     *     The logoffLocationDescription
     */
    @JsonProperty("logoffLocationDescription")
    public String getLogoffLocationDescription() {
        return logoffLocationDescription;
    }

    /**
     * 
     * @param logoffLocationDescription
     *     The logoffLocationDescription
     */
    @JsonProperty("logoffLocationDescription")
    public void setLogoffLocationDescription(String logoffLocationDescription) {
        this.logoffLocationDescription = logoffLocationDescription;
    }

}
