/*
 * ShellDataReportingAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for FuelConsumptionRequest type.
 */
public class FuelConsumptionRequest {
    private Integer colCoId;
    private Integer colCoCode;
    private Integer payerId;
    private String payerNumber;
    private List<Accounts> accounts;
    private Integer cardGroupId;
    private String cardGroupName;
    private List<FuelConsumptionCard> cards;
    private String fromDate;
    private String toDate;
    private Integer period;

    /**
     * Default constructor.
     */
    public FuelConsumptionRequest() {
    }

    /**
     * Initialization constructor.
     * @param  colCoId  Integer value for colCoId.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  payerId  Integer value for payerId.
     * @param  payerNumber  String value for payerNumber.
     * @param  accounts  List of Accounts value for accounts.
     * @param  cardGroupId  Integer value for cardGroupId.
     * @param  cardGroupName  String value for cardGroupName.
     * @param  cards  List of FuelConsumptionCard value for cards.
     * @param  fromDate  String value for fromDate.
     * @param  toDate  String value for toDate.
     * @param  period  Integer value for period.
     */
    public FuelConsumptionRequest(
            Integer colCoId,
            Integer colCoCode,
            Integer payerId,
            String payerNumber,
            List<Accounts> accounts,
            Integer cardGroupId,
            String cardGroupName,
            List<FuelConsumptionCard> cards,
            String fromDate,
            String toDate,
            Integer period) {
        this.colCoId = colCoId;
        this.colCoCode = colCoCode;
        this.payerId = payerId;
        this.payerNumber = payerNumber;
        this.accounts = accounts;
        this.cardGroupId = cardGroupId;
        this.cardGroupName = cardGroupName;
        this.cards = cards;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.period = period;
    }

    /**
     * Getter for ColCoId.
     * Collecting Company Id of the selected payer. Optional if ColCoCode is passed else Mandatory.
     * Example: 1 for Philippines 5 for UK
     * @return Returns the Integer
     */
    @JsonGetter("ColCoId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getColCoId() {
        return colCoId;
    }

    /**
     * Setter for ColCoId.
     * Collecting Company Id of the selected payer. Optional if ColCoCode is passed else Mandatory.
     * Example: 1 for Philippines 5 for UK
     * @param colCoId Value for Integer
     */
    @JsonSetter("ColCoId")
    public void setColCoId(Integer colCoId) {
        this.colCoId = colCoId;
    }

    /**
     * Getter for ColCoCode.
     * Collecting Company Code of the selected payer. Mandatory for serviced OUs such as Romania,
     * Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is
     * provided. Example: 86 for Philippines 5 for UK
     * @return Returns the Integer
     */
    @JsonGetter("ColCoCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getColCoCode() {
        return colCoCode;
    }

    /**
     * Setter for ColCoCode.
     * Collecting Company Code of the selected payer. Mandatory for serviced OUs such as Romania,
     * Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is
     * provided. Example: 86 for Philippines 5 for UK
     * @param colCoCode Value for Integer
     */
    @JsonSetter("ColCoCode")
    public void setColCoCode(Integer colCoCode) {
        this.colCoCode = colCoCode;
    }

    /**
     * Getter for PayerId.
     * Payer Id of the selected payer. Optional if PayerNumber is passed else Mandatory
     * @return Returns the Integer
     */
    @JsonGetter("PayerId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPayerId() {
        return payerId;
    }

    /**
     * Setter for PayerId.
     * Payer Id of the selected payer. Optional if PayerNumber is passed else Mandatory
     * @param payerId Value for Integer
     */
    @JsonSetter("PayerId")
    public void setPayerId(Integer payerId) {
        this.payerId = payerId;
    }

    /**
     * Getter for PayerNumber.
     * Payer Number of the selected payer. Optional if PayerId is passed else Mandatory
     * @return Returns the String
     */
    @JsonGetter("PayerNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPayerNumber() {
        return payerNumber;
    }

