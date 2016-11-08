
package com.tcs.gosi.pojo.shflogon;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "M1-ShfLogon"
})
public class M1ShfLogon {

    @JsonProperty("M1-ShfLogon")
    private M1ShfLogon_ m1ShfLogon;

    /**
     * 
     * @return
     *     The m1ShfLogon
     */
    @JsonProperty("M1-ShfLogon")
    public M1ShfLogon_ getM1ShfLogon() {
        return m1ShfLogon;
    }

    /**
     * 
     * @param m1ShfLogon
     *     The M1-ShfLogon
     */
    @JsonProperty("M1-ShfLogon")
    public void setM1ShfLogon(M1ShfLogon_ m1ShfLogon) {
        this.m1ShfLogon = m1ShfLogon;
    }

}
