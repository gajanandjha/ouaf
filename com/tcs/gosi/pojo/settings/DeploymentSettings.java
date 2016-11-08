
package com.tcs.gosi.pojo.settings;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "capabilityList",
    "initJavaScriptFunction",
    "currencyCode",
    "decimalSeparator",
    "logFileCount",
    "numberFormat",
    "baseTimezoneOffset",
    "mdtdataEncryptionKey",
    "gpslogInterval",
    "gpssyncInterval",
    "maxASyncRecords",
    "mdtencryptionKey",
    "logArchiveDays",
    "ipupdateInterval",
    "initialServiceScript",
    "numberGroupSeparator",
    "syncRSITimeout",
    "mdtdataEncryptionFlg",
    "mdtbeepDuration",
    "attachmentStorageSize",
    "mdtcapabilities",
    "moneyDecimalDigits",
    "dateDisplayFormat",
    "userTimeZoneId",
    "gpssupported",
    "asyncInterval",
    "displayOption",
    "mdtsessionID",
    "logFileSize",
    "gpsportNO",
    "moneyFormat",
    "mdtlogLevel",
    "mdtminPortNo",
    "mdtmaxPortNo",
    "mdtbeepPause",
    "timeFormat"
})
public class DeploymentSettings {

    @JsonProperty("capabilityList")
    private Object capabilityList;
    @JsonProperty("initJavaScriptFunction")
    private String initJavaScriptFunction;
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("decimalSeparator")
    private String decimalSeparator;
    @JsonProperty("logFileCount")
    private String logFileCount;
    @JsonProperty("numberFormat")
    private String numberFormat;
    @JsonProperty("baseTimezoneOffset")
    private String baseTimezoneOffset;
    @JsonProperty("mdtdataEncryptionKey")
    private String mdtdataEncryptionKey;
    @JsonProperty("gpslogInterval")
    private String gpslogInterval;
    @JsonProperty("gpssyncInterval")
    private String gpssyncInterval;
    @JsonProperty("maxASyncRecords")
    private String maxASyncRecords;
    @JsonProperty("mdtencryptionKey")
    private String mdtencryptionKey;
    @JsonProperty("logArchiveDays")
    private String logArchiveDays;
    @JsonProperty("ipupdateInterval")
    private String ipupdateInterval;
    @JsonProperty("initialServiceScript")
    private String initialServiceScript;
    @JsonProperty("numberGroupSeparator")
    private String numberGroupSeparator;
    @JsonProperty("syncRSITimeout")
    private String syncRSITimeout;
    @JsonProperty("mdtdataEncryptionFlg")
    private String mdtdataEncryptionFlg;
    @JsonProperty("mdtbeepDuration")
    private String mdtbeepDuration;
    @JsonProperty("attachmentStorageSize")
    private Object attachmentStorageSize;
    @JsonProperty("mdtcapabilities")
    private String mdtcapabilities;
    @JsonProperty("moneyDecimalDigits")
    private String moneyDecimalDigits;
    @JsonProperty("dateDisplayFormat")
    private String dateDisplayFormat;
    @JsonProperty("userTimeZoneId")
    private String userTimeZoneId;
    @JsonProperty("gpssupported")
    private String gpssupported;
    @JsonProperty("asyncInterval")
    private String asyncInterval;
    @JsonProperty("displayOption")
    private String displayOption;
    @JsonProperty("mdtsessionID")
    private String mdtsessionID;
    @JsonProperty("logFileSize")
    private String logFileSize;
    @JsonProperty("gpsportNO")
    private String gpsportNO;
    @JsonProperty("moneyFormat")
    private String moneyFormat;
    @JsonProperty("mdtlogLevel")
    private String mdtlogLevel;
    @JsonProperty("mdtminPortNo")
    private String mdtminPortNo;
    @JsonProperty("mdtmaxPortNo")
    private String mdtmaxPortNo;
    @JsonProperty("mdtbeepPause")
    private String mdtbeepPause;
    @JsonProperty("timeFormat")
    private String timeFormat;
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The capabilityList
     */
    @JsonProperty("capabilityList")
    public Object getCapabilityList() {
        return capabilityList;
    }