    /**
     * Setter for PayerNumber.
     * Payer Number of the selected payer. Optional if PayerId is passed else Mandatory
     * @param payerNumber Value for String
     */
    @JsonSetter("PayerNumber")
    public void setPayerNumber(String payerNumber) {
        this.payerNumber = payerNumber;
    }

    /**
     * Getter for Accounts.
     * @return Returns the List of Accounts
     */
    @JsonGetter("Accounts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Accounts> getAccounts() {
        return accounts;
    }

    /**
     * Setter for Accounts.
     * @param accounts Value for List of Accounts
     */
    @JsonSetter("Accounts")
    public void setAccounts(List<Accounts> accounts) {
        this.accounts = accounts;
    }

    /**
     * Getter for CardGroupId.
     * Card Group Id in GFN Optional Example: 200
     * @return Returns the Integer
     */
    @JsonGetter("CardGroupId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCardGroupId() {
        return cardGroupId;
    }

    /**
     * Setter for CardGroupId.
     * Card Group Id in GFN Optional Example: 200
     * @param cardGroupId Value for Integer
     */
    @JsonSetter("CardGroupId")
    public void setCardGroupId(Integer cardGroupId) {
        this.cardGroupId = cardGroupId;
    }

    /**
     * Getter for CardGroupName.
     * Card Group Name Optional This input is a search criterion, if given.
     * @return Returns the String
     */
    @JsonGetter("CardGroupName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardGroupName() {
        return cardGroupName;
    }

    /**
     * Setter for CardGroupName.
     * Card Group Name Optional This input is a search criterion, if given.
     * @param cardGroupName Value for String
     */
    @JsonSetter("CardGroupName")
    public void setCardGroupName(String cardGroupName) {
        this.cardGroupName = cardGroupName;
    }

    /**
     * Getter for Cards.
     * @return Returns the List of FuelConsumptionCard
     */
    @JsonGetter("Cards")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<FuelConsumptionCard> getCards() {
        return cards;
    }

    /**
     * Setter for Cards.
     * @param cards Value for List of FuelConsumptionCard
     */
    @JsonSetter("Cards")
    public void setCards(List<FuelConsumptionCard> cards) {
        this.cards = cards;
    }

    /**
     * Getter for FromDate.
     * Transactions from Date Optional – ‘Period’ will be considered when this field is not
     * provided.
     * @return Returns the String
     */
    @JsonGetter("FromDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFromDate() {
        return fromDate;
    }

    /**
     * Setter for FromDate.
     * Transactions from Date Optional – ‘Period’ will be considered when this field is not
     * provided.
     * @param fromDate Value for String
     */
    @JsonSetter("FromDate")
    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * Getter for ToDate.
     * Transactions to Date Optional Format: yyyyMMdd
     * @return Returns the String
     */
    @JsonGetter("ToDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getToDate() {
        return toDate;
    }

    /**
     * Setter for ToDate.
     * Transactions to Date Optional Format: yyyyMMdd
     * @param toDate Value for String
     */
    @JsonSetter("ToDate")
    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    /**
     * Getter for Period.
     * Transactions Period. This is ignored when FromDate is supplied on the request Allowed values
     * : 1. Last 7 Days 2. Last 30 Days 3. Last 90 Days Optional - When FromDate/ToDate and Period
     * are not provided, ‘Last 7 Days’ value is considered as default Period.
     * @return Returns the Integer
     */
    @JsonGetter("Period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPeriod() {
        return period;
    }

    /**
     * Setter for Period.
     * Transactions Period. This is ignored when FromDate is supplied on the request Allowed values
     * : 1. Last 7 Days 2. Last 30 Days 3. Last 90 Days Optional - When FromDate/ToDate and Period
     * are not provided, ‘Last 7 Days’ value is considered as default Period.
     * @param period Value for Integer
     */
    @JsonSetter("Period")
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * Converts this FuelConsumptionRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FuelConsumptionRequest [" + "colCoId=" + colCoId + ", colCoCode=" + colCoCode
                + ", payerId=" + payerId + ", payerNumber=" + payerNumber + ", accounts=" + accounts
                + ", cardGroupId=" + cardGroupId + ", cardGroupName=" + cardGroupName + ", cards="
                + cards + ", fromDate=" + fromDate + ", toDate=" + toDate + ", period=" + period
                + "]";
    }

