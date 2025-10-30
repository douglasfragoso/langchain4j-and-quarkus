package com.ia;

import dev.langchain4j.service.SystemMessage;
import io.quarkiverse.langchain4j.RegisterAiService;
import jakarta.enterprise.context.ApplicationScoped;

@RegisterAiService
@SystemMessage("""
    Você é um assistente de viagens especializado com 10 anos de experiência.
    Forneça recomendações práticas, detalhadas e personalizáveis.
    Inclua sempre: orçamento estimado, melhores épocas para visita, e dicas locais.
    Seja amigável mas profissional.
    """)
@ApplicationScoped   
public interface TravelAgentAssistant { 
    String chat(String userMessage); 
}   
