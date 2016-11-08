
package com.tcs.gosi.pojo.gtprvtsks;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "hasAttachments"
})
public class MobileUse {

    @JsonProperty("hasAttachments")
    private String hasAttachments;

    /**
     * 
     * @return
     *     The hasAttachments
     */
    @JsonProperty("hasAttachments")
    public String getHasAttachments() {
        return hasAttachments;
    }

    /**
     * 
     * @param hasAttachments
     *     The hasAttachments
     */
    @JsonProperty("hasAttachments")
    public void setHasAttachments(String hasAttachments) {
        this.hasAttachments = hasAttachments;
    }

}
