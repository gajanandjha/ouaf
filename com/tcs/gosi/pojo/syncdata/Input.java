
package com.tcs.gosi.pojo.syncdata;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "mdtId",
    "messages"
})
public class Input {

    @JsonProperty("mdtId")
    private String mdtId;
    @JsonProperty("messages")
    private String messages;

    /**
     * 
     * @return
     *     The mdtId
     */
    @JsonProperty("mdtId")
    public String getMdtId() {
        return mdtId;
    }

    /**
     * 
     * @param mdtId
     *     The mdtId
     */
    @JsonProperty("mdtId")
    public void setMdtId(String mdtId) {
        this.mdtId = mdtId;
    }

    /**
     * 
     * @return
     *     The messages
     */
    @JsonProperty("messages")
    public String getMessages() {
        return messages;
    }

    /**
     * 
     * @param messages
     *     The messages
     */
    @JsonProperty("messages")
    public void setMessages(String messages) {
        this.messages = messages;
    }

}