    /**
     * 
     * @param capabilityList
     *     The capabilityList
     */
    @JsonProperty("capabilityList")
    public void setCapabilityList(Object capabilityList) {
        this.capabilityList = capabilityList;
    }

    /**
     * 
     * @return
     *     The initJavaScriptFunction
     */
    @JsonProperty("initJavaScriptFunction")
    public String getInitJavaScriptFunction() {
        return initJavaScriptFunction;
    }

    /**
     * 
     * @param initJavaScriptFunction
     *     The initJavaScriptFunction
     */
    @JsonProperty("initJavaScriptFunction")
    public void setInitJavaScriptFunction(String initJavaScriptFunction) {
        this.initJavaScriptFunction = initJavaScriptFunction;
    }

    /**
     * 
     * @return
     *     The currencyCode
     */
    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 
     * @param currencyCode
     *     The currencyCode
     */
    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * 
     * @return
     *     The decimalSeparator
     */
    @JsonProperty("decimalSeparator")
    public String getDecimalSeparator() {
        return decimalSeparator;
    }

    /**
     * 
     * @param decimalSeparator
     *     The decimalSeparator
     */
    @JsonProperty("decimalSeparator")
    public void setDecimalSeparator(String decimalSeparator) {
        this.decimalSeparator = decimalSeparator;
    }

    /**
     * 
     * @return
     *     The logFileCount
     */
    @JsonProperty("logFileCount")
    public String getLogFileCount() {
        return logFileCount;
    }

    /**
     * 
     * @param logFileCount
     *     The logFileCount
     */
    @JsonProperty("logFileCount")
    public void setLogFileCount(String logFileCount) {
        this.logFileCount = logFileCount;
    }

    /**
     * 
     * @return
     *     The numberFormat
     */
    @JsonProperty("numberFormat")
    public String getNumberFormat() {
        return numberFormat;
    }

    /**
     * 
     * @param numberFormat
     *     The numberFormat
     */
    @JsonProperty("numberFormat")
    public void setNumberFormat(String numberFormat) {
        this.numberFormat = numberFormat;
    }

    /**
     * 
     * @return
     *     The baseTimezoneOffset
     */
    @JsonProperty("baseTimezoneOffset")
    public String getBaseTimezoneOffset() {
        return baseTimezoneOffset;
    }

    /**
     * 
     * @param baseTimezoneOffset
     *     The baseTimezoneOffset
     */
    @JsonProperty("baseTimezoneOffset")
    public void setBaseTimezoneOffset(String baseTimezoneOffset) {
        this.baseTimezoneOffset = baseTimezoneOffset;
    }

    /**
     * 
     * @return
     *     The mdtdataEncryptionKey
     */
    @JsonProperty("mdtdataEncryptionKey")
    public String getMdtdataEncryptionKey() {
        return mdtdataEncryptionKey;
    }

    /**
     * 
     * @param mdtdataEncryptionKey
     *     The mdtdataEncryptionKey
     */
    @JsonProperty("mdtdataEncryptionKey")
    public void setMdtdataEncryptionKey(String mdtdataEncryptionKey) {
        this.mdtdataEncryptionKey = mdtdataEncryptionKey;
    }

    /**
     * 
     * @return
     *     The gpslogInterval
     */
    @JsonProperty("gpslogInterval")
    public String getGpslogInterval() {
        return gpslogInterval;
    }

    /**
     * 
     * @param gpslogInterval
     *     The gpslogInterval
     */
    @JsonProperty("gpslogInterval")
    public void setGpslogInterval(String gpslogInterval) {
        this.gpslogInterval = gpslogInterval;
    }

