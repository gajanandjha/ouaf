
package com.tcs.gosi.pojo.shflogon;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "moName",
    "entityBoName",
    "entityBoData",
    "entityKeyName",
    "entityKeyValue",
    "action"
})
public class RelatedEntityList {

    @JsonProperty("moName")
    private String moName;
    @JsonProperty("entityBoName")
    private String entityBoName;
    @JsonProperty("entityBoData")
    private EntityBoData entityBoData;
    @JsonProperty("entityKeyName")
    private String entityKeyName;
    @JsonProperty("entityKeyValue")
    private String entityKeyValue;
    @JsonProperty("action")
    private String action;

    /**
     * 
     * @return
     *     The moName
     */
    @JsonProperty("moName")
    public String getMoName() {
        return moName;
    }

    /**
     * 
     * @param moName
     *     The moName
     */
    @JsonProperty("moName")
    public void setMoName(String moName) {
        this.moName = moName;
    }

    /**
     * 
     * @return
     *     The entityBoName
     */
    @JsonProperty("entityBoName")
    public String getEntityBoName() {
        return entityBoName;
    }

    /**
     * 
     * @param entityBoName
     *     The entityBoName
     */
    @JsonProperty("entityBoName")
    public void setEntityBoName(String entityBoName) {
        this.entityBoName = entityBoName;
    }

    /**
     * 
     * @return
     *     The entityBoData
     */
    @JsonProperty("entityBoData")
    public EntityBoData getEntityBoData() {
        return entityBoData;
    }

    /**
     * 
     * @param entityBoData
     *     The entityBoData
     */
    @JsonProperty("entityBoData")
    public void setEntityBoData(EntityBoData entityBoData) {
        this.entityBoData = entityBoData;
    }

    /**
     * 
     * @return
     *     The entityKeyName
     */
    @JsonProperty("entityKeyName")
    public String getEntityKeyName() {
        return entityKeyName;
    }

    /**
     * 
     * @param entityKeyName
     *     The entityKeyName
     */
    @JsonProperty("entityKeyName")
    public void setEntityKeyName(String entityKeyName) {
        this.entityKeyName = entityKeyName;
    }

    /**
     * 
     * @return
     *     The entityKeyValue
     */
    @JsonProperty("entityKeyValue")
    public String getEntityKeyValue() {
        return entityKeyValue;
    }

    /**
     * 
     * @param entityKeyValue
     *     The entityKeyValue
     */
    @JsonProperty("entityKeyValue")
    public void setEntityKeyValue(String entityKeyValue) {
        this.entityKeyValue = entityKeyValue;
    }

    /**
     * 
     * @return
     *     The action
     */
    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    /**
     * 
     * @param action
     *     The action
     */
    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

}
