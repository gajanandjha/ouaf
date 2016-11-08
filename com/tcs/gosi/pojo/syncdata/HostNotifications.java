
package com.tcs.gosi.pojo.syncdata;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "notifyHostOfDispatch",
    "notifyHostOfStatusUpdate",
    "notifyHostOfCompletionOnly"
})
public class HostNotifications {

    @JsonProperty("notifyHostOfDispatch")
    private String notifyHostOfDispatch;
    @JsonProperty("notifyHostOfStatusUpdate")
    private String notifyHostOfStatusUpdate;
    @JsonProperty("notifyHostOfCompletionOnly")
    private String notifyHostOfCompletionOnly;

    /**
     * 
     * @return
     *     The notifyHostOfDispatch
     */
    @JsonProperty("notifyHostOfDispatch")
    public String getNotifyHostOfDispatch() {
        return notifyHostOfDispatch;
    }

    /**
     * 
     * @param notifyHostOfDispatch
     *     The notifyHostOfDispatch
     */
    @JsonProperty("notifyHostOfDispatch")
    public void setNotifyHostOfDispatch(String notifyHostOfDispatch) {
        this.notifyHostOfDispatch = notifyHostOfDispatch;
    }

    /**
     * 
     * @return
     *     The notifyHostOfStatusUpdate
     */
    @JsonProperty("notifyHostOfStatusUpdate")
    public String getNotifyHostOfStatusUpdate() {
        return notifyHostOfStatusUpdate;
    }

    /**
     * 
     * @param notifyHostOfStatusUpdate
     *     The notifyHostOfStatusUpdate
     */
    @JsonProperty("notifyHostOfStatusUpdate")
    public void setNotifyHostOfStatusUpdate(String notifyHostOfStatusUpdate) {
        this.notifyHostOfStatusUpdate = notifyHostOfStatusUpdate;
    }

    /**
     * 
     * @return
     *     The notifyHostOfCompletionOnly
     */
    @JsonProperty("notifyHostOfCompletionOnly")
    public String getNotifyHostOfCompletionOnly() {
        return notifyHostOfCompletionOnly;
    }

    /**
     * 
     * @param notifyHostOfCompletionOnly
     *     The notifyHostOfCompletionOnly
     */
    @JsonProperty("notifyHostOfCompletionOnly")
    public void setNotifyHostOfCompletionOnly(String notifyHostOfCompletionOnly) {
        this.notifyHostOfCompletionOnly = notifyHostOfCompletionOnly;
    }

}
