# langchain4j-and-quarkus

Este é um projeto Quarkus com integração do LangChain4j para trabalhar com IA.

## Pré-requisitos

- Java 25 ou superior
- Maven 3.8+ ou superior

## Executar o projeto

Para executar o projeto em modo desenvolvimento:

```bash
./mvnw compile quarkus:dev
```

Ou se estiver usando Windows:

```bash
mvnw.cmd compile quarkus:dev
```

## Compilar e executar

Para compilar o projeto:

```bash
./mvnw package
```

Para executar o JAR compilado:

```bash
java -jar target/quarkus-app/quarkus-run.jar
```

## Configuração

Configure sua chave da API OpenAI no arquivo `application.properties` ou através da variável de ambiente `OPENAI_API_KEY`.

## Endpoints

- GET /hello - Endpoint básico de exemplo

## Documentação

- [Quarkus Guide](https://quarkus.io/guides/)
- [LangChain4j Documentation](https://docs.langchain4j.dev/)
