
package com.tcs.gosi.pojo.shflogon;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "procedureId",
    "completionInformation",
    "shiftId",
    "procedureType",
    "procedureState",
    "mo",
    "boStatus",
    "boStatusDateTime",
    "bo",
    "version",
    "pkValue1",
    "mobileLog",
    "typeDetails",
    "creationDateTime",
    "mobileUse",
    "procedureBo",
    "procedureProcessingDetails",
    "relatedEntity",
    "description",
    "procedureStepDetails",
    "detailedDescription",
    "statusDateTime",
    "effectiveDate",
    "expirationDate"
})
public class EntityBoData {

    @JsonProperty("procedureId")
    private String procedureId;
    @JsonProperty("completionInformation")
    private CompletionInformation completionInformation;
    @JsonProperty("shiftId")
    private String shiftId;
    @JsonProperty("procedureType")
    private String procedureType;
    @JsonProperty("procedureState")
    private String procedureState;
    @JsonProperty("mo")
    private String mo;
    @JsonProperty("boStatus")
    private String boStatus;
    @JsonProperty("boStatusDateTime")
    private String boStatusDateTime;
    @JsonProperty("bo")
    private String bo;
    @JsonProperty("version")
    private String version;
    @JsonProperty("pkValue1")
    private String pkValue1;
    @JsonProperty("mobileLog")
    private String mobileLog;
    @JsonProperty("typeDetails")
    private TypeDetails typeDetails;
    @JsonProperty("creationDateTime")
    private String creationDateTime;
    @JsonProperty("mobileUse")
    private MobileUse mobileUse;
    
    @JsonProperty("procedureBo")
    private String procedureBo;
    @JsonProperty("procedureProcessingDetails")
    private ProcedureProcessingDetails procedureProcessingDetails;
    @JsonProperty("relatedEntity")
    private String relatedEntity;
    @JsonProperty("description")
    private String description;
    @JsonProperty("procedureStepDetails")
    private ProcedureStepDetails procedureStepDetails;
    @JsonProperty("detailedDescription")
    private String detailedDescription;
    @JsonProperty("statusDateTime")
    private String statusDateTime;
    @JsonProperty("effectiveDate")
    private String effectiveDate;
    @JsonProperty("expirationDate")
    private String expirationDate;

    /**
     * 
     * @return
     *     The procedureId
     */
    @JsonProperty("procedureId")
    public String getProcedureId() {
        return procedureId;
    }

    /**
     * 
     * @param procedureId
     *     The procedureId
     */
    @JsonProperty("procedureId")
    public void setProcedureId(String procedureId) {
        this.procedureId = procedureId;
    }

    /**
     * 
     * @return
     *     The completionInformation
     */
    @JsonProperty("completionInformation")
    public CompletionInformation getCompletionInformation() {
        return completionInformation;
    }

    /**
     * 
     * @param completionInformation
     *     The completionInformation
     */
    @JsonProperty("completionInformation")
    public void setCompletionInformation(CompletionInformation completionInformation) {
        this.completionInformation = completionInformation;
    }

    /**
     * 
     * @return
     *     The shiftId
     */
    @JsonProperty("shiftId")
    public String getShiftId() {
        return shiftId;
    }

    /**
     * 
     * @param shiftId
     *     The shiftId
     */
    @JsonProperty("shiftId")
    public void setShiftId(String shiftId) {
        this.shiftId = shiftId;
    }

    /**
     * 
     * @return
     *     The procedureType
     */
    @JsonProperty("procedureType")
    public String getProcedureType() {
        return procedureType;
    }

    /**
     * 
     * @param procedureType
     *     The procedureType
     */
    @JsonProperty("procedureType")
    public void setProcedureType(String procedureType) {
        this.procedureType = procedureType;
    }

    /**
     * 
     * @return
     *     The procedureState
     */
    @JsonProperty("procedureState")
    public String getProcedureState() {
        return procedureState;
    }

    /**
     * 
     * @param procedureState
     *     The procedureState
     */
    @JsonProperty("procedureState")
    public void setProcedureState(String procedureState) {
        this.procedureState = procedureState;
    }

    /**
     * 
     * @return
     *     The mo
     */
    @JsonProperty("mo")
    public String getMo() {
        return mo;
    }

    /**
     * 
     * @param mo
     *     The mo
     */
    @JsonProperty("mo")
    public void setMo(String mo) {
        this.mo = mo;
    }

    /**
     * 
     * @return
     *     The boStatus
     */
    @JsonProperty("boStatus")
    public String getBoStatus() {
        return boStatus;
    }

    /**
     * 
     * @param boStatus
     *     The boStatus
     */
    @JsonProperty("boStatus")
    public void setBoStatus(String boStatus) {
        this.boStatus = boStatus;
    }

    /**
     * 
     * @return
     *     The boStatusDateTime
     */
    @JsonProperty("boStatusDateTime")
    public String getBoStatusDateTime() {
        return boStatusDateTime;
    }

    /**
     * 
     * @param boStatusDateTime
     *     The boStatusDateTime
     */
    @JsonProperty("boStatusDateTime")
    public void setBoStatusDateTime(String boStatusDateTime) {
        this.boStatusDateTime = boStatusDateTime;
    }

