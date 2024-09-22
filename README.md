# Sistema-de-Gerenciamento-Bancario-Publicv.3
Sistema de Gerenciamento de Contas Bancárias
Descrição
Este projeto é um sistema de gerenciamento de contas bancárias desenvolvido em Java. Ele permite a criação, edição, exclusão e consulta de contas bancárias e clientes, além de realizar operações de depósito, saque e transferência entre contas. O sistema utiliza uma estrutura de pilha para gerenciar atendimentos.

Funcionalidades
Criar Conta: Permite criar uma nova conta bancária (Corrente ou Poupança) associada a um cliente.
Listar Contas: Lista todas as contas bancárias cadastradas no sistema.
Editar Cliente: Permite atualizar os dados de um cliente existente.
Consultar Conta: Consulta uma conta bancária pelo CPF do cliente.
Depositar: Realiza um depósito em uma conta bancária.
Sacar: Realiza um saque de uma conta bancária, verificando a senha.
Transferir: Transfere um valor de uma conta bancária para outra, verificando a senha.
Excluir Conta: Remove uma conta bancária do sistema.
Adicionar Atendimento: Permite adicionar um atendimento à pilha de atendimentos.
Processar Atendimento: Processa o próximo atendimento na pilha.
Requisitos
Java: Versão 11 ou superior.
IDE: IntelliJ IDEA ou outra IDE compatível com Java.
Estruturas Utilizadas
Pilha: Estrutura de dados utilizada para gerenciar atendimentos. Permite empilhar e desempilhar atendimentos de forma LIFO (Last In, First Out).
Instruções de Execução


src
│
├── estruturas           # Pacote contendo estruturas de dados
│   └── Pilha.java      # Implementação da estrutura de pilha
│
├── entidades            # Pacote contendo as entidades do sistema
│   ├── Cliente.java     # Classe representando um cliente
│   ├── ContaBancaria.java # Classe base para contas bancárias
│   ├── ContaCorrente.java # Classe representando uma conta corrente
│   └── ContaPoupanca.java  # Classe representando uma conta poupança
│
├── interfaces           # Pacote contendo interfaces do sistema
│   ├── IRepositorioContas.java   # Interface para repositórios de contas
│   └── IServicoTransferencias.java # Interface para serviços de transferências
│
└── servicos            # Pacote contendo implementações de serviços
    └── BancoServiceImpl.java  # Implementação dos serviços bancários
Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.

Licença
Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.
