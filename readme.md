# API de Carros 🚗

## 📌 Descrição
Esta API permite o cadastro e a listagem de carros, integrando-se a um frontend em React/Next.js.

## 🛠️ Tecnologias Utilizadas
- Java 17
- Spring Boot
- PostgreSQL
- JPA/Hibernate
- Maven

## 🚀 Endpoints

### 📌 Cadastro de Carro
- **URL:** `POST /api/carros/cadastrar`
- **Exemplo de JSON enviado:**
```json
{
  "categ": "Esporte",
  "valor": 120000.00,
  "modelo": "Golf GTI"
}
```
- **Resposta (201 Created):**
```json
{
  "id": 1,
  "categ": "Esporte",
  "valor": 120000.00,
  "modelo": "Golf GTI"
}
```

---

### 📌 Listar Todos os Carros
- **URL:** `GET /api/carros/listar`
- **Resposta Exemplo (200 OK):**
```json
[
  { "id": 0, "categ": "Esporte", "valor": 120000.00, "modelo": "Golf GTI" },
  { "id": 1, "categ": "Esporte", "valor": 200000.00, "modelo": "Camaro" }
]
```

## 📦 Como Rodar o Projeto
1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/api-carros.git
   ```
2. Acesse o diretório do projeto:
   ```bash
   cd api-carros
   ```
3. Configure o banco de dados no `application.properties`:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   ```
4. Compile e rode a API:
   ```bash
   mvn spring-boot:run
   ```
5. A API estará disponível em `http://localhost:8080`.

## 📜 Licença
Este projeto está sob a licença MIT.
