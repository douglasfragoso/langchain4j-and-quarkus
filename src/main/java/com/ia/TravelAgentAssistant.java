package com.ia;

import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService
public interface TravelAgentAssistant { // interface para o assistente de viagens

    //  * O método 'chat' recebe a mensagem do usuário e retorna a resposta do LLM.
    //  * @param userMessage A mensagem do usuário.
    //  * @return A resposta gerada pelo modelo de linguagem.

    String chat(String userMessage); // método para conversar com o assistente de viagens
}   
