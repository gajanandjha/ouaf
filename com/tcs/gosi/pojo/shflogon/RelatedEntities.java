
package com.tcs.gosi.pojo.shflogon;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "relatedEntityList"
})
public class RelatedEntities {

    @JsonProperty("relatedEntityList")
    private List<RelatedEntityList> relatedEntityList = new ArrayList<RelatedEntityList>();

    /**
     * 
     * @return
     *     The relatedEntityList
     */
    @JsonProperty("relatedEntityList")
    public List<RelatedEntityList> getRelatedEntityList() {
        return relatedEntityList;
    }

    /**
     * 
     * @param relatedEntityList
     *     The relatedEntityList
     */
    @JsonProperty("relatedEntityList")
    public void setRelatedEntityList(List<RelatedEntityList> relatedEntityList) {
        this.relatedEntityList = relatedEntityList;
    }

}
