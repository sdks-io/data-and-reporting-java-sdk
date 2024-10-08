/*
 * ShellDataReportingAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for EIDDocument type.
 */
public class EIDDocument {
    private OptionalNullable<Integer> documentId;
    private OptionalNullable<String> accountGroupId;
    private OptionalNullable<String> accountGroupName;
    private OptionalNullable<String> documentType;
    private OptionalNullable<String> documentFormat;
    private OptionalNullable<String> documentDate;
    private OptionalNullable<Integer> numberOfInvoices;
    private OptionalNullable<Integer> fileSize;
    private OptionalNullable<String> documentStatus;
    private OptionalNullable<String> documentName;

    /**
     * Default constructor.
     */
    public EIDDocument() {
    }

    /**
     * Initialization constructor.
     * @param  documentId  Integer value for documentId.
     * @param  accountGroupId  String value for accountGroupId.
     * @param  accountGroupName  String value for accountGroupName.
     * @param  documentType  String value for documentType.
     * @param  documentFormat  String value for documentFormat.
     * @param  documentDate  String value for documentDate.
     * @param  numberOfInvoices  Integer value for numberOfInvoices.
     * @param  fileSize  Integer value for fileSize.
     * @param  documentStatus  String value for documentStatus.
     * @param  documentName  String value for documentName.
     */
    public EIDDocument(
            Integer documentId,
            String accountGroupId,
            String accountGroupName,
            String documentType,
            String documentFormat,
            String documentDate,
            Integer numberOfInvoices,
            Integer fileSize,
            String documentStatus,
            String documentName) {
        this.documentId = OptionalNullable.of(documentId);
        this.accountGroupId = OptionalNullable.of(accountGroupId);
        this.accountGroupName = OptionalNullable.of(accountGroupName);
        this.documentType = OptionalNullable.of(documentType);
        this.documentFormat = OptionalNullable.of(documentFormat);
        this.documentDate = OptionalNullable.of(documentDate);
        this.numberOfInvoices = OptionalNullable.of(numberOfInvoices);
        this.fileSize = OptionalNullable.of(fileSize);
        this.documentStatus = OptionalNullable.of(documentStatus);
        this.documentName = OptionalNullable.of(documentName);
    }

    /**
     * Initialization constructor.
     * @param  documentId  Integer value for documentId.
     * @param  accountGroupId  String value for accountGroupId.
     * @param  accountGroupName  String value for accountGroupName.
     * @param  documentType  String value for documentType.
     * @param  documentFormat  String value for documentFormat.
     * @param  documentDate  String value for documentDate.
     * @param  numberOfInvoices  Integer value for numberOfInvoices.
     * @param  fileSize  Integer value for fileSize.
     * @param  documentStatus  String value for documentStatus.
     * @param  documentName  String value for documentName.
     */

    protected EIDDocument(OptionalNullable<Integer> documentId,
            OptionalNullable<String> accountGroupId, OptionalNullable<String> accountGroupName,
            OptionalNullable<String> documentType, OptionalNullable<String> documentFormat,
            OptionalNullable<String> documentDate, OptionalNullable<Integer> numberOfInvoices,
            OptionalNullable<Integer> fileSize, OptionalNullable<String> documentStatus,
            OptionalNullable<String> documentName) {
        this.documentId = documentId;
        this.accountGroupId = accountGroupId;
        this.accountGroupName = accountGroupName;
        this.documentType = documentType;
        this.documentFormat = documentFormat;
        this.documentDate = documentDate;
        this.numberOfInvoices = numberOfInvoices;
        this.fileSize = fileSize;
        this.documentStatus = documentStatus;
        this.documentName = documentName;
    }

    /**
     * Internal Getter for DocumentId.
     * Technical identifier for the EID file. Should not be stored in database as it is not
     * guaranteed to stay unchanged over time.
     * @return Returns the Internal Integer
     */
    @JsonGetter("DocumentId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetDocumentId() {
        return this.documentId;
    }

    /**
     * Getter for DocumentId.
     * Technical identifier for the EID file. Should not be stored in database as it is not
     * guaranteed to stay unchanged over time.
     * @return Returns the Integer
     */
    public Integer getDocumentId() {
        return OptionalNullable.getFrom(documentId);
    }

    /**
     * Setter for DocumentId.
     * Technical identifier for the EID file. Should not be stored in database as it is not
     * guaranteed to stay unchanged over time.
     * @param documentId Value for Integer
     */
    @JsonSetter("DocumentId")
    public void setDocumentId(Integer documentId) {
        this.documentId = OptionalNullable.of(documentId);
    }

    /**
     * UnSetter for DocumentId.
     * Technical identifier for the EID file. Should not be stored in database as it is not
     * guaranteed to stay unchanged over time.
     */
    public void unsetDocumentId() {
        documentId = null;
    }