    /**
     * 
     * @return
     *     The gpssyncInterval
     */
    @JsonProperty("gpssyncInterval")
    public String getGpssyncInterval() {
        return gpssyncInterval;
    }

    /**
     * 
     * @param gpssyncInterval
     *     The gpssyncInterval
     */
    @JsonProperty("gpssyncInterval")
    public void setGpssyncInterval(String gpssyncInterval) {
        this.gpssyncInterval = gpssyncInterval;
    }

    /**
     * 
     * @return
     *     The maxASyncRecords
     */
    @JsonProperty("maxASyncRecords")
    public String getMaxASyncRecords() {
        return maxASyncRecords;
    }

    /**
     * 
     * @param maxASyncRecords
     *     The maxASyncRecords
     */
    @JsonProperty("maxASyncRecords")
    public void setMaxASyncRecords(String maxASyncRecords) {
        this.maxASyncRecords = maxASyncRecords;
    }

    /**
     * 
     * @return
     *     The mdtencryptionKey
     */
    @JsonProperty("mdtencryptionKey")
    public String getMdtencryptionKey() {
        return mdtencryptionKey;
    }

    /**
     * 
     * @param mdtencryptionKey
     *     The mdtencryptionKey
     */
    @JsonProperty("mdtencryptionKey")
    public void setMdtencryptionKey(String mdtencryptionKey) {
        this.mdtencryptionKey = mdtencryptionKey;
    }

    /**
     * 
     * @return
     *     The logArchiveDays
     */
    @JsonProperty("logArchiveDays")
    public String getLogArchiveDays() {
        return logArchiveDays;
    }

    /**
     * 
     * @param logArchiveDays
     *     The logArchiveDays
     */
    @JsonProperty("logArchiveDays")
    public void setLogArchiveDays(String logArchiveDays) {
        this.logArchiveDays = logArchiveDays;
    }

    /**
     * 
     * @return
     *     The ipupdateInterval
     */
    @JsonProperty("ipupdateInterval")
    public String getIpupdateInterval() {
        return ipupdateInterval;
    }

    /**
     * 
     * @param ipupdateInterval
     *     The ipupdateInterval
     */
    @JsonProperty("ipupdateInterval")
    public void setIpupdateInterval(String ipupdateInterval) {
        this.ipupdateInterval = ipupdateInterval;
    }

    /**
     * 
     * @return
     *     The initialServiceScript
     */
    @JsonProperty("initialServiceScript")
    public String getInitialServiceScript() {
        return initialServiceScript;
    }

    /**
     * 
     * @param initialServiceScript
     *     The initialServiceScript
     */
    @JsonProperty("initialServiceScript")
    public void setInitialServiceScript(String initialServiceScript) {
        this.initialServiceScript = initialServiceScript;
    }

    /**
     * 
     * @return
     *     The numberGroupSeparator
     */
    @JsonProperty("numberGroupSeparator")
    public String getNumberGroupSeparator() {
        return numberGroupSeparator;
    }

    /**
     * 
     * @param numberGroupSeparator
     *     The numberGroupSeparator
     */
    @JsonProperty("numberGroupSeparator")
    public void setNumberGroupSeparator(String numberGroupSeparator) {
        this.numberGroupSeparator = numberGroupSeparator;
    }

    /**
     * 
     * @return
     *     The syncRSITimeout
     */
    @JsonProperty("syncRSITimeout")
    public String getSyncRSITimeout() {
        return syncRSITimeout;
    }

    /**
     * 
     * @param syncRSITimeout
     *     The syncRSITimeout
     */
    @JsonProperty("syncRSITimeout")
    public void setSyncRSITimeout(String syncRSITimeout) {
        this.syncRSITimeout = syncRSITimeout;
    }

    /**
     * 
     * @return
     *     The mdtdataEncryptionFlg
     */
    @JsonProperty("mdtdataEncryptionFlg")
    public String getMdtdataEncryptionFlg() {
        return mdtdataEncryptionFlg;
    }

