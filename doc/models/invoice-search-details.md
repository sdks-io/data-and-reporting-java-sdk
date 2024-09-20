
# Invoice Search Details

## Structure

`InvoiceSearchDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountFullName` | `String` | Optional | Account Full Name<br>Example: AT_reversal customer_FN | String getAccountFullName() | setAccountFullName(String accountFullName) |
| `AccountId` | `Integer` | Optional | Account ID<br>Example: 29484 | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number<br>Example: GB99215176 | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountShortName` | `String` | Optional | Account Short Name<br>Example: AT Earth Movers-SN | String getAccountShortName() | setAccountShortName(String accountShortName) |
| `ColCoId` | `Integer` | Optional | ColCo Id.<br>Example: 18 | Integer getColCoId() | setColCoId(Integer colCoId) |
| `ColCoOpCoId` | `String` | Optional | ColCo’s OpCo Id.<br>Example: 018 | String getColCoOpCoId() | setColCoOpCoId(String colCoOpCoId) |
| `CurrentBillingFrequency` | `String` | Optional | Current billing frequency of the account.<br>A few of the possible IDs and Description are below:<br>1    Daily (all days)<br>2    Daily (only working days)<br>3    Weekly - Monday<br>4    Weekly - Tuesday<br>5    Weekly - Wednesday<br>6    Weekly - Thursday<br>7    Weekly - Friday<br>8    Weekly - Saturday<br>9    Weekly - Sunday<br>10    Monthly - 1st<br>Example: Weekly – Wednesday | String getCurrentBillingFrequency() | setCurrentBillingFrequency(String currentBillingFrequency) |
| `CurrentBillingFrequencyId` | `Integer` | Optional | Current billing frequency id of the account.<br>A few of the possible IDs and Description are below:<br>1    Daily (all days)<br>2    Daily (only working days)<br>3    Weekly - Monday<br>4    Weekly - Tuesday<br>5    Weekly - Wednesday<br>6    Weekly - Thursday<br>7    Weekly - Friday<br>8    Weekly - Saturday<br>9    Weekly - Sunday<br>10    Monthly - 1st<br>Example: 5 | Integer getCurrentBillingFrequencyId() | setCurrentBillingFrequencyId(Integer currentBillingFrequencyId) |
| `CurrentDistributionMethod` | `String` | Optional | Current distribution method name of the account.<br>Example : Id & Description<br>1    e-mail<br>2    Fax<br>3    Courier to Customer<br>4    Courier to Client<br>5    Print<br>6    FTP<br>7    SMS | String getCurrentDistributionMethod() | setCurrentDistributionMethod(String currentDistributionMethod) |
| `CurrentDistributionMethodId` | `Integer` | Optional | Current distribution method id of the account.<br>Example : Id & Description<br>1    e-mail<br>2    Fax<br>3    Courier to Customer<br>4    Courier to Client<br>5    Print<br>6    FTP<br>7    SMS | Integer getCurrentDistributionMethodId() | setCurrentDistributionMethodId(Integer currentDistributionMethodId) |
| `CustomerCurrencyCode` | `String` | Optional | Customer currency ISO code.<br>Example: EUR | String getCustomerCurrencyCode() | setCustomerCurrencyCode(String customerCurrencyCode) |
| `CustomerCurrencySymbol` | `String` | Optional | Customer currency code.<br>Example: € | String getCustomerCurrencySymbol() | setCustomerCurrencySymbol(String customerCurrencySymbol) |
| `DelCoClientNumber` | `String` | Optional | DelCo’s client company number.<br>Example: 132 | String getDelCoClientNumber() | setDelCoClientNumber(String delCoClientNumber) |
| `DelCoId` | `Integer` | Optional | DelCo Id.<br>Example: 132 | Integer getDelCoId() | setDelCoId(Integer delCoId) |
| `DelCoOpCoId` | `String` | Optional | DelCo’s OpCo Id.<br>Example: 032 | String getDelCoOpCoId() | setDelCoOpCoId(String delCoOpCoId) |
| `DocumentType` | `String` | Optional | Document type Id description. | String getDocumentType() | setDocumentType(String documentType) |
| `DocumentTypeId` | `Integer` | Optional | Document type Id. | Integer getDocumentTypeId() | setDocumentTypeId(Integer documentTypeId) |
| `DueDate` | `String` | Optional | Due date. Format: yyyyMMdd.<br>Example: 20170115 | String getDueDate() | setDueDate(String dueDate) |
| `GrossAmountCustomerCurrency` | `Double` | Optional | Gross amount in customer currency in the document. | Double getGrossAmountCustomerCurrency() | setGrossAmountCustomerCurrency(Double grossAmountCustomerCurrency) |
| `GrossAmountTransactionCurrency` | `Double` | Optional | Gross amount in transaction currency in the document | Double getGrossAmountTransactionCurrency() | setGrossAmountTransactionCurrency(Double grossAmountTransactionCurrency) |
| `InvoiceDate` | `String` | Optional | Invoicing date. Format: yyyyMMdd<br>Example: 20170101 | String getInvoiceDate() | setInvoiceDate(String invoiceDate) |
| `InvoicedBy` | `String` | Optional | Company name. | String getInvoicedBy() | setInvoicedBy(String invoicedBy) |
| `InvoicedOnBehalfOf` | `String` | Optional | Country Name.<br>Example: Czech Republic | String getInvoicedOnBehalfOf() | setInvoicedOnBehalfOf(String invoicedOnBehalfOf) |
| `InvoiceId` | `Integer` | Optional | Invoice id.<br>Example: 1 | Integer getInvoiceId() | setInvoiceId(Integer invoiceId) |
| `InvoiceNumber` | `String` | Optional | Invoice number.<br>Example: 0123456789 | String getInvoiceNumber() | setInvoiceNumber(String invoiceNumber) |
| `IsInternational` | `Boolean` | Optional | True/False.<br>True if this is an International invoice, else false. | Boolean getIsInternational() | setIsInternational(Boolean isInternational) |
| `IsNational` | `Boolean` | Optional | True/False.<br>True if this is a National invoice, else false. | Boolean getIsNational() | setIsNational(Boolean isNational) |
| `NetAmountCustomerCurrency` | `Double` | Optional | Net amount in customer currency in the document. | Double getNetAmountCustomerCurrency() | setNetAmountCustomerCurrency(Double netAmountCustomerCurrency) |
| `NetAmountTransactionCurrency` | `Double` | Optional | Net amount in transaction currency in the document. | Double getNetAmountTransactionCurrency() | setNetAmountTransactionCurrency(Double netAmountTransactionCurrency) |
| `PayerId` | `Integer` | Optional | Payment customer id of the customer.<br>Example: 123456 | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payment customer number.<br>Example: GB000000123 | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `PaymentTerms` | `String` | Optional | A few of the possible IDs and Descriptions are below:<br>1    14 days after Invoice<br>2    15 days after Invoice<br>3    21 days after Invoice<br>4    30 days after Invoice<br>5    45 days after Invoice | String getPaymentTerms() | setPaymentTerms(String paymentTerms) |
| `PaymentTermsId` | `Integer` | Optional | Payment terms id of the payment customer.<br>A few of the possible IDs and Descriptions are below:<br>1    14 days after Invoice<br>2    15 days after Invoice<br>3    21 days after Invoice<br>4    30 days after Invoice<br>5    45 days after Invoice | Integer getPaymentTermsId() | setPaymentTermsId(Integer paymentTermsId) |
| `ReplacementInvoiceId` | `Integer` | Optional | Replaced document id.<br>Example: 2 | Integer getReplacementInvoiceId() | setReplacementInvoiceId(Integer replacementInvoiceId) |
| `ReversalInvoiceId` | `Integer` | Optional | Reversed document id.<br>Example: 3 | Integer getReversalInvoiceId() | setReversalInvoiceId(Integer reversalInvoiceId) |
| `Status` | `String` | Optional | Status of the document. Valid values –<br>•    [Empty] – For all document types except for Invoice and Statement.<br>•    Due – Invoices/Statements due for payment and is within the due date.<br>•    Paid – Fully paid Invoices/Statements.<br>Overdue – Invoices/Statements due of payment and has crossed the due date. | String getStatus() | setStatus(String status) |
| `SummaryDocumentBillingType` | `String` | Optional | Billing type description.<br>Example: Id & Description<br>-3    Guarantee History<br>-1    Initial Balance<br>0    Standard Invoice<br>1    Immediate Invoice<br>2    Guarantee<br>4    Advanced DD Invoice | String getSummaryDocumentBillingType() | setSummaryDocumentBillingType(String summaryDocumentBillingType) |
| `SummaryDocumentBillingTypeId` | `Integer` | Optional | Billing type id.<br>Example: Id & Description<br>-3    Guarantee History<br>-1    Initial Balance<br>0    Standard Invoice<br>1    Immediate Invoice<br>2    Guarantee<br>4    Advanced DD Invoice | Integer getSummaryDocumentBillingTypeId() | setSummaryDocumentBillingTypeId(Integer summaryDocumentBillingTypeId) |
| `SummaryDocumentDate` | `String` | Optional | Document generated date. Format: yyyyMMdd<br>Example: 20170101 | String getSummaryDocumentDate() | setSummaryDocumentDate(String summaryDocumentDate) |
| `SummaryDocumentDDAmount` | `Double` | Optional | DD amount. | Double getSummaryDocumentDDAmount() | setSummaryDocumentDDAmount(Double summaryDocumentDDAmount) |
| `SummaryDocumentDueDate` | `String` | Optional | Due date for document. Format: yyyyMMdd<br>Example: 20170115 | String getSummaryDocumentDueDate() | setSummaryDocumentDueDate(String summaryDocumentDueDate) |
| `SummaryDocumentId` | `Integer` | Optional | Summary document identifier<br>Example: 1 | Integer getSummaryDocumentId() | setSummaryDocumentId(Integer summaryDocumentId) |
| `SummaryDocumentIsFullyPaid` | `Boolean` | Optional | True/False<br>True if invoice amount is fully paid, else false | Boolean getSummaryDocumentIsFullyPaid() | setSummaryDocumentIsFullyPaid(Boolean summaryDocumentIsFullyPaid) |
| `SummaryDocumentNumber` | `String` | Optional | Summary document number<br>Example: ‘0/CZ0000000123456/2017’ | String getSummaryDocumentNumber() | setSummaryDocumentNumber(String summaryDocumentNumber) |
| `SummaryDocumentPaidAmount` | `Double` | Optional | Total amount paid. | Double getSummaryDocumentPaidAmount() | setSummaryDocumentPaidAmount(Double summaryDocumentPaidAmount) |
| `SummaryDocumentSoAReferenceNumber` | `String` | Optional | Statement of Account reference number of the payment customer. | String getSummaryDocumentSoAReferenceNumber() | setSummaryDocumentSoAReferenceNumber(String summaryDocumentSoAReferenceNumber) |
| `SummaryDocumentStatementOfAccountId` | `Integer` | Optional | Statement of Account Id of the payment customer. | Integer getSummaryDocumentStatementOfAccountId() | setSummaryDocumentStatementOfAccountId(Integer summaryDocumentStatementOfAccountId) |
| `TransactionCurrencyCode` | `String` | Optional | Transaction currency ISO code.<br>Example: EUR | String getTransactionCurrencyCode() | setTransactionCurrencyCode(String transactionCurrencyCode) |
| `TransactionCurrencySymbol` | `String` | Optional | Transaction currency symbol.<br>Example: € | String getTransactionCurrencySymbol() | setTransactionCurrencySymbol(String transactionCurrencySymbol) |
| `Type` | `String` | Optional | Invoice type description.<br>A few of the possible IDs and Description are below:<br>1    Original<br>2    Reversal<br>3    Replacement<br>Example: Original | String getType() | setType(String type) |
| `TypeId` | `Integer` | Optional | Invoice type id.<br>A few of the possible IDs and Descriptions are below:<br>1    Original<br>2    Reversal<br>3    Replacement<br>Example: 1 | Integer getTypeId() | setTypeId(Integer typeId) |
| `VATAmountCustomerCurrency` | `Double` | Optional | VAT amount in customer currency in the document | Double getVATAmountCustomerCurrency() | setVATAmountCustomerCurrency(Double vATAmountCustomerCurrency) |
| `VATAmountTransactionCurrency` | `Double` | Optional | VAT amount in transaction currency in the document | Double getVATAmountTransactionCurrency() | setVATAmountTransactionCurrency(Double vATAmountTransactionCurrency) |
| `VATCountry` | `String` | Optional | Country name of the VAT country.<br>Example: France, Germany | String getVATCountry() | setVATCountry(String vATCountry) |
| `VATCountryId` | `Integer` | Optional | Country Id of the VAT country.<br>Example: 1,2 | Integer getVATCountryId() | setVATCountryId(Integer vATCountryId) |
| `VATCountryISOCode` | `String` | Optional | Country ISO code of the VAT country.<br>Example : CZ, SK, UK, etc., | String getVATCountryISOCode() | setVATCountryISOCode(String vATCountryISOCode) |
| `VATCountryOpCoId` | `String` | Optional | VAT country’s OpCo Id.<br>Example: 032 | String getVATCountryOpCoId() | setVATCountryOpCoId(String vATCountryOpCoId) |
| `DocumentReference` | `String` | Optional | document reference number of the Invoice file | String getDocumentReference() | setDocumentReference(String documentReference) |
| `AdditionalDocuments` | [`List<InvoiceSearchAdditionalDocument>`](../../doc/models/invoice-search-additional-document.md) | Optional | - | List<InvoiceSearchAdditionalDocument> getAdditionalDocuments() | setAdditionalDocuments(List<InvoiceSearchAdditionalDocument> additionalDocuments) |

## Example (as JSON)

```json
{
  "AccountFullName": "AccountFullName4",
  "AccountId": 252,
  "AccountNumber": "AccountNumber6",
  "AccountShortName": "AccountShortName8",
  "ColCoId": 144
}
```

