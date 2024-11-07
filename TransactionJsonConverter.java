package org.example;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class TransactionJsonConverter {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    // Convertir un objet Transaction en JSON
    public static String toJson(Transaction transaction) throws JsonProcessingException {
        return objectMapper.writeValueAsString(transaction);
    }

    // Convertir du JSON en objet Transaction
    public static Transaction fromJson(String json) throws JsonProcessingException {
        return objectMapper.readValue(json, Transaction.class);
    }
}