    /**
     * 
     * @param mdtdataEncryptionFlg
     *     The mdtdataEncryptionFlg
     */
    @JsonProperty("mdtdataEncryptionFlg")
    public void setMdtdataEncryptionFlg(String mdtdataEncryptionFlg) {
        this.mdtdataEncryptionFlg = mdtdataEncryptionFlg;
    }

    /**
     * 
     * @return
     *     The mdtbeepDuration
     */
    @JsonProperty("mdtbeepDuration")
    public String getMdtbeepDuration() {
        return mdtbeepDuration;
    }

    /**
     * 
     * @param mdtbeepDuration
     *     The mdtbeepDuration
     */
    @JsonProperty("mdtbeepDuration")
    public void setMdtbeepDuration(String mdtbeepDuration) {
        this.mdtbeepDuration = mdtbeepDuration;
    }

    /**
     * 
     * @return
     *     The attachmentStorageSize
     */
    @JsonProperty("attachmentStorageSize")
    public Object getAttachmentStorageSize() {
        return attachmentStorageSize;
    }

    /**
     * 
     * @param attachmentStorageSize
     *     The attachmentStorageSize
     */
    @JsonProperty("attachmentStorageSize")
    public void setAttachmentStorageSize(Object attachmentStorageSize) {
        this.attachmentStorageSize = attachmentStorageSize;
    }

    /**
     * 
     * @return
     *     The mdtcapabilities
     */
    @JsonProperty("mdtcapabilities")
    public String getMdtcapabilities() {
        return mdtcapabilities;
    }

    /**
     * 
     * @param mdtcapabilities
     *     The mdtcapabilities
     */
    @JsonProperty("mdtcapabilities")
    public void setMdtcapabilities(String mdtcapabilities) {
        this.mdtcapabilities = mdtcapabilities;
    }

    /**
     * 
     * @return
     *     The moneyDecimalDigits
     */
    @JsonProperty("moneyDecimalDigits")
    public String getMoneyDecimalDigits() {
        return moneyDecimalDigits;
    }

    /**
     * 
     * @param moneyDecimalDigits
     *     The moneyDecimalDigits
     */
    @JsonProperty("moneyDecimalDigits")
    public void setMoneyDecimalDigits(String moneyDecimalDigits) {
        this.moneyDecimalDigits = moneyDecimalDigits;
    }

    /**
     * 
     * @return
     *     The dateDisplayFormat
     */
    @JsonProperty("dateDisplayFormat")
    public String getDateDisplayFormat() {
        return dateDisplayFormat;
    }

    /**
     * 
     * @param dateDisplayFormat
     *     The dateDisplayFormat
     */
    @JsonProperty("dateDisplayFormat")
    public void setDateDisplayFormat(String dateDisplayFormat) {
        this.dateDisplayFormat = dateDisplayFormat;
    }

    /**
     * 
     * @return
     *     The userTimeZoneId
     */
    @JsonProperty("userTimeZoneId")
    public String getUserTimeZoneId() {
        return userTimeZoneId;
    }

    /**
     * 
     * @param userTimeZoneId
     *     The userTimeZoneId
     */
    @JsonProperty("userTimeZoneId")
    public void setUserTimeZoneId(String userTimeZoneId) {
        this.userTimeZoneId = userTimeZoneId;
    }

    /**
     * 
     * @return
     *     The gpssupported
     */
    @JsonProperty("gpssupported")
    public String getGpssupported() {
        return gpssupported;
    }

    /**
     * 
     * @param gpssupported
     *     The gpssupported
     */
    @JsonProperty("gpssupported")
    public void setGpssupported(String gpssupported) {
        this.gpssupported = gpssupported;
    }

    /**
     * 
     * @return
     *     The asyncInterval
     */
    @JsonProperty("asyncInterval")
    public String getAsyncInterval() {
        return asyncInterval;
    }