    /**
     * Internal Getter for AccountGroupId.
     * Account Group Id
     * @return Returns the Internal String
     */
    @JsonGetter("AccountGroupId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAccountGroupId() {
        return this.accountGroupId;
    }

    /**
     * Getter for AccountGroupId.
     * Account Group Id
     * @return Returns the String
     */
    public String getAccountGroupId() {
        return OptionalNullable.getFrom(accountGroupId);
    }

    /**
     * Setter for AccountGroupId.
     * Account Group Id
     * @param accountGroupId Value for String
     */
    @JsonSetter("AccountGroupId")
    public void setAccountGroupId(String accountGroupId) {
        this.accountGroupId = OptionalNullable.of(accountGroupId);
    }

    /**
     * UnSetter for AccountGroupId.
     * Account Group Id
     */
    public void unsetAccountGroupId() {
        accountGroupId = null;
    }

    /**
     * Internal Getter for AccountGroupName.
     * Account group name
     * @return Returns the Internal String
     */
    @JsonGetter("AccountGroupName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAccountGroupName() {
        return this.accountGroupName;
    }

    /**
     * Getter for AccountGroupName.
     * Account group name
     * @return Returns the String
     */
    public String getAccountGroupName() {
        return OptionalNullable.getFrom(accountGroupName);
    }

    /**
     * Setter for AccountGroupName.
     * Account group name
     * @param accountGroupName Value for String
     */
    @JsonSetter("AccountGroupName")
    public void setAccountGroupName(String accountGroupName) {
        this.accountGroupName = OptionalNullable.of(accountGroupName);
    }

    /**
     * UnSetter for AccountGroupName.
     * Account group name
     */
    public void unsetAccountGroupName() {
        accountGroupName = null;
    }

    /**
     * Internal Getter for DocumentType.
     * Document type. Possible values: • NAT (National) • INT (International)
     * @return Returns the Internal String
     */
    @JsonGetter("DocumentType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDocumentType() {
        return this.documentType;
    }

    /**
     * Getter for DocumentType.
     * Document type. Possible values: • NAT (National) • INT (International)
     * @return Returns the String
     */
    public String getDocumentType() {
        return OptionalNullable.getFrom(documentType);
    }

    /**
     * Setter for DocumentType.
     * Document type. Possible values: • NAT (National) • INT (International)
     * @param documentType Value for String
     */
    @JsonSetter("DocumentType")
    public void setDocumentType(String documentType) {
        this.documentType = OptionalNullable.of(documentType);
    }

    /**
     * UnSetter for DocumentType.
     * Document type. Possible values: • NAT (National) • INT (International)
     */
    public void unsetDocumentType() {
        documentType = null;
    }

    /**
     * Internal Getter for DocumentFormat.
     * Document format (CHORUS, DIFI etc.)
     * @return Returns the Internal String
     */
    @JsonGetter("DocumentFormat")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDocumentFormat() {
        return this.documentFormat;
    }

    /**
     * Getter for DocumentFormat.
     * Document format (CHORUS, DIFI etc.)
     * @return Returns the String
     */
    public String getDocumentFormat() {
        return OptionalNullable.getFrom(documentFormat);
    }

    /**
     * Setter for DocumentFormat.
     * Document format (CHORUS, DIFI etc.)
     * @param documentFormat Value for String
     */
    @JsonSetter("DocumentFormat")
    public void setDocumentFormat(String documentFormat) {
        this.documentFormat = OptionalNullable.of(documentFormat);
    }

    /**
     * UnSetter for DocumentFormat.
     * Document format (CHORUS, DIFI etc.)
     */
    public void unsetDocumentFormat() {
        documentFormat = null;
    }

    /**
     * Internal Getter for DocumentDate.
     * Document date. Example: 20170101
     * @return Returns the Internal String
     */
    @JsonGetter("DocumentDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDocumentDate() {
        return this.documentDate;
    }

    /**
     * Getter for DocumentDate.
     * Document date. Example: 20170101
     * @return Returns the String
     */
    public String getDocumentDate() {
        return OptionalNullable.getFrom(documentDate);
    }

    /**
     * Setter for DocumentDate.
     * Document date. Example: 20170101
     * @param documentDate Value for String
     */
    @JsonSetter("DocumentDate")
    public void setDocumentDate(String documentDate) {
        this.documentDate = OptionalNullable.of(documentDate);
    }

    /**
     * UnSetter for DocumentDate.
     * Document date. Example: 20170101
     */
    public void unsetDocumentDate() {
        documentDate = null;
    }

    /**
     * Internal Getter for NumberOfInvoices.
     * Number of invoices
     * @return Returns the Internal Integer
     */
    @JsonGetter("NumberOfInvoices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetNumberOfInvoices() {
        return this.numberOfInvoices;
    }

