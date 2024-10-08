/*
 * ShellDataReportingAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.models.containers;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.shell.apitest.ApiHelper;
import com.shell.apitest.models.PricedTransactionItemsLocationItems;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = PricedTransactionResponseTransactionsItemsLocation.PricedTransactionResponseTransactionsItemsLocationDeserializer.class)
public abstract class PricedTransactionResponseTransactionsItemsLocation {
    
    /**
     * This is Object case.
     * @param object Object value for object.
     * @return The ObjectCase object.
     */
    public static PricedTransactionResponseTransactionsItemsLocation fromObject(Object object) {
        return object == null ? null : new ObjectCase(object);
    }

    /**
     * This is PricedTransactionItemsLocationItems case.
     * @param pricedTransactionItemsLocationItems PricedTransactionItemsLocationItems value for pricedTransactionItemsLocationItems.
     * @return The PricedTransactionItemsLocationItemsCase object.
     */
    public static PricedTransactionResponseTransactionsItemsLocation fromPricedTransactionItemsLocationItems(
            PricedTransactionItemsLocationItems pricedTransactionItemsLocationItems) {
        return pricedTransactionItemsLocationItems == null ? null : new PricedTransactionItemsLocationItemsCase(pricedTransactionItemsLocationItems);
    }

    /**
     * Method to match from the provided one-of cases.
     * @param <R> The type to return after applying callback.
     * @param cases The one-of type cases callback.
     * @return The one-of matched case.
     */
    public abstract <R> R match(Cases<R> cases);

    /**
     * This is interface for one-of cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R object(Object object);

        R pricedTransactionItemsLocationItems(PricedTransactionItemsLocationItems pricedTransactionItemsLocationItems);
    }

    /**
     * This is a implementation class for ObjectCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "Object")
    private static class ObjectCase extends PricedTransactionResponseTransactionsItemsLocation {

        @JsonValue
        private Object object;

        ObjectCase(Object object) {
            this.object = object;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.object(this.object);
        }

        @JsonCreator
        private ObjectCase(JsonNode jsonNode) throws IOException {
            this.object = jsonNode;
        }

        @Override
        public String toString() {
            return object.toString();
        }
    }

    /**
     * This is a implementation class for PricedTransactionItemsLocationItemsCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PricedTransactionItemsLocationItems")
    private static class PricedTransactionItemsLocationItemsCase extends PricedTransactionResponseTransactionsItemsLocation {

        @JsonValue
        private PricedTransactionItemsLocationItems pricedTransactionItemsLocationItems;

        PricedTransactionItemsLocationItemsCase(PricedTransactionItemsLocationItems pricedTransactionItemsLocationItems) {
            this.pricedTransactionItemsLocationItems = pricedTransactionItemsLocationItems;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.pricedTransactionItemsLocationItems(this.pricedTransactionItemsLocationItems);
        }

        @JsonCreator
        private PricedTransactionItemsLocationItemsCase(JsonNode jsonNode) throws IOException {
            this.pricedTransactionItemsLocationItems = ApiHelper.deserialize(jsonNode,
                PricedTransactionItemsLocationItems.class);
        }

        @Override
        public String toString() {
            return pricedTransactionItemsLocationItems.toString();
        }
    }

    /**
     * This is a custom deserializer class for PricedTransactionResponseTransactionsItemsLocation.
     */
    protected static class PricedTransactionResponseTransactionsItemsLocationDeserializer
            extends JsonDeserializer<PricedTransactionResponseTransactionsItemsLocation> {

        @Override
        public PricedTransactionResponseTransactionsItemsLocation deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(ObjectCase.class,
                    PricedTransactionItemsLocationItemsCase.class), true);
        }
    }

}
