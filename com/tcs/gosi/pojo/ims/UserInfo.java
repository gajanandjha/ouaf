
package com.tcs.gosi.pojo.ims;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "UserName",
    "EmployeeID"
})
public class UserInfo {

    @JsonProperty("UserName")
    private String userName;
    @JsonProperty("EmployeeID")
    private String employeeID;

    /**
     * 
     * @return
     *     The userName
     */
    @JsonProperty("UserName")
    public String getUserName() {
        return userName;
    }

    /**
     * 
     * @param userName
     *     The UserName
     */
    @JsonProperty("UserName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 
     * @return
     *     The employeeID
     */
    @JsonProperty("EmployeeID")
    public String getEmployeeID() {
        return employeeID;
    }

    /**
     * 
     * @param employeeID
     *     The EmployeeID
     */
    @JsonProperty("EmployeeID")
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

}
