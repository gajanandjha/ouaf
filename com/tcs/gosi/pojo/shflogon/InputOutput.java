
package com.tcs.gosi.pojo.shflogon;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "bodata",
    "relatedEntities"
})
public class InputOutput {

    @JsonProperty("bodata")
    private Bodata bodata;
    @JsonProperty("relatedEntities")
    private RelatedEntities relatedEntities;

    /**
     * 
     * @return
     *     The bodata
     */
    @JsonProperty("bodata")
    public Bodata getBodata() {
        return bodata;
    }

    /**
     * 
     * @param bodata
     *     The bodata
     */
    @JsonProperty("bodata")
    public void setBodata(Bodata bodata) {
        this.bodata = bodata;
    }

    /**
     * 
     * @return
     *     The relatedEntities
     */
    @JsonProperty("relatedEntities")
    public RelatedEntities getRelatedEntities() {
        return relatedEntities;
    }

    /**
     * 
     * @param relatedEntities
     *     The relatedEntities
     */
    @JsonProperty("relatedEntities")
    public void setRelatedEntities(RelatedEntities relatedEntities) {
        this.relatedEntities = relatedEntities;
    }

}
