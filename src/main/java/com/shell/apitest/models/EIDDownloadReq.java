/*
 * ShellDataReportingAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for EIDDownloadReq type.
 */
public class EIDDownloadReq {
    private Integer colCoCode;
    private List<String> eIDList;
    private Integer accountGroupCountry;
    private List<String> accountGroupIdList;

    /**
     * Default constructor.
     */
    public EIDDownloadReq() {
    }

    /**
     * Initialization constructor.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  eIDList  List of String value for eIDList.
     * @param  accountGroupCountry  Integer value for accountGroupCountry.
     * @param  accountGroupIdList  List of String value for accountGroupIdList.
     */
    public EIDDownloadReq(
            Integer colCoCode,
            List<String> eIDList,
            Integer accountGroupCountry,
            List<String> accountGroupIdList) {
        this.colCoCode = colCoCode;
        this.eIDList = eIDList;
        this.accountGroupCountry = accountGroupCountry;
        this.accountGroupIdList = accountGroupIdList;
    }

    /**
     * Getter for ColCoCode.
     * Collecting Company Code of the selected payer. Mandatory
     * @return Returns the Integer
     */
    @JsonGetter("ColCoCode")
    public Integer getColCoCode() {
        return colCoCode;
    }

    /**
     * Setter for ColCoCode.
     * Collecting Company Code of the selected payer. Mandatory
     * @param colCoCode Value for Integer
     */
    @JsonSetter("ColCoCode")
    public void setColCoCode(Integer colCoCode) {
        this.colCoCode = colCoCode;
    }

    /**
     * Getter for EIDList.
     * @return Returns the List of String
     */
    @JsonGetter("EIDList")
    public List<String> getEIDList() {
        return eIDList;
    }

    /**
     * Setter for EIDList.
     * @param eIDList Value for List of String
     */
    @JsonSetter("EIDList")
    public void setEIDList(List<String> eIDList) {
        this.eIDList = eIDList;
    }

    /**
     * Getter for AccountGroupCountry.
     * ColCo code associated with the Account Group IDs of the given EID/EDI files. Mandatory
     * @return Returns the Integer
     */
    @JsonGetter("AccountGroupCountry")
    public Integer getAccountGroupCountry() {
        return accountGroupCountry;
    }

    /**
     * Setter for AccountGroupCountry.
     * ColCo code associated with the Account Group IDs of the given EID/EDI files. Mandatory
     * @param accountGroupCountry Value for Integer
     */
    @JsonSetter("AccountGroupCountry")
    public void setAccountGroupCountry(Integer accountGroupCountry) {
        this.accountGroupCountry = accountGroupCountry;
    }

    /**
     * Getter for AccountGroupIdList.
     * @return Returns the List of String
     */
    @JsonGetter("AccountGroupIdList")
    public List<String> getAccountGroupIdList() {
        return accountGroupIdList;
    }

    /**
     * Setter for AccountGroupIdList.
     * @param accountGroupIdList Value for List of String
     */
    @JsonSetter("AccountGroupIdList")
    public void setAccountGroupIdList(List<String> accountGroupIdList) {
        this.accountGroupIdList = accountGroupIdList;
    }

    /**
     * Converts this EIDDownloadReq into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EIDDownloadReq [" + "colCoCode=" + colCoCode + ", eIDList=" + eIDList
                + ", accountGroupCountry=" + accountGroupCountry + ", accountGroupIdList="
                + accountGroupIdList + "]";
    }

    /**
     * Builds a new {@link EIDDownloadReq.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EIDDownloadReq.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(colCoCode, eIDList, accountGroupCountry, accountGroupIdList);
        return builder;
    }

    /**
     * Class to build instances of {@link EIDDownloadReq}.
     */
    public static class Builder {
        private Integer colCoCode;
        private List<String> eIDList;
        private Integer accountGroupCountry;
        private List<String> accountGroupIdList;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  colCoCode  Integer value for colCoCode.
         * @param  eIDList  List of String value for eIDList.
         * @param  accountGroupCountry  Integer value for accountGroupCountry.
         * @param  accountGroupIdList  List of String value for accountGroupIdList.
         */
        public Builder(Integer colCoCode, List<String> eIDList, Integer accountGroupCountry,
                List<String> accountGroupIdList) {
            this.colCoCode = colCoCode;
            this.eIDList = eIDList;
            this.accountGroupCountry = accountGroupCountry;
            this.accountGroupIdList = accountGroupIdList;
        }

        /**
         * Setter for colCoCode.
         * @param  colCoCode  Integer value for colCoCode.
         * @return Builder
         */
        public Builder colCoCode(Integer colCoCode) {
            this.colCoCode = colCoCode;
            return this;
        }

        /**
         * Setter for eIDList.
         * @param  eIDList  List of String value for eIDList.
         * @return Builder
         */
        public Builder eIDList(List<String> eIDList) {
            this.eIDList = eIDList;
            return this;
        }

        /**
         * Setter for accountGroupCountry.
         * @param  accountGroupCountry  Integer value for accountGroupCountry.
         * @return Builder
         */
        public Builder accountGroupCountry(Integer accountGroupCountry) {
            this.accountGroupCountry = accountGroupCountry;
            return this;
        }

        /**
         * Setter for accountGroupIdList.
         * @param  accountGroupIdList  List of String value for accountGroupIdList.
         * @return Builder
         */
        public Builder accountGroupIdList(List<String> accountGroupIdList) {
            this.accountGroupIdList = accountGroupIdList;
            return this;
        }

        /**
         * Builds a new {@link EIDDownloadReq} object using the set fields.
         * @return {@link EIDDownloadReq}
         */
        public EIDDownloadReq build() {
            return new EIDDownloadReq(colCoCode, eIDList, accountGroupCountry, accountGroupIdList);
        }
    }
}
