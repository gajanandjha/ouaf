
package com.tcs.gosi.pojo.syncdata;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "vehicleResourceIdType",
    "logonLocationDescription",
    "logoffLocationDescription",
    "isDeclineAllowed",
    "hasAttachments",
    "assignedToCapacity",
    "statusReasonGroup",
    "procedureStatus",
    "siteAddress"
})
public class MobileUse {

    @JsonProperty("vehicleResourceIdType")
    private String vehicleResourceIdType;
    @JsonProperty("logonLocationDescription")
    private String logonLocationDescription;
    @JsonProperty("logoffLocationDescription")
    private String logoffLocationDescription;
    @JsonProperty("isDeclineAllowed")
    private String isDeclineAllowed;
    @JsonProperty("hasAttachments")
    private String hasAttachments;
    @JsonProperty("assignedToCapacity")
    private String assignedToCapacity;
    @JsonProperty("statusReasonGroup")
    private String statusReasonGroup;
    @JsonProperty("procedureStatus")
    private String procedureStatus;
    @JsonProperty("siteAddress")
    private String siteAddress;


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

    @JsonProperty("isDeclineAllowed")
	public String getIsDeclineAllowed() {
		return isDeclineAllowed;
	}

    @JsonProperty("isDeclineAllowed")
	public void setIsDeclineAllowed(String isDeclineAllowed) {
		this.isDeclineAllowed = isDeclineAllowed;
	}

    @JsonProperty("hasAttachments")
	public String getHasAttachments() {
		return hasAttachments;
	}

    @JsonProperty("hasAttachments")
	public void setHasAttachments(String hasAttachments) {
		this.hasAttachments = hasAttachments;
	}

    @JsonProperty("assignedToCapacity")
	public String getAssignedToCapacity() {
		return assignedToCapacity;
	}

    @JsonProperty("assignedToCapacity")
	public void setAssignedToCapacity(String assignedToCapacity) {
		this.assignedToCapacity = assignedToCapacity;
	}

    @JsonProperty("statusReasonGroup")
	public String getStatusReasonGroup() {
		return statusReasonGroup;
	}

    @JsonProperty("statusReasonGroup")
	public void setStatusReasonGroup(String statusReasonGroup) {
		this.statusReasonGroup = statusReasonGroup;
	}

    @JsonProperty("procedureStatus")
	public String getProcedureStatus() {
		return procedureStatus;
	}

    @JsonProperty("procedureStatus")
	public void setProcedureStatus(String procedureStatus) {
		this.procedureStatus = procedureStatus;
	}

    @JsonProperty("siteAddress")
	public String getSiteAddress() {
		return siteAddress;
	}

    @JsonProperty("siteAddress")
	public void setSiteAddress(String siteAddress) {
		this.siteAddress = siteAddress;
	}

}
