/*
 * ShellDataReportingAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.shell.apitest.ApiHelper;
import com.shell.apitest.ShellDataReportingAPIsClient;
import com.shell.apitest.exceptions.ApiException;
import com.shell.apitest.models.PricedTransactionRequestV2;
import com.shell.apitest.models.PricedTransactionResponseV2;
import com.shell.apitest.models.RecentTransactionRequest;
import com.shell.apitest.models.RecentTransactionsResponse;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TransactionControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static ShellDataReportingAPIsClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static TransactionController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getTransactionController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * This endpoint allows querying last 48 hours of transaction data of Shell Card (i.e. Priced,
     * Billed, Unbilled etc. sales items). It provides a flexible search criteria and supports
     * pagination. E.g., if the request is made at 08:30 AM on 18 Aug 2022 then transactions until
     * 16 Aug 2022 08:30 AM (including) can be retrieved. #### Supported operations * Search by Date
     * and Time range (within the last 48 hours only) * Search by Payer and/or Account number *
     * Search by Card * Search by Purchased Country * Search by Transaction posting date * Search by
     * Driver Name or Vehicle registration number * Search by Fuel only transactions * Search by
     * Product and/or Product group.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRecentTransactionsNew() throws Exception {
        // Parameters for the API call
        String requestId = 
                "2b0cbe11-f109-4c43-9201-49af0370df1c";
        RecentTransactionRequest body = ApiHelper.deserialize(
                "{\"PageSize\":1,\"Page\":1,\"Filters\":{\"ColCoCode\":14,\"PayerNumber\":\"GB00001"
                + "232\",\"AccountNumber\":\"GB00001233\",\"ProductCode\":\"22\",\"PurchasedInCount"
                + "ry\":\"GB\",\"CardPAN\":\"700205******890645\",\"FromDateTime\":\"2020-11-09 13:"
                + "56:03.000\",\"ToDateTime\":\"2020-12-09 13:56:03.000\",\"TransactionStatus\":\"A"
                + "PPROVED\",\"FuelOnly\":\"False\",\"ProductGroupName\":\"Motor gasoline\",\"Vehic"
                + "leRegistrationNumber\":\"YG67OUM\",\"IncludeDeclines\":true,\"CardIssuerName\":"
                + "\"Mathew\",\"ColumnList\":\"PayerNumber,AccountNumber,ProductName,FuelVolume,PAN"
                + "\"}}",
                RecentTransactionRequest.class);

        // Set callback and perform API call
        RecentTransactionsResponse result = null;
        try {
            result = controller.recentTransactionsNew(requestId, body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"RequestId\":\"9d2dee33-7803-485a-a2b1-2c7538e597ee\",\"Status\":\"SUCCESS\",\"P"
                + "age\":1,\"RowCount\":2,\"TotalPages\":1,\"Data\":[{\"ColCoCode\":84,\"PayerNumbe"
                + "r\":\"MY00200653\",\"AccountNumber\":\"MY00200653\",\"CardIssueNumber\":\"1\","
                + "\"CollectingCompanyCurrencyCode\":\"MYR\",\"CustDataCustomerEntered\":\"PartnerI"
                + "d\",\"CustDataDriverId\":\"D123\",\"CustDataFleetDescription\":\"Fleet-Truck\","
                + "\"FleetIdInput\":\"AS2344\",\"Amount\":62.47,\"EuroshellSiteNumber\":\"1231\","
                + "\"IncomingProductCode\":\"10\",\"ProductCode\":\"23\",\"ProductName\":\"Unleaded"
                + " - Low octane\",\"SiteCode\":3350,\"HostingCollectingCompanyName\":\"Shell Malay"
                + "sia Trading Sdn Bhd\",\"HostingCollectingCompanyNumber\":\"84\",\"IccdataTranTyp"
                + "eCode\":\"1\",\"TransactionType\":\"Transaction Type description\",\"Latitude\":"
                + "\"52.143814\",\"Longitude\":\"101.72869\",\"MerchantCategory\":\"5542\",\"Mercha"
                + "ntCategoryDescription\":\"Description\",\"PurchasedInCountry\":\"MY\",\"Merchant"
                + "Id\":\"MY1737000000000\",\"SiteName\":\"ShellPT3895 BATU 4    KUALA LUMPUR MY\","
                + "\"Network\":\"458\",\"DelcoCode\":\"084\",\"OdometerInput\":\"201620\",\"Odomete"
                + "rReadingKm\":\"201620\",\"OdometerReadingMiles\":\"201620\",\"CardPAN\":\"700214"
                + "*******780061\",\"PINIndicator\":\"Y\",\"POIReceiptNumber\":\"417662\",\"Product"
                + "sCodeAdditional\":\"Additional Code\",\"ProductsTaxCode\":\"0\",\"FuelVolume\":3"
                + "4.15,\"SfgwCardDateOfExpiry\":\"2024-12\",\"SiteCurrencyISOCode\":\"MYR\",\"Card"
                + "Id\":\"330743\",\"TransactionDate\":\"2021-11-11\",\"TransactionDateTime\":\"202"
                + "1-11-11 16:32:09.000\",\"TransactionId\":\"864220307\",\"TransactionStatus\":\"A"
                + "pproved\",\"UnitOfMeasure\":\"L\",\"VehicleRegistrationNumber\":\"WD33637\",\"Ne"
                + "tworkDelcoName\":\"Shell Malaysia Trading Sdn Bhd\",\"ProductGroupName\":\"Motor"
                + " gasoline\",\"FuelProduct\":\"All Fuels\",\"AccountCustomerName\":\"WCT BERHAD"
                + "\",\"PayerName\":\"WCT BERHAD\",\"TransactionTime\":\"2021-11-11\",\"Transaction"
                + "Currency\":\"RM\",\"UnitPrice\":0.02050073206442167,\"AuthorisedFlag\":\"Y\",\"T"
                + "ransactionTimeGMT\":\"08:41:02\",\"ReasonCode\":\"10\",\"IssuerActionCode\":\"2"
                + "\",\"IssuerActionCodeDescription\":\"Approved, partial\",\"DeclinedReason\":\"pa"
                + "rtial\",\"CardStatusReasonDescription\":\"Approved, partial\",\"TransactionCount"
                + "ry\":\"458\",\"IssuingCollectingCompanyName\":\"Partner Name\",\"CardIssuerName"
                + "\":\"John\",\"DriverName\":\"PAK PAK\",\"BearerDescription\":\"Description\",\"C"
                + "ardCategoryDescription\":\"Driver Card\",\"CardTypeDescription\":\"SHELL FLEET- "
                + "HONG KONG 7002821\",\"CardTokenTypeDescription\":\"HK FLE NAT SIN R1 - CHIP\","
                + "\"EmbossType\":\"Driver\",\"EVPrintedNumber\":\"NL-TNM-C00122045-K\",\"IsRFID\":"
                + "false}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * This API allows querying transaction data (i.e. Priced, Billed and Unbilled sales items). It
     * provides a flexible search criteria and supports paging. The version 2 is an enhancement to
     * the version 1 where EV transactions and their details are added in the response. Transactions
     * that are posted but not yet priced, billed or that are in error will not be returned by this
     * API. The API also supports returning Fee Items. #### Supported operations * Get sales items
     * and fee transactions * Search by invoice status * Search by fixed date period * Search by
     * date range * Search by account * Search by card * Get sales items only * Search by
     * transaction Id or location * Search by transaction posting date * Search by invoice number or
     * date * Search by driver name or vehicle registration number * Search by card group * Search
     * by fuel only transactions * Search by product * EV transaction details - Below are EV
     * specific parameters * EVOperator * EVSerialId * EVChargePointSerial *
     * EVChargePointConnectorType * EVChargePointConnectorTypeDescription * EVChargeDuration *
     * EVChargeStartDate * EVChargeStartTime * EVChargeEndDate * EVChargeEndTime .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestPricedTransactionsV2() throws Exception {
        // Parameters for the API call
        String requestId = 
                "2b0cbe11-f109-4c43-9201-49af0370df1c";
        PricedTransactionRequestV2 body = ApiHelper.deserialize(
                "{\"PageSize\":1,\"Page\":1,\"Filters\":{\"ColCoCode\":\"032\",\"InvoiceStatus\":"
                + "\"A\",\"PayerNumber\":\"DE26685263\",\"AccountId\":29484,\"AccountNumber\":\"DE2"
                + "6667080\",\"DriverName\":\"HH NX 508\",\"CardGroupId\":40000,\"CardPAN\":\"70020"
                + "51006629890645\",\"ProductCode\":\"10\",\"ProductName\":\"Diesel AGO\",\"SiteCod"
                + "e\":\"05000100\",\"IncomingSiteNumber\":\"100021\",\"InvoiceDate\":\"2021-01-01"
                + "\",\"InvoiceNumber\":\"3201016193\",\"PurchasedInCountryCode\":\"GB\",\"Purchase"
                + "dInCountry\":\"United Kingdom\",\"SiteGroupId\":202,\"VehicleRegistrationNumber"
                + "\":\"4K46801\",\"FeeTypeId\":275549,\"LineItemDescription\":\"ABC3\",\"Cards\":["
                + "0],\"SortOrder\":\"5\",\"FromDate\":\"2022-01-01 00:00:00\",\"ToDate\":\"2022-01"
                + "-01 00:00:00\",\"Period\":3,\"PostingDateFrom\":\"2022-01-01 00:00:00\",\"Postin"
                + "gDateTo\":\"2022-01-01 00:00:00\",\"TransactionItemId\":\"1208176398\",\"FuelOnl"
                + "y\":false,\"IncludeFees\":true,\"IsMultipayer\":true,\"ValidInvoiceDateOnly\":fa"
                + "lse,\"InvoiceFromDate\":\"2022-01-01 00:00:00\",\"InvoiceToDate\":\"2022-01-01 0"
                + "0:00:00\",\"HostingCollectingCompanyNumber\":\"032\",\"Search\":\"2K89909\",\"Tr"
                + "ansactionId\":\"io9KVXk1UkW57XWKyeaHHg\"}}",
                PricedTransactionRequestV2.class);

        // Set callback and perform API call
        PricedTransactionResponseV2 result = null;
        try {
            result = controller.pricedTransactionsV2(requestId, body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"RequestId\":\"9d2dee33-7803-485a-a2b1-2c7538e597ee\",\"Status\":\"SUCCESS\",\"D"
                + "ata\":[{\"AccountName\":\"Blue Colour Ltd\",\"AccountId\":29484,\"AccountNumber"
                + "\":\"DE26667080\",\"AccountShortName\":\"Mathew\",\"Additional1\":\"GBALLEGO0002"
                + "452\",\"Additional2\":\"GBALLEGO0002452\",\"Additional3\":\"GBALLEGO0002452\","
                + "\"Additional4\":\"GBALLEGO0002452\",\"AllowClearing\":\"Null\",\"AuthorisationCo"
                + "de\":300796,\"TransactionStatus\":\"Y\",\"DriverName\":\"SATTY BHAMRA\",\"CardEx"
                + "piryPeriod\":2204,\"CardExpiry\":\"20220101\",\"CardGroupId\":40000,\"CardGroupN"
                + "ame\":\"006240 FIRE BRIGHT SOLUTIONS\",\"IssuerCode\":7002,\"CardPAN\":\"7002053"
                + "465789891000\",\"ReleaseCode\":9,\"CardSequenceNumber\":617,\"CardType\":\"GB ST"
                + "D FLT NAT SINGLE R9\",\"ColCoCode\":\"014\",\"UnitDiscountInvoiceCurrency\":-0.0"
                + "051,\"ColCoExchangeRate\":0.851858,\"InvoiceCurrencySymbol\":\"GBP\",\"Correctio"
                + "nFlag\":true,\"CRMNumber\":10,\"CustomerCountry\":\"United Kingdom\",\"CustomerC"
                + "urrencyCode\":\"GBP\",\"CustomerCurrencySymbol\":\"£\",\"RebateonNetAmountInCust"
                + "omerCurrency\":0,\"EffectiveDiscountInCustomerCurrency\":-0.22,\"EffectiveUnitDi"
                + "scountInCustomerCurrency\":-0.0051,\"UnitPriceInInvoiceCurrency\":1.1024,\"Invoi"
                + "ceTax\":0,\"InvoiceGrossAmount\":57.25,\"InvoiceNetAmount\":47.71,\"VATonNetAmou"
                + "ntInCustomerCurrency\":9.54,\"CustomerRetailPriceUnitGross\":0,\"CustomerRetailV"
                + "alueTotalGross\":57.52,\"CustomerRetailValueTotalNet\":47.93,\"TransactionTypeDe"
                + "scription\":9.59,\"RebateonNetAmountInTransactionCurrency\":-0.22,\"EffectiveDis"
                + "countInTrxCurrency\":-0.22,\"DelCoToColCoExchangeRate\":0,\"Cards\":[275549],\"U"
                + "nitDiscountTransactionCurrency\":-0.005,\"TransactionGrossAmount\":57.25,\"Trans"
                + "actionNetAmount\":47.71,\"TransactionTax\":9.54,\"VATonNetAmount\":9.54,\"DelcoL"
                + "istPriceUnitNet\":0,\"DelcoRetailPriceUnitGross\":1.32888,\"UnitPriceInTransacti"
                + "onCurrency\":1.1074,\"DelcoRetailPriceUnitNet\":1.1074,\"DelcoRetailValueTotalGr"
                + "oss\":57.52,\"DelcoRetailValueTotalNet\":47.93,\"TransactionCurrencySymbol\":\"$"
                + "\",\"DiscountType\":\"Retail\",\"DisputeStatus\":false,\"IsShellSite\":false,\"F"
                + "leetIdInput\":\"YG67OUM\",\"IncomingProductCode\":23,\"PostingDate\":\"20210802"
                + "\",\"PostingTime\":\"14:15:22\",\"ProductCode\":30,\"ProductName\":\"Unleaded - "
                + "Medium octane\",\"ProductGroupId\":22,\"IncomingCurrencyCode\":\"GBP\",\"Incomin"
                + "gSiteDescription\":\"Shell Broadway Ring\",\"Location\":\"Shell Broadway Ring\","
                + "\"SiteName\":\"Shell Broadway Ring\",\"SiteCode\":32,\"IncomingSiteNumber\":15,"
                + "\"InvoiceCurrencyCode\":\"GBP\",\"InvoiceDate\":\"20210802\",\"InvoiceNumber\":3"
                + "201016193,\"FuelProduct\":true,\"VATApplicable\":\"Y\",\"PayerName\":\"Colours S"
                + "ervices Ltd\",\"PayerNumber\":\"GB12121212\",\"ParentCustomerNumber\":\"GB121212"
                + "12\",\"PayerGroup\":\"H312066\",\"PayerGroupName\":\"12162566 - FUEL CARD SERVIC"
                + "E\",\"CheckDigit\":6,\"NetInvoiceIndicator\":\"Y\",\"DelcoCode\":5,\"NetworkCode"
                + "\":3,\"PurchasedInCountry\":\"United Kingdom\",\"SiteCountry\":\"United Kingdom"
                + "\",\"VATCountry\":\"United Kingdom\",\"DelcoName\":\"Shell U.K. Oil Products Lim"
                + "ited\",\"Network\":\"Shell\",\"OdometerInput\":0,\"OriginalSalesItemId\":\"Null"
                + "\",\"FleetIDDescription\":\"YG67OUM\",\"ParentCustomerId\":6494,\"PINIndicator"
                + "\":\"Y, N\",\"ProductGroupName\":\"Fees\",\"PurchasedInCountryCode\":\"GB\",\"Qu"
                + "antity\":43.28,\"RebateRate\":0.0022,\"ReceiptNumber\":6803,\"RefundFlag\":\"Y"
                + "\",\"SiteGroupId\":202,\"SiteGroupName\":\"CZ 9100 ECONOMY NETWORK\",\"Latitude"
                + "\":53.83606,\"Longitude\":-1.61854,\"DelCoExchangeRate\":0.851858,\"EuroRebateAm"
                + "ount\":-0.258259,\"NetEuroAmount\":56.01,\"EuroVATAmount\":11.2,\"ParentCustomer"
                + "Name\":\"FUEL CARD SERVICES LTD\",\"IsInvoiced\":false,\"TransactionCurrencyCode"
                + "\":\"GBP\",\"CreditDebitCode\":\"D or C\",\"TransactionDate\":\"20210801\",\"Tra"
                + "nsactionTime\":\"12:16:58\",\"TransactionItemId\":\"H305908971030\",\"TrnIdentif"
                + "ier\":\"H305908971030\",\"Type\":\"SALE\",\"TransactionLine\":1,\"TransactionTyp"
                + "e\":\"Purchase\",\"UTCOffset\":\"Europe/London\",\"VATCategory\":\"United Kingdo"
                + "m Standard VAT Rate\",\"VATRate\":0.2,\"VehicleRegistration\":\"YG67OUM\",\"IsCa"
                + "ncelled\":\"Y\",\"ColCoGrossAmount\":57.25,\"ColCoNetAmount\":47.71,\"ColCoVATAm"
                + "ount\":9.54,\"OriginalCurrencySymbol\":\"$\",\"OriginalCurrencyCode\":\"$\",\"Or"
                + "iginalVATAmount\":0,\"EmbossText\":\"PARKLANE PROPERTIES LTD\",\"OriginalExchang"
                + "eRate\":0,\"OriginalTransactionItemInvoiceDate\":\"20220202\",\"FeeTypeId\":1,"
                + "\"LineItemDescription\":true,\"FeeRuleDescription\":\"Simple Fee\",\"Frequency"
                + "\":1,\"FeeRuleId\":1,\"SystemEntryDate\":\"20210828\",\"SystemEntryTime\":\"20:2"
                + "1:08\",\"IsManual\":\"Y\",\"OriginalTransactionItemId\":\"Y\",\"OriginalTransact"
                + "ionItemInvoiceNumber\":6750802,\"OriginalTransactionItemInvoiceId\":234,\"PayerS"
                + "hortName\":\"FUEL CARD SERVICES LTD\",\"ReverseCharge\":\"Y\",\"OriginalGrossAmo"
                + "unt\":57.25,\"OriginalNetAmount\":57.25,\"UnitOfMeasure\":\"L\",\"RoadType\":\"N"
                + "ational Road\",\"CustomerCountryIsoCode\":\"DE\",\"EVOperator\":\"Shell Recharge"
                + "\",\"EVSerialId\":\"GBALLEGO0002452\",\"EVChargePointSerial\":\"GBALLEGO0002452"
                + "\",\"EVChargePointConnectorType\":5,\"EVChargePointConnectorTypeDescription\":"
                + "\"DC 50 kW\",\"EVChargeDuration\":\"PT3205S\",\"EVChargeStartDate\":\"2021-08-01"
                + "\",\"EVChargeStartTime\":\"20:08:01\",\"EVChargeEndDate\":\"2022-08-01\",\"EVCha"
                + "rgeEndTime\":\"20:08:01\",\"HostingCollectingCompanyNumber\":0,\"TransactionId"
                + "\":0,\"FuelOnly\":true}],\"Page\":3,\"PageSize\":30,\"TotalPages\":5}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}
