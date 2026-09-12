# Analisador de Senha (Java)

Programa no console que analisa a força de uma senha informada pelo usuário, atribuindo uma pontuação com base em critérios de segurança e exibindo a classificação final.https://github.com/mercanteasr/AnalisadordeSenha/tree/master

## O que o programa faz

Lê uma senha digitada no console, verifica o comprimento e a presença de números, letras maiúsculas e caracteres especiais, calcula a pontuação total com base nesses critérios e classifica a senha entre **Extremamente Fraca**, **Fraca**, **Média** ou **Forte**.

## O que eu aprendi

- **Leitura de dados via console:** uso de `BufferedReader` e `InputStreamReader` para capturar a entrada do usuário de forma eficiente.
- **Manipulação e inspeção de Strings:** navegação pelos caracteres da palavra com laços `for` e uso de métodos da classe `Character` (`isDigit`, `isUpperCase`, `isLetter`).
- **Sinalização com flags booleanas:** uso de variáveis booleanas para identificar a presença de padrões específicos na senha antes de aplicar a pontuação.
- **Estruturas de decisão e pontuação:** aplicação de lógica de validação com `if`/`else` para acumular pontos dinamicamente e definir a faixa de segurança da senha.
- **Modularização com métodos:** divisão das responsabilidades do código em funções estáticas auxiliares (`PontuadorSenha`, `ClassificarSenha`, `TotalPontuacao`).
