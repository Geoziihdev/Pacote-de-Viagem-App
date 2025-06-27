# Pacote de Viagem - Sistema de Gestão de Viagens

## Descrição

Este projeto é uma aplicação em Java que simula o sistema de vendas de pacotes de viagem. A aplicação foi desenvolvida aplicando conceitos de orientação a objetos, como classes e métodos, para calcular o valor total do pacote de viagem e da venda, com base nos dados informados pelo usuário, como tipo de transporte, hospedagem, taxas adicionais e margem de lucro.

### Funcionalidades:
- **Cadastro de pacote de viagem**: O usuário pode cadastrar um pacote de viagem, informando o tipo de transporte (aéreo, rodoviário, etc.), o tipo de hospedagem, o destino e a quantidade de dias.
- **Cálculo do valor total**: O sistema calcula o valor total da hospedagem (baseado no número de dias e no valor da diária), o lucro sobre o pacote e o valor total do pacote.
- **Conversão de valores**: A aplicação converte o valor do pacote de viagem entre as moedas Real e Dólar, com base na cotação fornecida pelo usuário.
- **Cadastro de venda**: O usuário pode registrar uma venda, informando o cliente, a forma de pagamento, e o pacote escolhido.

## Tecnologias Usadas
- **Java**: Para a implementação do sistema de acordo com o paradigma de orientação a objetos.
- **NetBeans**: Ambiente de desenvolvimento utilizado para a criação e execução do projeto.

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- **Classes:**
  - `Transporte`: Representa o meio de transporte (aéreo, rodoviário, etc.), incluindo tipo e valor.
  - `Hospedagem`: Representa o tipo de hospedagem e o valor da diária.
  - `PacoteViagem`: Representa o pacote de viagem, que inclui transporte, hospedagem, destino e número de dias. Contém métodos para calcular o valor total do pacote.
  - `Venda`: Representa a venda do pacote de viagem, incluindo informações do cliente, forma de pagamento e cotação do dólar.
  
- **Main Class**: `PacoteDeViagemApp`: Responsável por interagir com o usuário, coletar os dados de entrada e mostrar os resultados no console.

## Como Executar

1. Clone este repositório para sua máquina local:
   ```bash
   git clone <https://github.com/Geoziihdev/Pacote-de-Viagem-App.git>
   
2. Abra o projeto no NetBeans ou qualquer IDE de sua preferência.

3. Compile e execute o arquivo PacoteDeViagemApp.java.

4. Siga as instruções no console para cadastrar o pacote de viagem e a venda.

