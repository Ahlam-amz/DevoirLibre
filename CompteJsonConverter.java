package org.example;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class CompteJsonConverter {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    // Convertir un objet Compte en JSON
    public static String toJson(Compte compte) throws JsonProcessingException {
        return objectMapper.writeValueAsString(compte);
    }

    // Convertir du JSON en objet Compte
    public static Compte fromJson(String json) throws JsonProcessingException {
        return objectMapper.readValue(json, Compte.class);
    }
}