    /**
     * Getter for NumberOfInvoices.
     * Number of invoices
     * @return Returns the Integer
     */
    public Integer getNumberOfInvoices() {
        return OptionalNullable.getFrom(numberOfInvoices);
    }

    /**
     * Setter for NumberOfInvoices.
     * Number of invoices
     * @param numberOfInvoices Value for Integer
     */
    @JsonSetter("NumberOfInvoices")
    public void setNumberOfInvoices(Integer numberOfInvoices) {
        this.numberOfInvoices = OptionalNullable.of(numberOfInvoices);
    }

    /**
     * UnSetter for NumberOfInvoices.
     * Number of invoices
     */
    public void unsetNumberOfInvoices() {
        numberOfInvoices = null;
    }

    /**
     * Internal Getter for FileSize.
     * Document size
     * @return Returns the Internal Integer
     */
    @JsonGetter("FileSize")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetFileSize() {
        return this.fileSize;
    }

    /**
     * Getter for FileSize.
     * Document size
     * @return Returns the Integer
     */
    public Integer getFileSize() {
        return OptionalNullable.getFrom(fileSize);
    }

    /**
     * Setter for FileSize.
     * Document size
     * @param fileSize Value for Integer
     */
    @JsonSetter("FileSize")
    public void setFileSize(Integer fileSize) {
        this.fileSize = OptionalNullable.of(fileSize);
    }

    /**
     * UnSetter for FileSize.
     * Document size
     */
    public void unsetFileSize() {
        fileSize = null;
    }

    /**
     * Internal Getter for DocumentStatus.
     * Document status. Possible values: • NEW • VIEWED • DOWNLOADED • RESTORED
     * @return Returns the Internal String
     */
    @JsonGetter("DocumentStatus")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDocumentStatus() {
        return this.documentStatus;
    }

    /**
     * Getter for DocumentStatus.
     * Document status. Possible values: • NEW • VIEWED • DOWNLOADED • RESTORED
     * @return Returns the String
     */
    public String getDocumentStatus() {
        return OptionalNullable.getFrom(documentStatus);
    }

    /**
     * Setter for DocumentStatus.
     * Document status. Possible values: • NEW • VIEWED • DOWNLOADED • RESTORED
     * @param documentStatus Value for String
     */
    @JsonSetter("DocumentStatus")
    public void setDocumentStatus(String documentStatus) {
        this.documentStatus = OptionalNullable.of(documentStatus);
    }

    /**
     * UnSetter for DocumentStatus.
     * Document status. Possible values: • NEW • VIEWED • DOWNLOADED • RESTORED
     */
    public void unsetDocumentStatus() {
        documentStatus = null;
    }

    /**
     * Internal Getter for DocumentName.
     * Document file name.
     * @return Returns the Internal String
     */
    @JsonGetter("DocumentName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDocumentName() {
        return this.documentName;
    }

    /**
     * Getter for DocumentName.
     * Document file name.
     * @return Returns the String
     */
    public String getDocumentName() {
        return OptionalNullable.getFrom(documentName);
    }

    /**
     * Setter for DocumentName.
     * Document file name.
     * @param documentName Value for String
     */
    @JsonSetter("DocumentName")
    public void setDocumentName(String documentName) {
        this.documentName = OptionalNullable.of(documentName);
    }

    /**
     * UnSetter for DocumentName.
     * Document file name.
     */
    public void unsetDocumentName() {
        documentName = null;
    }

    /**
     * Converts this EIDDocument into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EIDDocument [" + "documentId=" + documentId + ", accountGroupId=" + accountGroupId
                + ", accountGroupName=" + accountGroupName + ", documentType=" + documentType
                + ", documentFormat=" + documentFormat + ", documentDate=" + documentDate
                + ", numberOfInvoices=" + numberOfInvoices + ", fileSize=" + fileSize
                + ", documentStatus=" + documentStatus + ", documentName=" + documentName + "]";
    }

    /**
     * Builds a new {@link EIDDocument.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EIDDocument.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.documentId = internalGetDocumentId();
        builder.accountGroupId = internalGetAccountGroupId();
        builder.accountGroupName = internalGetAccountGroupName();
        builder.documentType = internalGetDocumentType();
        builder.documentFormat = internalGetDocumentFormat();
        builder.documentDate = internalGetDocumentDate();
        builder.numberOfInvoices = internalGetNumberOfInvoices();
        builder.fileSize = internalGetFileSize();
        builder.documentStatus = internalGetDocumentStatus();
        builder.documentName = internalGetDocumentName();
        return builder;
    }

    /**
     * Class to build instances of {@link EIDDocument}.
     */
    public static class Builder {
        private OptionalNullable<Integer> documentId;
        private OptionalNullable<String> accountGroupId;
        private OptionalNullable<String> accountGroupName;
        private OptionalNullable<String> documentType;
        private OptionalNullable<String> documentFormat;
        private OptionalNullable<String> documentDate;
        private OptionalNullable<Integer> numberOfInvoices;
        private OptionalNullable<Integer> fileSize;
        private OptionalNullable<String> documentStatus;
        private OptionalNullable<String> documentName;



