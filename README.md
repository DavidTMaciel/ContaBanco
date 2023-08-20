# ContaTerminal - Cadastro de Conta Bancária via Terminal

Este é um simples programa em Java que permite ao usuário cadastrar informações de uma conta bancária através do terminal. O programa solicita informações como nome do cliente, número da agência, número da conta e saldo disponível, e em seguida exibe uma mensagem de boas-vindas com os dados fornecidos pelo usuário.

## Funcionalidades

- Solicita ao usuário que insira as seguintes informações via terminal:
  - Nome do cliente
  - Número da agência
  - Número da conta
  - Saldo disponível

- Exibe uma mensagem personalizada com as informações fornecidas pelo usuário.

## Requisitos

- Java SE Development Kit (JDK) instalado no sistema.

## Instruções de Uso

1. Abra um terminal ou prompt de comando.

2. Navegue até o diretório onde o arquivo `ContaTerminal.java` está localizado.

3. Compile o arquivo Java executando o seguinte comando:
   ```
   javac ContaTerminal.java
   ```

4. Execute o programa com o seguinte comando:
   ```
   java ContaTerminal
   ```

5. Siga as instruções apresentadas no terminal para inserir as informações solicitadas.

6. Após inserir todas as informações, o programa exibirá uma mensagem personalizada com os dados fornecidos.

7. O programa será encerrado automaticamente após a conclusão do processo.

## Observações

- Certifique-se de inserir as informações corretas conforme solicitado pelo programa.

- O programa utiliza a classe `Scanner` para capturar as entradas do usuário.

- O programa realiza a concatenação de strings para criar a mensagem personalizada exibida ao usuário.

- O saldo é inserido no formato numérico com ponto flutuante (utilizando o separador decimal padrão do sistema, que pode ser ponto ou vírgula dependendo da configuração regional).

- Certifique-se de que o JDK esteja corretamente configurado em seu ambiente para compilar e executar o programa.
