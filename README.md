# Gamesward-Voting-System
## API de Vota��o de Jogos

Esta � uma API que permite gravar votos dos usu�rios em seus jogos favoritos. A API foi desenvolvida em Java Spring Boot com o aux�lio do Gradle como gerenciador de depend�ncias. Al�m disso, a API utiliza o OpenAPI para documenta��o da API.

## Endpoints
A API possui os seguintes endpoints:

* GET /games/{id}: Retorna as informa��es do jogo com o ID especificado.
* POST /games: Cria um novo jogo com as informa��es fornecidas.
* PUT /games/{id}: Atualiza as informa��es do jogo com o ID especificado.
* DELETE /games/{id}: Remove o jogo com o ID especificado.
* PATCH /games/{id}/vote: Adiciona um voto para o jogo com o ID especificado.

## Campos
Os jogos possuem os seguintes campos:

* id: ID do jogo (gerado automaticamente).
* name: Nome do jogo.
* description: Descri��o do jogo (com at� 500 caracteres).
* cover: URL da imagem de capa do jogo.
* votes: N�mero de votos recebidos pelo jogo.

## Exemplos

### Exemplo de requisi��o POST /games


```json
{
  "name": "Super Mario Bros",
  "description": "Um cl�ssico jogo de plataforma da Nintendo",
  "cover": "https://example.com/super-mario-bros.jpg"
}
```

### Exemplo de resposta GET /games/1

```json
{
"id": 1,
"name": "Super Mario Bros",
"description": "Um cl�ssico jogo de plataforma da Nintendo",
"cover": "https://example.com/super-mario-bros.jpg",
"votes": 10
}
```

## Como executar a API
### Para executar a API, siga os seguintes passos:

1. Fa�a o download do c�digo fonte (https://github.com/Wastiel/Gamesward-Voting-System.git).
2. Abra um frameork e desenvolvimento (Exemplo Intelijei).
3. Execute o o projeto
4. A API ser� iniciada na porta 8080. Para acessar a documenta��o da API, acesse o seguinte link em seu navegador: 'http://localhost:8080/swagger-ui.html'


# Conclus�o
Esta � uma API simples e �til para armazenar e consultar votos de jogos. Um �timo desafio de aprendizado, pois traz exemplos de como iniciar a aplica��o com dados no banco de dados al�m de iniciar a ferramenta de documenta��o da API o OPEN API.

---------------------------------------------------------------------------------

# Games Voting API - README.me - English Version read

This is an API that allows users to vote for their favorite games. The API was developed using Java Spring Boot and Gradle as a dependency manager. Additionally, the API uses OpenAPI for API documentation.

# Endpoints

The API has the following endpoints:

* GET /games/{id}: Returns the information of the game with the specified ID.
* POST /games: Creates a new game with the provided information.
* PUT /games/{id}: Updates the information of the game with the specified ID.
* DELETE /games/{id}: Removes the game with the specified ID.
* PATCH /games/{id}/vote: Adds a vote for the game with the specified ID.

# Fields

The games have the following fields:

* id: Game ID (automatically generated).
* name: Game name.
* description: Game description (up to 500 characters).
* cover: URL of the game cover image.
* votes: Number of votes received by the game.
* Examples

# Example POST /games request
```json
{
  "name": "Super Mario Bros",
  "description": "Um cl�ssico jogo de plataforma da Nintendo",
  "cover": "https://example.com/super-mario-bros.jpg"
}
```
# Example GET /games/1 response
```json
{
"id": 1,
"name": "Super Mario Bros",
"description": "Um cl�ssico jogo de plataforma da Nintendo",
"cover": "https://example.com/super-mario-bros.jpg",
"votes": 10
}
```

## How to run the API
### To run the API, follow these steps:
1. Download the source code (https://github.com/Wastiel/Gamesward-Voting-System.git).
2. Open a development framework (e.g. IntelliJ).
3. Run the project.
4. The API will start on port 8080. To access the API documentation, go to the following link in your browser: 'http://localhost:8080/swagger-ui.html'

# Conclusion
This is a simple and useful API for storing and querying game votes. It is a great learning challenge as it provides examples of how to start the application with data in the database and how to start the API documentation tool OpenAPI.