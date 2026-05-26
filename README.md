# FinTrack - JavaFX Financial Tracking Application

FinTrack é uma aplicação desktop de controle financeiro desenvolvida em Java com JavaFX.

## Estrutura do Projeto

```
FinTrack/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── app/
│   │   │   ├── controller/
│   │   │   ├── dao/
│   │   │   ├── model/
│   │   │   ├── repository/
│   │   │   ├── service/
│   │   │   └── util/
│   │   └── resources/
│   │       ├── fxml/
│   │       ├── css/
│   │       └── db/
│   └── test/
│       └── java/
├── pom.xml
└── README.md
```

## Tecnologias

- Java 11+
- JavaFX
- Maven
- SQLite/MySQL

## Como Executar

```bash
mvn clean javafx:run
```

## Como Compilar

```bash
mvn clean package
```

## Licença

MIT