    /**
     * 
     * @param asyncInterval
     *     The asyncInterval
     */
    @JsonProperty("asyncInterval")
    public void setAsyncInterval(String asyncInterval) {
        this.asyncInterval = asyncInterval;
    }

    /**
     * 
     * @return
     *     The displayOption
     */
    @JsonProperty("displayOption")
    public String getDisplayOption() {
        return displayOption;
    }

    /**
     * 
     * @param displayOption
     *     The displayOption
     */
    @JsonProperty("displayOption")
    public void setDisplayOption(String displayOption) {
        this.displayOption = displayOption;
    }

    /**
     * 
     * @return
     *     The mdtsessionID
     */
    @JsonProperty("mdtsessionID")
    public String getMdtsessionID() {
        return mdtsessionID;
    }

    /**
     * 
     * @param mdtsessionID
     *     The mdtsessionID
     */
    @JsonProperty("mdtsessionID")
    public void setMdtsessionID(String mdtsessionID) {
        this.mdtsessionID = mdtsessionID;
    }

    /**
     * 
     * @return
     *     The logFileSize
     */
    @JsonProperty("logFileSize")
    public String getLogFileSize() {
        return logFileSize;
    }

    /**
     * 
     * @param logFileSize
     *     The logFileSize
     */
    @JsonProperty("logFileSize")
    public void setLogFileSize(String logFileSize) {
        this.logFileSize = logFileSize;
    }

    /**
     * 
     * @return
     *     The gpsportNO
     */
    @JsonProperty("gpsportNO")
    public String getGpsportNO() {
        return gpsportNO;
    }

    /**
     * 
     * @param gpsportNO
     *     The gpsportNO
     */
    @JsonProperty("gpsportNO")
    public void setGpsportNO(String gpsportNO) {
        this.gpsportNO = gpsportNO;
    }

    /**
     * 
     * @return
     *     The moneyFormat
     */
    @JsonProperty("moneyFormat")
    public String getMoneyFormat() {
        return moneyFormat;
    }

    /**
     * 
     * @param moneyFormat
     *     The moneyFormat
     */
    @JsonProperty("moneyFormat")
    public void setMoneyFormat(String moneyFormat) {
        this.moneyFormat = moneyFormat;
    }

    /**
     * 
     * @return
     *     The mdtlogLevel
     */
    @JsonProperty("mdtlogLevel")
    public String getMdtlogLevel() {
        return mdtlogLevel;
    }

    /**
     * 
     * @param mdtlogLevel
     *     The mdtlogLevel
     */
    @JsonProperty("mdtlogLevel")
    public void setMdtlogLevel(String mdtlogLevel) {
        this.mdtlogLevel = mdtlogLevel;
    }

    /**
     * 
     * @return
     *     The mdtminPortNo
     */
    @JsonProperty("mdtminPortNo")
    public String getMdtminPortNo() {
        return mdtminPortNo;
    }

    /**
     * 
     * @param mdtminPortNo
     *     The mdtminPortNo
     */
    @JsonProperty("mdtminPortNo")
    public void setMdtminPortNo(String mdtminPortNo) {
        this.mdtminPortNo = mdtminPortNo;
    }

    /**
     * 
     * @return
     *     The mdtmaxPortNo
     */
    @JsonProperty("mdtmaxPortNo")
    public String getMdtmaxPortNo() {
        return mdtmaxPortNo;
    }

    /**
     * 
     * @param mdtmaxPortNo
     *     The mdtmaxPortNo
     */
    @JsonProperty("mdtmaxPortNo")
    public void setMdtmaxPortNo(String mdtmaxPortNo) {
        this.mdtmaxPortNo = mdtmaxPortNo;
    }

    /**
     * 
     * @return
     *     The mdtbeepPause
     */
    @JsonProperty("mdtbeepPause")
    public String getMdtbeepPause() {
        return mdtbeepPause;
    }

