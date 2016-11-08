
package com.tcs.gosi.pojo.syncdata;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "msgId",
    "msgName",
    "msgData",
    "priority"
})
public class Message {

    @JsonProperty("msgId")
    private String msgId;
    @JsonProperty("msgName")
    private String msgName;
    @JsonProperty("msgData")
    private MsgData msgData;
    @JsonProperty("priority")
    private String priority;

    /**
     * 
     * @return
     *     The msgId
     */
    @JsonProperty("msgId")
    public String getMsgId() {
        return msgId;
    }

    /**
     * 
     * @param msgId
     *     The msgId
     */
    @JsonProperty("msgId")
    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    /**
     * 
     * @return
     *     The msgName
     */
    @JsonProperty("msgName")
    public String getMsgName() {
        return msgName;
    }

    /**
     * 
     * @param msgName
     *     The msgName
     */
    @JsonProperty("msgName")
    public void setMsgName(String msgName) {
        this.msgName = msgName;
    }

    /**
     * 
     * @return
     *     The msgData
     */
    @JsonProperty("msgData")
    public MsgData getMsgData() {
        return msgData;
    }

    /**
     * 
     * @param msgData
     *     The msgData
     */
    @JsonProperty("msgData")
    public void setMsgData(MsgData msgData) {
        this.msgData = msgData;
    }

    /**
     * 
     * @return
     *     The priority
     */
    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    /**
     * 
     * @param priority
     *     The priority
     */
    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

}
