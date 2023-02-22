# Bechmark Aws Lambdas
Este repositório contém aws lambdas escritas em Java com diferentes frameworks e métodos de build para a realização de testes de performance. Ele
está dividio em branchs e todas possuem a mesma lógica, porém com framworks ou/e configuração de build diferentes.

## Branchs
- Spring Boot (Para testes também com o Aws SnapStart)
- Quarkus
- Spring Native
- Quarkus Native

## Resultado dos testes

 Tecnologia            | Cold Start (ms) | First Execution                  | Second Execution |   
|----------------------|:---------------:|:---------------------------------|:----------------:|
 Spring JVM            |     4609,28     | 390,69                           |       3,8        |
 Quarkus JVM           |     2049,58     | 62,09                            |       1,7        |
 Spring JVM SnapStart  |       202       | 293,89                           |        3         |
 Quarkus JMV SnapStart |       146       | 82,6                             |        2         |
 Spring Native         |     562,87      | 15,82                            |       2,7        |
 Quarkus Native        |     241,87      | 47,64                            |       1,25       |


## Mais detalhes

ar
