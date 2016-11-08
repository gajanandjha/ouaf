
package com.tcs.gosi.pojo.getgeocod;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "mapDefaultZoomLevel",
    "mapDs",
    "mapDefaultLongitude",
    "copyRightNote",
    "mapServerUrl",
    "realGPSThreshold",
    "mapDefaultLattitue",
    "mapDataSource",
    "mapUseSlr",
    "mapTileLayer",
    "mapInclude",
    "featureType"
})
public class MapViewerDetails {

    @JsonProperty("mapDefaultZoomLevel")
    private String mapDefaultZoomLevel;
    @JsonProperty("mapDs")
    private String mapDs;
    @JsonProperty("mapDefaultLongitude")
    private String mapDefaultLongitude;
    @JsonProperty("copyRightNote")
    private String copyRightNote;
    @JsonProperty("mapServerUrl")
    private String mapServerUrl;
    @JsonProperty("realGPSThreshold")
    private String realGPSThreshold;
    @JsonProperty("mapDefaultLattitue")
    private String mapDefaultLattitue;
    @JsonProperty("mapDataSource")
    private String mapDataSource;
    @JsonProperty("mapUseSlr")
    private String mapUseSlr;
    @JsonProperty("mapTileLayer")
    private String mapTileLayer;
    @JsonProperty("mapInclude")
    private String mapInclude;
    @JsonProperty("featureType")
    private String featureType;

    /**
     * 
     * @return
     *     The mapDefaultZoomLevel
     */
    @JsonProperty("mapDefaultZoomLevel")
    public String getMapDefaultZoomLevel() {
        return mapDefaultZoomLevel;
    }

    /**
     * 
     * @param mapDefaultZoomLevel
     *     The mapDefaultZoomLevel
     */
    @JsonProperty("mapDefaultZoomLevel")
    public void setMapDefaultZoomLevel(String mapDefaultZoomLevel) {
        this.mapDefaultZoomLevel = mapDefaultZoomLevel;
    }

    /**
     * 
     * @return
     *     The mapDs
     */
    @JsonProperty("mapDs")
    public String getMapDs() {
        return mapDs;
    }

    /**
     * 
     * @param mapDs
     *     The mapDs
     */
    @JsonProperty("mapDs")
    public void setMapDs(String mapDs) {
        this.mapDs = mapDs;
    }

    /**
     * 
     * @return
     *     The mapDefaultLongitude
     */
    @JsonProperty("mapDefaultLongitude")
    public String getMapDefaultLongitude() {
        return mapDefaultLongitude;
    }

    /**
     * 
     * @param mapDefaultLongitude
     *     The mapDefaultLongitude
     */
    @JsonProperty("mapDefaultLongitude")
    public void setMapDefaultLongitude(String mapDefaultLongitude) {
        this.mapDefaultLongitude = mapDefaultLongitude;
    }

    /**
     * 
     * @return
     *     The copyRightNote
     */
    @JsonProperty("copyRightNote")
    public String getCopyRightNote() {
        return copyRightNote;
    }

    /**
     * 
     * @param copyRightNote
     *     The copyRightNote
     */
    @JsonProperty("copyRightNote")
    public void setCopyRightNote(String copyRightNote) {
        this.copyRightNote = copyRightNote;
    }

    /**
     * 
     * @return
     *     The mapServerUrl
     */
    @JsonProperty("mapServerUrl")
    public String getMapServerUrl() {
        return mapServerUrl;
    }

    /**
     * 
     * @param mapServerUrl
     *     The mapServerUrl
     */
    @JsonProperty("mapServerUrl")
    public void setMapServerUrl(String mapServerUrl) {
        this.mapServerUrl = mapServerUrl;
    }

    /**
     * 
     * @return
     *     The realGPSThreshold
     */
    @JsonProperty("realGPSThreshold")
    public String getRealGPSThreshold() {
        return realGPSThreshold;
    }

    /**
     * 
     * @param realGPSThreshold
     *     The realGPSThreshold
     */
    @JsonProperty("realGPSThreshold")
    public void setRealGPSThreshold(String realGPSThreshold) {
        this.realGPSThreshold = realGPSThreshold;
    }

    /**
     * 
     * @return
     *     The mapDefaultLattitue
     */
    @JsonProperty("mapDefaultLattitue")
    public String getMapDefaultLattitue() {
        return mapDefaultLattitue;
    }

    /**
     * 
     * @param mapDefaultLattitue
     *     The mapDefaultLattitue
     */
    @JsonProperty("mapDefaultLattitue")
    public void setMapDefaultLattitue(String mapDefaultLattitue) {
        this.mapDefaultLattitue = mapDefaultLattitue;
    }

    /**
     * 
     * @return
     *     The mapDataSource
     */
    @JsonProperty("mapDataSource")
    public String getMapDataSource() {
        return mapDataSource;
    }

    /**
     * 
     * @param mapDataSource
     *     The mapDataSource
     */
    @JsonProperty("mapDataSource")
    public void setMapDataSource(String mapDataSource) {
        this.mapDataSource = mapDataSource;
    }

    /**
     * 
     * @return
     *     The mapUseSlr
     */
    @JsonProperty("mapUseSlr")
    public String getMapUseSlr() {
        return mapUseSlr;
    }

    /**
     * 
     * @param mapUseSlr
     *     The mapUseSlr
     */
    @JsonProperty("mapUseSlr")
    public void setMapUseSlr(String mapUseSlr) {
        this.mapUseSlr = mapUseSlr;
    }

    /**
     * 
     * @return
     *     The mapTileLayer
     */
    @JsonProperty("mapTileLayer")
    public String getMapTileLayer() {
        return mapTileLayer;
    }

    /**
     * 
     * @param mapTileLayer
     *     The mapTileLayer
     */
    @JsonProperty("mapTileLayer")
    public void setMapTileLayer(String mapTileLayer) {
        this.mapTileLayer = mapTileLayer;
    }

    /**
     * 
     * @return
     *     The mapInclude
     */
    @JsonProperty("mapInclude")
    public String getMapInclude() {
        return mapInclude;
    }

    /**
     * 
     * @param mapInclude
     *     The mapInclude
     */
    @JsonProperty("mapInclude")
    public void setMapInclude(String mapInclude) {
        this.mapInclude = mapInclude;
    }

    /**
     * 
     * @return
     *     The featureType
     */
    @JsonProperty("featureType")
    public String getFeatureType() {
        return featureType;
    }

    /**
     * 
     * @param featureType
     *     The featureType
     */
    @JsonProperty("featureType")
    public void setFeatureType(String featureType) {
        this.featureType = featureType;
    }

}
