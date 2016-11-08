
package com.tcs.gosi.pojo.getgeocod;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "rectLowerLeft",
    "distanceUnitDescription",
    "pointsList",
    "rectUpperLeft",
    "rectUpperRight",
    "totalDistance",
    "rectLowerRight",
    "distanceUnitAbbrDescription"
})
public class Route {

    @JsonProperty("rectLowerLeft")
    private RectLowerLeft rectLowerLeft;
    @JsonProperty("distanceUnitDescription")
    private String distanceUnitDescription;
    @JsonProperty("pointsList")
    private List<PointsList> pointsList = new ArrayList<PointsList>();
    @JsonProperty("rectUpperLeft")
    private RectUpperLeft rectUpperLeft;
    @JsonProperty("rectUpperRight")
    private RectUpperRight rectUpperRight;
    @JsonProperty("totalDistance")
    private String totalDistance;
    @JsonProperty("rectLowerRight")
    private RectLowerRight rectLowerRight;
    @JsonProperty("distanceUnitAbbrDescription")
    private String distanceUnitAbbrDescription;

    /**
     * 
     * @return
     *     The rectLowerLeft
     */
    @JsonProperty("rectLowerLeft")
    public RectLowerLeft getRectLowerLeft() {
        return rectLowerLeft;
    }

    /**
     * 
     * @param rectLowerLeft
     *     The rectLowerLeft
     */
    @JsonProperty("rectLowerLeft")
    public void setRectLowerLeft(RectLowerLeft rectLowerLeft) {
        this.rectLowerLeft = rectLowerLeft;
    }

    /**
     * 
     * @return
     *     The distanceUnitDescription
     */
    @JsonProperty("distanceUnitDescription")
    public String getDistanceUnitDescription() {
        return distanceUnitDescription;
    }

    /**
     * 
     * @param distanceUnitDescription
     *     The distanceUnitDescription
     */
    @JsonProperty("distanceUnitDescription")
    public void setDistanceUnitDescription(String distanceUnitDescription) {
        this.distanceUnitDescription = distanceUnitDescription;
    }

    /**
     * 
     * @return
     *     The pointsList
     */
    @JsonProperty("pointsList")
    public List<PointsList> getPointsList() {
        return pointsList;
    }

    /**
     * 
     * @param pointsList
     *     The pointsList
     */
    @JsonProperty("pointsList")
    public void setPointsList(List<PointsList> pointsList) {
        this.pointsList = pointsList;
    }

    /**
     * 
     * @return
     *     The rectUpperLeft
     */
    @JsonProperty("rectUpperLeft")
    public RectUpperLeft getRectUpperLeft() {
        return rectUpperLeft;
    }

    /**
     * 
     * @param rectUpperLeft
     *     The rectUpperLeft
     */
    @JsonProperty("rectUpperLeft")
    public void setRectUpperLeft(RectUpperLeft rectUpperLeft) {
        this.rectUpperLeft = rectUpperLeft;
    }

    /**
     * 
     * @return
     *     The rectUpperRight
     */
    @JsonProperty("rectUpperRight")
    public RectUpperRight getRectUpperRight() {
        return rectUpperRight;
    }

    /**
     * 
     * @param rectUpperRight
     *     The rectUpperRight
     */
    @JsonProperty("rectUpperRight")
    public void setRectUpperRight(RectUpperRight rectUpperRight) {
        this.rectUpperRight = rectUpperRight;
    }

    /**
     * 
     * @return
     *     The totalDistance
     */
    @JsonProperty("totalDistance")
    public String getTotalDistance() {
        return totalDistance;
    }

    /**
     * 
     * @param totalDistance
     *     The totalDistance
     */
    @JsonProperty("totalDistance")
    public void setTotalDistance(String totalDistance) {
        this.totalDistance = totalDistance;
    }

    /**
     * 
     * @return
     *     The rectLowerRight
     */
    @JsonProperty("rectLowerRight")
    public RectLowerRight getRectLowerRight() {
        return rectLowerRight;
    }

    /**
     * 
     * @param rectLowerRight
     *     The rectLowerRight
     */
    @JsonProperty("rectLowerRight")
    public void setRectLowerRight(RectLowerRight rectLowerRight) {
        this.rectLowerRight = rectLowerRight;
    }

    /**
     * 
     * @return
     *     The distanceUnitAbbrDescription
     */
    @JsonProperty("distanceUnitAbbrDescription")
    public String getDistanceUnitAbbrDescription() {
        return distanceUnitAbbrDescription;
    }

    /**
     * 
     * @param distanceUnitAbbrDescription
     *     The distanceUnitAbbrDescription
     */
    @JsonProperty("distanceUnitAbbrDescription")
    public void setDistanceUnitAbbrDescription(String distanceUnitAbbrDescription) {
        this.distanceUnitAbbrDescription = distanceUnitAbbrDescription;
    }

}