    /**
     * 
     * @param mdtbeepPause
     *     The mdtbeepPause
     */
    @JsonProperty("mdtbeepPause")
    public void setMdtbeepPause(String mdtbeepPause) {
        this.mdtbeepPause = mdtbeepPause;
    }

    /**
     * 
     * @return
     *     The timeFormat
     */
    @JsonProperty("timeFormat")
    public String getTimeFormat() {
        return timeFormat;
    }

    /**
     * 
     * @param timeFormat
     *     The timeFormat
     */
    @JsonProperty("timeFormat")
    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    protected boolean declaredProperty(String name, Object value) {
        switch (name) {
            case "capabilityList":
                if (value instanceof Object) {
                    setCapabilityList(((Object) value));
                } else {
                    throw new IllegalArgumentException(("property \"capabilityList\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                }
                return true;
            case "initJavaScriptFunction":
                if (value instanceof String) {
                    setInitJavaScriptFunction(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"initJavaScriptFunction\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "currencyCode":
                if (value instanceof String) {
                    setCurrencyCode(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"currencyCode\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "decimalSeparator":
                if (value instanceof String) {
                    setDecimalSeparator(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"decimalSeparator\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "logFileCount":
                if (value instanceof String) {
                    setLogFileCount(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"logFileCount\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "numberFormat":
                if (value instanceof String) {
                    setNumberFormat(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"numberFormat\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "baseTimezoneOffset":
                if (value instanceof String) {
                    setBaseTimezoneOffset(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"baseTimezoneOffset\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "mdtdataEncryptionKey":
                if (value instanceof String) {
                    setMdtdataEncryptionKey(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"mdtdataEncryptionKey\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "gpslogInterval":
                if (value instanceof String) {
                    setGpslogInterval(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"gpslogInterval\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "gpssyncInterval":
                if (value instanceof String) {
                    setGpssyncInterval(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"gpssyncInterval\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "maxASyncRecords":
                if (value instanceof String) {
                    setMaxASyncRecords(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"maxASyncRecords\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "mdtencryptionKey":
                if (value instanceof String) {
                    setMdtencryptionKey(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"mdtencryptionKey\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "logArchiveDays":
                if (value instanceof String) {
                    setLogArchiveDays(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"logArchiveDays\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "ipupdateInterval":
                if (value instanceof String) {
                    setIpupdateInterval(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"ipupdateInterval\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "initialServiceScript":
                if (value instanceof String) {
                    setInitialServiceScript(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"initialServiceScript\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "numberGroupSeparator":
                if (value instanceof String) {
                    setNumberGroupSeparator(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"numberGroupSeparator\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "syncRSITimeout":
                if (value instanceof String) {
                    setSyncRSITimeout(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"syncRSITimeout\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "mdtdataEncryptionFlg":
                if (value instanceof String) {
                    setMdtdataEncryptionFlg(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"mdtdataEncryptionFlg\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "mdtbeepDuration":
                if (value instanceof String) {
                    setMdtbeepDuration(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"mdtbeepDuration\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "attachmentStorageSize":
                if (value instanceof Object) {
                    setAttachmentStorageSize(((Object) value));
                } else {
                    throw new IllegalArgumentException(("property \"attachmentStorageSize\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                }
                return true;
            case "mdtcapabilities":
                if (value instanceof String) {
                    setMdtcapabilities(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"mdtcapabilities\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "moneyDecimalDigits":
                if (value instanceof String) {
                    setMoneyDecimalDigits(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"moneyDecimalDigits\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "dateDisplayFormat":
                if (value instanceof String) {
                    setDateDisplayFormat(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"dateDisplayFormat\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "userTimeZoneId":
                if (value instanceof String) {
                    setUserTimeZoneId(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"userTimeZoneId\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "gpssupported":
                if (value instanceof String) {
                    setGpssupported(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"gpssupported\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "asyncInterval":
                if (value instanceof String) {
                    setAsyncInterval(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"asyncInterval\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "displayOption":
                if (value instanceof String) {
                    setDisplayOption(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"displayOption\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "mdtsessionID":
                if (value instanceof String) {
                    setMdtsessionID(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"mdtsessionID\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "logFileSize":
                if (value instanceof String) {
                    setLogFileSize(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"logFileSize\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "gpsportNO":
                if (value instanceof String) {
                    setGpsportNO(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"gpsportNO\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "moneyFormat":
                if (value instanceof String) {
                    setMoneyFormat(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"moneyFormat\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "mdtlogLevel":
                if (value instanceof String) {
                    setMdtlogLevel(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"mdtlogLevel\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "mdtminPortNo":
                if (value instanceof String) {
                    setMdtminPortNo(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"mdtminPortNo\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "mdtmaxPortNo":
                if (value instanceof String) {
                    setMdtmaxPortNo(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"mdtmaxPortNo\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "mdtbeepPause":
                if (value instanceof String) {
                    setMdtbeepPause(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"mdtbeepPause\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            case "timeFormat":
                if (value instanceof String) {
                    setTimeFormat(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"timeFormat\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            default:
                return false;
        }
    }

    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        switch (name) {
            case "capabilityList":
                return getCapabilityList();
            case "initJavaScriptFunction":
                return getInitJavaScriptFunction();
            case "currencyCode":
                return getCurrencyCode();
            case "decimalSeparator":
                return getDecimalSeparator();
            case "logFileCount":
                return getLogFileCount();
            case "numberFormat":
                return getNumberFormat();
            case "baseTimezoneOffset":
                return getBaseTimezoneOffset();
            case "mdtdataEncryptionKey":
                return getMdtdataEncryptionKey();
            case "gpslogInterval":
                return getGpslogInterval();
            case "gpssyncInterval":
                return getGpssyncInterval();
            case "maxASyncRecords":
                return getMaxASyncRecords();
            case "mdtencryptionKey":
                return getMdtencryptionKey();
            case "logArchiveDays":
                return getLogArchiveDays();
            case "ipupdateInterval":
                return getIpupdateInterval();
            case "initialServiceScript":
                return getInitialServiceScript();
            case "numberGroupSeparator":
                return getNumberGroupSeparator();
            case "syncRSITimeout":
                return getSyncRSITimeout();
            case "mdtdataEncryptionFlg":
                return getMdtdataEncryptionFlg();
            case "mdtbeepDuration":
                return getMdtbeepDuration();
            case "attachmentStorageSize":
                return getAttachmentStorageSize();
            case "mdtcapabilities":
                return getMdtcapabilities();
            case "moneyDecimalDigits":
                return getMoneyDecimalDigits();
            case "dateDisplayFormat":
                return getDateDisplayFormat();
            case "userTimeZoneId":
                return getUserTimeZoneId();
            case "gpssupported":
                return getGpssupported();
            case "asyncInterval":
                return getAsyncInterval();
            case "displayOption":
                return getDisplayOption();
            case "mdtsessionID":
                return getMdtsessionID();
            case "logFileSize":
                return getLogFileSize();
            case "gpsportNO":
                return getGpsportNO();
            case "moneyFormat":
                return getMoneyFormat();
            case "mdtlogLevel":
                return getMdtlogLevel();
            case "mdtminPortNo":
                return getMdtminPortNo();
            case "mdtmaxPortNo":
                return getMdtmaxPortNo();
            case "mdtbeepPause":
                return getMdtbeepPause();
            case "timeFormat":
                return getTimeFormat();
            default:
                return notFoundValue;
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, DeploymentSettings.NOT_FOUND_VALUE);
        if (DeploymentSettings.NOT_FOUND_VALUE!= value) {
            return ((T) value);
        } else {
            throw new IllegalArgumentException((("property \""+ name)+"\" is not defined"));
        }
    }

    public void set(String name, Object value) {
        if (!declaredProperty(name, value)) {
            throw new IllegalArgumentException((("property \""+ name)+"\" is not defined"));
        }
    }

}
