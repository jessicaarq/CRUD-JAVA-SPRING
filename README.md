# CRUD-JAVA-SPRING-WEB
CRUD com Java utilizando o gerenciador de dependências Apache Maven 

- Java Spring Web
- Maven
- JPA
- MariaDB/SQL
- JDBC
- Docker

## Como usar:
### Windows, Linux e MacOS
Primeiros passos
### Aquisição da IDE e do Servidor
- Baixe o [Java 8](https://www.java.com/pt_BR/download/).
- Baixe o [Intellij IDE](https://www.jetbrains.com/pt-br/idea/download/).
- Baixe o [Tomcat 8.5](https://tomcat.apache.org/download-80.cgi).
- Baixe o [MariaDB](https://mariadb.org/download/).
- Baixe o [reposit�rio](https://github.com/gustavottc/CRUD-JAVA-WEB/archive/master.zip) da aplica��o.
- Baixe o [Docker](https://docs.docker.com/get-docker/)
### Configuração e instalação
- Java
  - Instalação:
    - Instale conforme documentação oficial
- Intellij
  - Instalação:
    - Instale conforme documentação oficial
  - Configuração:
    - Com o Intellij iniciado, vá em:
      - "File"
      - "Settings"
      - "Plugins"
          - Selecione o plugin Spring Assitant
      - Crie um novo projeto utilizando o spring assistant.
- SQL
  - Instalação:
    - Instale conforme documentação oficial
  - Configuração:
    - Configure a porta do SQL como padrão (3306)
- Docker
    - Instalação:
        - Instale conforme documentação oficial
        
### Uso da aplicação
- Comando para geração .jar:
    - Acesse o terminal na pasta do projeto.
    - Execute o comando abaixo:
```
    mvn package
```
- Rodando aplicação
    - Acesse o terminal na pasta do projeto.
    - Executar o comando docker abaixo:
```
    docker-compose up -d
```

- Endpoints disponibilizados
    - Listar todas as trilhas:
        - GET http://localhost:8081/trilhas
    - Listar trilha pelo ID:
        - GET http://localhost:8081/trilhas/{id}
    - Update de trilha pelo ID:
        - PUT http://localhost:8081/trilhas/{id}
    - Criação de nova trilha:
        - POST http://localhost:8081/trilhas
    - Deletar trilha pelo ID:
        - DELETE http://localhost:8081/trilhas/{id}
    - Listar todos os cargos:
        - GET http://localhost:8081/trilhas
    - Listar cargo pelo ID:
        - GET http://localhost:8081/trilhas/{id}
    - Update do cargo pelo ID:
        - PUT http://localhost:8081/trilhas/{id}
    - Criação de novo cargo:
        - POST http://localhost:8081/trilhas
    - Deletar cargo pelo ID:
        - DELETE http://localhost:8081/trilhas/{id}