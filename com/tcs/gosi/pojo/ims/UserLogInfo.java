
package com.tcs.gosi.pojo.ims;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "sucess",
    "message"
})
public class UserLogInfo {

    @JsonProperty("sucess")
    private String sucess;
    @JsonProperty("message")
    private String message;

    /**
     * 
     * @return
     *     The sucess
     */
    @JsonProperty("sucess")
    public String getSucess() {
        return sucess;
    }

    /**
     * 
     * @param sucess
     *     The sucess
     */
    @JsonProperty("sucess")
    public void setSucess(String sucess) {
        this.sucess = sucess;
    }

    /**
     * 
     * @return
     *     The message
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     *     The message
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

}
