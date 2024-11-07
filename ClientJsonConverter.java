package org.example;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class ClientJsonConverter {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    // Convertir un objet Client en JSON
    public static String toJson(Client client) throws JsonProcessingException {
        return objectMapper.writeValueAsString(client);
    }

    // Convertir du JSON en objet Client
    public static Client fromJson(String json) throws JsonProcessingException {
        return objectMapper.readValue(json, Client.class);
    }
}