        /**
         * Setter for documentId.
         * @param  documentId  Integer value for documentId.
         * @return Builder
         */
        public Builder documentId(Integer documentId) {
            this.documentId = OptionalNullable.of(documentId);
            return this;
        }

        /**
         * UnSetter for documentId.
         * @return Builder
         */
        public Builder unsetDocumentId() {
            documentId = null;
            return this;
        }

        /**
         * Setter for accountGroupId.
         * @param  accountGroupId  String value for accountGroupId.
         * @return Builder
         */
        public Builder accountGroupId(String accountGroupId) {
            this.accountGroupId = OptionalNullable.of(accountGroupId);
            return this;
        }

        /**
         * UnSetter for accountGroupId.
         * @return Builder
         */
        public Builder unsetAccountGroupId() {
            accountGroupId = null;
            return this;
        }

        /**
         * Setter for accountGroupName.
         * @param  accountGroupName  String value for accountGroupName.
         * @return Builder
         */
        public Builder accountGroupName(String accountGroupName) {
            this.accountGroupName = OptionalNullable.of(accountGroupName);
            return this;
        }

        /**
         * UnSetter for accountGroupName.
         * @return Builder
         */
        public Builder unsetAccountGroupName() {
            accountGroupName = null;
            return this;
        }

        /**
         * Setter for documentType.
         * @param  documentType  String value for documentType.
         * @return Builder
         */
        public Builder documentType(String documentType) {
            this.documentType = OptionalNullable.of(documentType);
            return this;
        }

        /**
         * UnSetter for documentType.
         * @return Builder
         */
        public Builder unsetDocumentType() {
            documentType = null;
            return this;
        }

        /**
         * Setter for documentFormat.
         * @param  documentFormat  String value for documentFormat.
         * @return Builder
         */
        public Builder documentFormat(String documentFormat) {
            this.documentFormat = OptionalNullable.of(documentFormat);
            return this;
        }

        /**
         * UnSetter for documentFormat.
         * @return Builder
         */
        public Builder unsetDocumentFormat() {
            documentFormat = null;
            return this;
        }

        /**
         * Setter for documentDate.
         * @param  documentDate  String value for documentDate.
         * @return Builder
         */
        public Builder documentDate(String documentDate) {
            this.documentDate = OptionalNullable.of(documentDate);
            return this;
        }

        /**
         * UnSetter for documentDate.
         * @return Builder
         */
        public Builder unsetDocumentDate() {
            documentDate = null;
            return this;
        }

        /**
         * Setter for numberOfInvoices.
         * @param  numberOfInvoices  Integer value for numberOfInvoices.
         * @return Builder
         */
        public Builder numberOfInvoices(Integer numberOfInvoices) {
            this.numberOfInvoices = OptionalNullable.of(numberOfInvoices);
            return this;
        }

        /**
         * UnSetter for numberOfInvoices.
         * @return Builder
         */
        public Builder unsetNumberOfInvoices() {
            numberOfInvoices = null;
            return this;
        }

        /**
         * Setter for fileSize.
         * @param  fileSize  Integer value for fileSize.
         * @return Builder
         */
        public Builder fileSize(Integer fileSize) {
            this.fileSize = OptionalNullable.of(fileSize);
            return this;
        }

        /**
         * UnSetter for fileSize.
         * @return Builder
         */
        public Builder unsetFileSize() {
            fileSize = null;
            return this;
        }

        /**
         * Setter for documentStatus.
         * @param  documentStatus  String value for documentStatus.
         * @return Builder
         */
        public Builder documentStatus(String documentStatus) {
            this.documentStatus = OptionalNullable.of(documentStatus);
            return this;
        }

        /**
         * UnSetter for documentStatus.
         * @return Builder
         */
        public Builder unsetDocumentStatus() {
            documentStatus = null;
            return this;
        }

        /**
         * Setter for documentName.
         * @param  documentName  String value for documentName.
         * @return Builder
         */
        public Builder documentName(String documentName) {
            this.documentName = OptionalNullable.of(documentName);
            return this;
        }

        /**
         * UnSetter for documentName.
         * @return Builder
         */
        public Builder unsetDocumentName() {
            documentName = null;
            return this;
        }

        /**
         * Builds a new {@link EIDDocument} object using the set fields.
         * @return {@link EIDDocument}
         */
        public EIDDocument build() {
            return new EIDDocument(documentId, accountGroupId, accountGroupName, documentType,
                    documentFormat, documentDate, numberOfInvoices, fileSize, documentStatus,
                    documentName);
        }
    }
}
