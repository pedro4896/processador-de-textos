# Documentação do uso da IA na Questão 5 (Template Method)

## Prompts utilizados

1. "questão 5"
2. "faça a questão 5"
3. "gere os commits, docs IA, README"

## O que a IA gerou

- Estrutura da classe abstrata `ProcessadorTexto` com o Template Method `processar(String entrada)`.
- Implementações concretas `TudoMaiuscula` e `TudoMinuscula` herdando de `ProcessadorTexto`.
- Classe `Main` para demonstrar o funcionamento do padrão Template Method.
- Sugestão de organização em commits, incluindo documentação e README.

## Ajustes manuais feitos

- Adaptei os nomes dos métodos para ficarem consistentes com o enunciado da lista (por exemplo, manter `converterTextoEmMaiusculo` e `converterTextoEmMinusculo` como métodos estáticos).
- Simplifiquei a lógica interna para atender ao pedido de "artefatos tão simples quanto possível", focando apenas em demonstrar o padrão de projeto.
- Ajustei mensagens exibidas no console para ficarem mais claras para apresentação em arguição.

## Por que os ajustes foram necessários

Os ajustes deixaram o código:

- Mais alinhado com o enunciado da questão da lista avaliativa.
- Mais legível e fácil de explicar durante a apresentação.
- Focado no objetivo principal: mostrar o uso do Template Method para evitar duplicação de lógica entre processadores de texto (maiúsculo/minúsculo).
