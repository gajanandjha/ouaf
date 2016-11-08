
package com.tcs.gosi.pojo.syncdata;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "boName",
    "action",
    "etaUpdateFlg",
    "boData",
    "relatedEntities"
})
public class Input_ {

    @JsonProperty("boName")
    private String boName;
    @JsonProperty("action")
    private String action;
    @JsonProperty("etaUpdateFlg")
    private String etaUpdateFlg;
    @JsonProperty("boData")
    private BoData boData;
    @JsonProperty("relatedEntities")
    private String relatedEntities;

	/**
     * 
     * @return
     *     The boName
     */
    @JsonProperty("boName")
    public String getBoName() {
        return boName;
    }

    /**
     * 
     * @param boName
     *     The boName
     */
    @JsonProperty("boName")
    public void setBoName(String boName) {
        this.boName = boName;
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

    /**
     * 
     * @return
     *     The etaUpdateFlg
     */
    @JsonProperty("etaUpdateFlg")
    public String getEtaUpdateFlg() {
        return etaUpdateFlg;
    }

    /**
     * 
     * @param etaUpdateFlg
     *     The etaUpdateFlg
     */
    @JsonProperty("etaUpdateFlg")
    public void setEtaUpdateFlg(String etaUpdateFlg) {
        this.etaUpdateFlg = etaUpdateFlg;
    }

    /**
     * 
     * @return
     *     The boData
     */
    @JsonProperty("boData")
    public BoData getBoData() {
        return boData;
    }

    /**
     * 
     * @param boData
     *     The boData
     */
    @JsonProperty("boData")
    public void setBoData(BoData boData) {
        this.boData = boData;
    }
    
    @JsonProperty("relatedEntities")
    public String getRelatedEntities() {
		return relatedEntities;
	}

    @JsonProperty("relatedEntities")
	public void setRelatedEntities(String relatedEntities) {
		this.relatedEntities = relatedEntities;
	}

}
