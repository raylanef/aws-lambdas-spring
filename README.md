# Bechmark Aws Lambdas
Este repositório contém aws lambdas escritas em Java com diferentes frameworks e métodos de build para a realização de testes de performance. Ele
está dividio em branchs e todas possuem a mesma lógica, porém com framworks ou/e configuração de build diferentes.

## Pré-requisitos
-  Docker (Nativo)
-  Java 11+ (JAR)
-  Maven 3.8+ (JAR)

## Build & Run
### JAR
Com o Maven e o JDK devidamente configurada. Abra o terminal, navegue até o diretório do projeto e digite o seguinte comando:
```
mvn clean install
```
E então execute:
```
java -jar target/nome-da-aplicacao-runner.jar
```
### Nativo
Build o container Docker

Para compilar seu código como nativo, primeiro precisamos criar um container com as dependências necessárias 
```
docker build -t container-graalvm-lambda .
```
Excute o container criando um volume que aponta para o diretório raiz do seu projeto
```
docker run -it -v /diretorio/do/projeto/:/project container-graalvm-lambda
```
Após executar o comando anterior o container estará em execução, então para compile o projeto executando o comando abaixo:
```
mvn clean package -Pnative
```
Saia do console do container com o comando <b>exit</b>, e então navegue até o diretório do projeto e execute o binário gerado:
```
./target/nome-da-aplicacao
```
Dentro do diretório target também será gerado um arquivo chamado <b>function.zip</b> que será usado para fazer o deploy da aplicação no console da AWS.