    /**
     * 
     * @return
     *     The bo
     */
    @JsonProperty("bo")
    public String getBo() {
        return bo;
    }

    /**
     * 
     * @param bo
     *     The bo
     */
    @JsonProperty("bo")
    public void setBo(String bo) {
        this.bo = bo;
    }

    /**
     * 
     * @return
     *     The version
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 
     * @return
     *     The pkValue1
     */
    @JsonProperty("pkValue1")
    public String getPkValue1() {
        return pkValue1;
    }

    /**
     * 
     * @param pkValue1
     *     The pkValue1
     */
    @JsonProperty("pkValue1")
    public void setPkValue1(String pkValue1) {
        this.pkValue1 = pkValue1;
    }

    /**
     * 
     * @return
     *     The mobileLog
     */
    @JsonProperty("mobileLog")
    public String getMobileLog() {
        return mobileLog;
    }

    /**
     * 
     * @param mobileLog
     *     The mobileLog
     */
    @JsonProperty("mobileLog")
    public void setMobileLog(String mobileLog) {
        this.mobileLog = mobileLog;
    }

    /**
     * 
     * @return
     *     The typeDetails
     */
    @JsonProperty("typeDetails")
    public TypeDetails getTypeDetails() {
        return typeDetails;
    }

    /**
     * 
     * @param typeDetails
     *     The typeDetails
     */
    @JsonProperty("typeDetails")
    public void setTypeDetails(TypeDetails typeDetails) {
        this.typeDetails = typeDetails;
    }

    /**
     * 
     * @return
     *     The creationDateTime
     */
    @JsonProperty("creationDateTime")
    public String getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * 
     * @param creationDateTime
     *     The creationDateTime
     */
    @JsonProperty("creationDateTime")
    public void setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * 
     * @return
     *     The mobileUse
     */
    @JsonProperty("mobileUse")
    public MobileUse getMobileUse() {
        return mobileUse;
    }

    /**
     * 
     * @param mobileUse
     *     The mobileUse
     */
    @JsonProperty("mobileUse")
    public void setMobileUse(MobileUse mobileUse) {
        this.mobileUse = mobileUse;
    }

    /**
     * 
     * @return
     *     The procedureBo
     */
    @JsonProperty("procedureBo")
    public String getProcedureBo() {
        return procedureBo;
    }

    /**
     * 
     * @param procedureBo
     *     The procedureBo
     */
    @JsonProperty("procedureBo")
    public void setProcedureBo(String procedureBo) {
        this.procedureBo = procedureBo;
    }

    /**
     * 
     * @return
     *     The procedureProcessingDetails
     */
    @JsonProperty("procedureProcessingDetails")
    public ProcedureProcessingDetails getProcedureProcessingDetails() {
        return procedureProcessingDetails;
    }

    /**
     * 
     * @param procedureProcessingDetails
     *     The procedureProcessingDetails
     */
    @JsonProperty("procedureProcessingDetails")
    public void setProcedureProcessingDetails(ProcedureProcessingDetails procedureProcessingDetails) {
        this.procedureProcessingDetails = procedureProcessingDetails;
    }

    /**
     * 
     * @return
     *     The relatedEntity
     */
    @JsonProperty("relatedEntity")
    public String getRelatedEntity() {
        return relatedEntity;
    }

    /**
     * 
     * @param relatedEntity
     *     The relatedEntity
     */
    @JsonProperty("relatedEntity")
    public void setRelatedEntity(String relatedEntity) {
        this.relatedEntity = relatedEntity;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The procedureStepDetails
     */
    @JsonProperty("procedureStepDetails")
    public ProcedureStepDetails getProcedureStepDetails() {
        return procedureStepDetails;
    }

    /**
     * 
     * @param procedureStepDetails
     *     The procedureStepDetails
     */
    @JsonProperty("procedureStepDetails")
    public void setProcedureStepDetails(ProcedureStepDetails procedureStepDetails) {
        this.procedureStepDetails = procedureStepDetails;
    }

    /**
     * 
     * @return
     *     The detailedDescription
     */
    @JsonProperty("detailedDescription")
    public String getDetailedDescription() {
        return detailedDescription;
    }

    /**
     * 
     * @param detailedDescription
     *     The detailedDescription
     */
    @JsonProperty("detailedDescription")
    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription;
    }

    /**
     * 
     * @return
     *     The statusDateTime
     */
    @JsonProperty("statusDateTime")
    public String getStatusDateTime() {
        return statusDateTime;
    }

    /**
     * 
     * @param statusDateTime
     *     The statusDateTime
     */
    @JsonProperty("statusDateTime")
    public void setStatusDateTime(String statusDateTime) {
        this.statusDateTime = statusDateTime;
    }

    /**
     * 
     * @return
     *     The effectiveDate
     */
    @JsonProperty("effectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 
     * @param effectiveDate
     *     The effectiveDate
     */
    @JsonProperty("effectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * 
     * @return
     *     The expirationDate
     */
    @JsonProperty("expirationDate")
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * 
     * @param expirationDate
     *     The expirationDate
     */
    @JsonProperty("expirationDate")
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

}