    /**
     * Builds a new {@link FuelConsumptionRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FuelConsumptionRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .colCoId(getColCoId())
                .colCoCode(getColCoCode())
                .payerId(getPayerId())
                .payerNumber(getPayerNumber())
                .accounts(getAccounts())
                .cardGroupId(getCardGroupId())
                .cardGroupName(getCardGroupName())
                .cards(getCards())
                .fromDate(getFromDate())
                .toDate(getToDate())
                .period(getPeriod());
        return builder;
    }

    /**
     * Class to build instances of {@link FuelConsumptionRequest}.
     */
    public static class Builder {
        private Integer colCoId;
        private Integer colCoCode;
        private Integer payerId;
        private String payerNumber;
        private List<Accounts> accounts;
        private Integer cardGroupId;
        private String cardGroupName;
        private List<FuelConsumptionCard> cards;
        private String fromDate;
        private String toDate;
        private Integer period;



        /**
         * Setter for colCoId.
         * @param  colCoId  Integer value for colCoId.
         * @return Builder
         */
        public Builder colCoId(Integer colCoId) {
            this.colCoId = colCoId;
            return this;
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
         * Setter for payerId.
         * @param  payerId  Integer value for payerId.
         * @return Builder
         */
        public Builder payerId(Integer payerId) {
            this.payerId = payerId;
            return this;
        }

        /**
         * Setter for payerNumber.
         * @param  payerNumber  String value for payerNumber.
         * @return Builder
         */
        public Builder payerNumber(String payerNumber) {
            this.payerNumber = payerNumber;
            return this;
        }

        /**
         * Setter for accounts.
         * @param  accounts  List of Accounts value for accounts.
         * @return Builder
         */
        public Builder accounts(List<Accounts> accounts) {
            this.accounts = accounts;
            return this;
        }

        /**
         * Setter for cardGroupId.
         * @param  cardGroupId  Integer value for cardGroupId.
         * @return Builder
         */
        public Builder cardGroupId(Integer cardGroupId) {
            this.cardGroupId = cardGroupId;
            return this;
        }

        /**
         * Setter for cardGroupName.
         * @param  cardGroupName  String value for cardGroupName.
         * @return Builder
         */
        public Builder cardGroupName(String cardGroupName) {
            this.cardGroupName = cardGroupName;
            return this;
        }

        /**
         * Setter for cards.
         * @param  cards  List of FuelConsumptionCard value for cards.
         * @return Builder
         */
        public Builder cards(List<FuelConsumptionCard> cards) {
            this.cards = cards;
            return this;
        }

        /**
         * Setter for fromDate.
         * @param  fromDate  String value for fromDate.
         * @return Builder
         */
        public Builder fromDate(String fromDate) {
            this.fromDate = fromDate;
            return this;
        }

        /**
         * Setter for toDate.
         * @param  toDate  String value for toDate.
         * @return Builder
         */
        public Builder toDate(String toDate) {
            this.toDate = toDate;
            return this;
        }

        /**
         * Setter for period.
         * @param  period  Integer value for period.
         * @return Builder
         */
        public Builder period(Integer period) {
            this.period = period;
            return this;
        }

        /**
         * Builds a new {@link FuelConsumptionRequest} object using the set fields.
         * @return {@link FuelConsumptionRequest}
         */
        public FuelConsumptionRequest build() {
            return new FuelConsumptionRequest(colCoId, colCoCode, payerId, payerNumber, accounts,
                    cardGroupId, cardGroupName, cards, fromDate, toDate, period);
        }
    }
}
