
package com.tcs.gosi.pojo.getgeocod;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "M1-GetGeoCod"
})
public class M1GetGeoCod {

    @JsonProperty("M1-GetGeoCod")
    private M1GetGeoCod_ m1GetGeoCod;

    /**
     * 
     * @return
     *     The m1GetGeoCod
     */
    @JsonProperty("M1-GetGeoCod")
    public M1GetGeoCod_ getM1GetGeoCod() {
        return m1GetGeoCod;
    }

    /**
     * 
     * @param m1GetGeoCod
     *     The M1-GetGeoCod
     */
    @JsonProperty("M1-GetGeoCod")
    public void setM1GetGeoCod(M1GetGeoCod_ m1GetGeoCod) {
        this.m1GetGeoCod = m1GetGeoCod;
    }

}
