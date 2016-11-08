
package com.tcs.gosi.pojo.ims;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "VehicleType",
    "VehicleNo"
})
public class VehicleInfo {

    @JsonProperty("VehicleType")
    private String vehicleType;
    @JsonProperty("VehicleNo")
    private String vehicleNo;

    /**
     * 
     * @return
     *     The vehicleType
     */
    @JsonProperty("VehicleType")
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * 
     * @param vehicleType
     *     The VehicleType
     */
    @JsonProperty("VehicleType")
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * 
     * @return
     *     The vehicleNo
     */
    @JsonProperty("VehicleNo")
    public String getVehicleNo() {
        return vehicleNo;
    }

    /**
     * 
     * @param vehicleNo
     *     The VehicleNo
     */
    @JsonProperty("VehicleNo")
    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

}
