
package com.tcs.gosi.pojo.tmshmnt;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "input"
})
public class M1TmshMnt_ {

    @JsonProperty("input")
    private Input input;

    /**
     * 
     * @return
     *     The input
     */
    @JsonProperty("input")
    public Input getInput() {
        return input;
    }

    /**
     * 
     * @param input
     *     The input
     */
    @JsonProperty("input")
    public void setInput(Input input) {
        this.input = input;
    }

}
