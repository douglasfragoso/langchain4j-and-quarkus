package com.ia;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/travel")
public class TravelAgentResource {

    @Inject
    TravelAgentAssistant assistant; // injeção de dependência para o assistente de viagens

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String ask(String question) { // método para fazer perguntas ao assistente de viagens

        return assistant.chat(question);
    }
}