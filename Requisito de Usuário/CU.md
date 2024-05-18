# Casos de Uso

| ID do Caso de Uso (Geral)   |      1         |
| :-------------------------: | :-----------------------------------------------------------------------: |
| Nome do Caso de Uso |Gerenciar cadastro|
| Descrição |Esse caso de uso é responsável pela manipulação de dados da conta do cliente. Para o cliente, pode gerenciar apenas certos dados. Para o gerente, todos os dados.|
| Atores |Gerente, cliente.|

<br>

| ID do Caso de Uso (Específico)   |      2         |
| :------------------------------: | :-----------------------------------------------------------------------: |
| Id do Cenário | 2 |
| Nome do Cenário | Realizar Transferência |
| Sequência de Eventos | 1. Dentro do sistema o cliente deve clicar na opção “Transferência” e uma nova aba será exibida.<br>2. O sistema irá perguntar os dados do destinatário(CPF, CNPJ, Telefone ou Chave aleatória) para realizar a transferência.<br>3. Após o cliente informar os dados deverá confirmá-los e clicar em “Avançar” sendo direcionado para uma nova aba.<br>4. O sistema então perguntará qual a quantia que o cliente deseja enviar e o horário<br>5. O cliente informa o valor e o horário e clicar em “Efetuar transferência”.<br>6. O sistema irá pedir a senha de 6 dígitos do cliente para confirmar a transferência.<br>7. Após isso uma mensagem de sucesso será exibida “Transferência realizada com sucesso!” e o comprovante será gerado contendo todas as informações da transferência.|
| Caminho alternativo 1 |O cliente informa uma quantidade para transferir maior do que o seu saldo atual, uma mensagem de erro é exibida.|
| Caminho alternativo 2 |O cliente digita a senha de sua conta incorretamente, uma mensagem de erro é exibida.|

<br>

| ID do Caso de Uso (Específico)   |      3         |
| :------------------------------: | :-----------------------------------------------------------------------: |
| Id do Cenário | 3 |
| Nome do Cenário | Consultar extrato |
| Sequência de Eventos | 1. O cliente acessa a sua conta bancária.<br>2. O sistema exibe as opções disponíveis para o cliente.<br>3. O cliente seleciona a opção “extrato”.<br>4. O sistema exibe as opções de extrato dos últimos 2 dias, 5 dias, 30 dias ou 60 dias.<br>5. O cliente seleciona o período desejado.<br>6. O sistema exibe informações detalhadas das movimentações bancárias passadas dentro do período selecionado, com data, hora descrição e valores.|
| Caminho alternativo 1 |Caso o cliente não tenha efetuado nenhuma transação bancária dentro do período requerido no extrato, o sistema emite uma mensagem dizendo que não houve nenhuma movimentação na conta durante esse período. |
| Caminho alternativo 2 |Ao acessar a conta, caso o cliente digite algum dado incorreto, o sistema emite uma mensagem de erro.|

<br>

| ID do Caso de Uso (Específico)   |      4         |
| :------------------------------: | :-----------------------------------------------------------------------: |
| Id do Cenário | 4 |
| Nome do Cenário | Criar conta |
| Sequência de Eventos | 1. O cliente deve executar o sistema e em sua tela inicial terá as opções de login “Entrar” e “Criar conta”.<br>2. Ao clicar em “Criar Conta” uma nova tela será exibida, requisitando alguns dados pessoais para a criação da conta, como CPF, RG, CEP, nº de telefone, nome do usuário e senha.<br>3. Após o preenchimento das informações o cliente deve clicar em “Salvar informações”.<br>4. O sistema então irá atribuir as informações do cliente a uma conta e fornecer o número da conta e agência.<br>5. Após isso o cliente será direcionado para fazer o login, colocando o seu CPF e senha para acessar a conta e clicar em “Entrar”.|
| Caminho alternativo 1 |O cliente fornece um número de CPF inválido, uma mensagem de erro é exibida e a criação de conta não é permitida.|
| Caminho alternativo 2 |O cliente cria uma senha que não segue os padrões de segurança, uma mensagem de erro é exibida e a criação de conta não é permitida.|

<br>

| ID do Caso de Uso (Específico)   |      5         |
| :------------------------------: | :-----------------------------------------------------------------------: |
| Id do Cenário | 5 |
| Nome do Cenário | Gerar cartão virtual |
| Sequência de Eventos | 1. O cliente acessa a sua conta bancária.<br>2. O sistema exibe as opções disponíveis para o cliente.<br>3. O cliente seleciona a opção “cartão virtual”.<br>4. O sistema exibe as opções para o cartão virtual, como gerar um novo cartão virtual, alterar o limite ou data de validade do cartão virtual.<br>5. O cliente seleciona a opção para gerar um novo cartão virtual.<br>6. O sistema solicita ao usuário o limite de gastos e a data de expiração do cartão virtual.<br>7. O sistema gera um cartão virtual para o cliente.|
| Caminho alternativo 1 |Caso o usuário informe um limite maior que o saldo bancário, o sistema emite uma mensagem de erro.|
| Caminho alternativo 2 |Para a segurança do cliente, caso seja informado uma data de expiração muito longa, o sistema emite um aviso ao cliente.|
