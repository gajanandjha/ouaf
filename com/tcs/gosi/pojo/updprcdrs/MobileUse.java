
package com.tcs.gosi.pojo.updprcdrs;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "entityInformation"
})
public class MobileUse {

    @JsonProperty("entityInformation")
    private String entityInformation;

    /**
     * 
     * @return
     *     The entityInformation
     */
    @JsonProperty("entityInformation")
    public String getEntityInformation() {
        return entityInformation;
    }

    /**
     * 
     * @param entityInformation
     *     The entityInformation
     */
    @JsonProperty("entityInformation")
    public void setEntityInformation(String entityInformation) {
        this.entityInformation = entityInformation;
    }

}
