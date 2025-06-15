![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> nota[\ Digite sua nota \]
   nota --> freq[\ Digite sua frequencia em % \]
   freq --> teste{ Nota >= 50 \n E \n frequencia >= 75% }
   teste --> |Sim| A[/ Aprovado /]
   teste --> |Não| B[/ Reprovado /]
   A --> fim([ Fim ])
   B --> fim

   ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
      start(( Inicío )) --> number1[\ Escolha o N1 \]
      number1 --> number2[\ Escolha o N2 \]
      number2 --> soma{ N1 + N2 }
      soma --> resultado[/ Resultado = N1 + N2 /]     
      resultado --> final([ Fim ])

   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
       start(( Inicío )) --> number1[\ Escolha um número \]
      number1 --> check{ Se N é >= 0 }
   check --> |Sim| A[/ Positivo /]
   check --> |Não| B[/ Negativo /]
   A --> final([Fim])
   B --> final

   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
   start(( Inicio )) --> idade[\ Digite sua idade: \]
   idade --> check{ Se Idade for >= 16 }
   check --> |Sim| titulo{Possui o titulo de eleitor?}
   check --> |Não| A[/ Não pode votar /]
   titulo --> |Sim| B[/ Pode Votar /]
   titulo --> |Não| C[/ Não Pode Votar /]
   A --> final([Fim])
   B --> final 
   C --> final
   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
   start((Inicio)) --> n1[\ Digite o primeiro numero: \]
   n1 --> n2[\ Digite o segundo numero: \]
   n2 --> check{ Se N1 > N2? }
   check --> |Sim| A[/ N1 é o maior /]
   check --> |Não| B[/ N2 é o maior /]
    A --> final([Fim])
   B --> final([Fim])
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
    A[Início] --> B[Leia número A]
    B --> C[Leia número B]
    C --> D[Leia número C]
    D --> E{A > B?}
    E -- Sim --> F{A > C?}
    F -- Sim --> G[Maior = A]
    F -- Não --> H[Maior = C]
    E -- Não --> I{B > C?}
    I -- Sim --> J[Maior = B]
    I -- Não --> K[Maior = C]
    G --> L[Fim]
    H --> L
    J --> L
    K --> L

   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
     A(( Inicio )) --> B[\ Digite um numero: \]
   B --> C[r= 1]
   C --> D[n>1?]
   D --> |Sim| E[r= r*n]
   E --> F[n= n-1]
   F --> D
   D --> |Não| G[/Resposta = r/]
   G --> H([Final])

   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >**Exemplos**:  
   > - 9 % 2 = 1  
   > - 11 % 3 = 2
   
   ```mermaid
   flowchart TD
     start((Inicio)) --> A[\ Digite um numero: \]
     A --> B[N % 2]
     B --> C{Se o resto da divisão for = 0?}
     C --> |Sim| D[/ O numero é par /]
     C --> |Não| E[/ O numero é impar /]
   D --> final([Fim])
   E --> final

   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
   flowchart TD
    A[Início] --> B[Leia número N]
    B --> C{N <= 1?}
    C -- Sim --> D[Não é primo]
    C -- Não --> E[Defina i = 2]
    E --> F{i * i <= N?}
    F -- Não --> G[É primo]
    F -- Sim --> H{N % i == 0?}
    H -- Sim --> I[Não é primo]
    D --> K[Fim]
    G --> K
    I --> K

   ```