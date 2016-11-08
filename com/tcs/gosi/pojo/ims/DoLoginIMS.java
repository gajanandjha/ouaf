
package com.tcs.gosi.pojo.ims;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "UserLogInfo",
    "ShiftInfo",
    "UserInfo",
    "VehicleInfo"
})
public class DoLoginIMS {

    @JsonProperty("UserLogInfo")
    private UserLogInfo userLogInfo;
    @JsonProperty("ShiftInfo")
    private ShiftInfo shiftInfo;
    @JsonProperty("UserInfo")
    private List<UserInfo> userInfo = new ArrayList<UserInfo>();
    @JsonProperty("VehicleInfo")
    private List<VehicleInfo> vehicleInfo = new ArrayList<VehicleInfo>();

    /**
     * 
     * @return
     *     The userLogInfo
     */
    @JsonProperty("UserLogInfo")
    public UserLogInfo getUserLogInfo() {
        return userLogInfo;
    }

    /**
     * 
     * @param userLogInfo
     *     The UserLogInfo
     */
    @JsonProperty("UserLogInfo")
    public void setUserLogInfo(UserLogInfo userLogInfo) {
        this.userLogInfo = userLogInfo;
    }

    /**
     * 
     * @return
     *     The shiftInfo
     */
    @JsonProperty("ShiftInfo")
    public ShiftInfo getShiftInfo() {
        return shiftInfo;
    }

    /**
     * 
     * @param shiftInfo
     *     The ShiftInfo
     */
    @JsonProperty("ShiftInfo")
    public void setShiftInfo(ShiftInfo shiftInfo) {
        this.shiftInfo = shiftInfo;
    }

    /**
     * 
     * @return
     *     The userInfo
     */
    @JsonProperty("UserInfo")
    public List<UserInfo> getUserInfo() {
        return userInfo;
    }

    /**
     * 
     * @param userInfo
     *     The UserInfo
     */
    @JsonProperty("UserInfo")
    public void setUserInfo(List<UserInfo> userInfo) {
        this.userInfo = userInfo;
    }

    /**
     * 
     * @return
     *     The vehicleInfo
     */
    @JsonProperty("VehicleInfo")
    public List<VehicleInfo> getVehicleInfo() {
        return vehicleInfo;
    }

    /**
     * 
     * @param vehicleInfo
     *     The VehicleInfo
     */
    @JsonProperty("VehicleInfo")
    public void setVehicleInfo(List<VehicleInfo> vehicleInfo) {
        this.vehicleInfo = vehicleInfo;
    }

}
