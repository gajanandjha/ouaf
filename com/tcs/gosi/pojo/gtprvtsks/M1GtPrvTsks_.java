
package com.tcs.gosi.pojo.gtprvtsks;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "input",
    "output"
})
public class M1GtPrvTsks_ {

    @JsonProperty("input")
    private Input input;
    @JsonProperty("output")
    private Output output;

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

    /**
     * 
     * @return
     *     The output
     */
    @JsonProperty("output")
    public Output getOutput() {
        return output;
    }

    /**
     * 
     * @param output
     *     The output
     */
    @JsonProperty("output")
    public void setOutput(Output output) {
        this.output = output;
    }

}
