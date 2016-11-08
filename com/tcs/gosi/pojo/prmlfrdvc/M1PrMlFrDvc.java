
package com.tcs.gosi.pojo.prmlfrdvc;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "M1-PrMlFrDvc"
})
public class M1PrMlFrDvc {

    @JsonProperty("M1-PrMlFrDvc")
    private M1PrMlFrDvc_ m1PrMlFrDvc;

    /**
     * 
     * @return
     *     The m1PrMlFrDvc
     */
    @JsonProperty("M1-PrMlFrDvc")
    public M1PrMlFrDvc_ getM1PrMlFrDvc() {
        return m1PrMlFrDvc;
    }

    /**
     * 
     * @param m1PrMlFrDvc
     *     The M1-PrMlFrDvc
     */
    @JsonProperty("M1-PrMlFrDvc")
    public void setM1PrMlFrDvc(M1PrMlFrDvc_ m1PrMlFrDvc) {
        this.m1PrMlFrDvc = m1PrMlFrDvc;
    }

}
