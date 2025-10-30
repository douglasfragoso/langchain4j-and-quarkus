package com.ia;

import org.jboss.logging.Logger; 
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/travel")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TravelAgentResource {

    private static final Logger LOG = Logger.getLogger(TravelAgentResource.class);

    @Inject
    TravelAgentAssistant assistant;

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public Response ask(String question) {
        try {
            // Log the received question
            LOG.infof("📩 Pergunta recebida: %s", question);
            
            // Process the question with the assistant
            String response = assistant.chat(question);
            
            // Log the generated response
            LOG.infof("✅ Resposta gerada: %s", response.substring(0, Math.min(response.length(), 100)) + "...");
            
            return Response.ok(response).build();
            
        } catch (Exception e) {
            // Log the error with stack trace
            LOG.errorf("❌ Erro ao processar requisição: %s", e.getMessage(), e);
            
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("Erro ao processar sua solicitação: " + e.getMessage())
                    .build();
        }
    }
}