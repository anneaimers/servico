# Assistência Técnica (Polimorfismo com ArrayList)

## Objetivo
Montar um orçamento reunindo serviços de modalidades diferentes em uma
única lista, calculando cada preço pela sua própria regra.

## Hierarquia
Servico → ServicoDomiciliar
Servico → ServicoUrgente

## Regras de cálculo
- Servico: valorBase + R$ 10,00 (taxa de atendimento)
- ServicoDomiciliar: super + R$ 15,00 se distanciaKm <= 10, senão + R$ 30,00
- ServicoUrgente: super + 30% do resultado

## Classes
- Servico: descricao, valorBase, getters, calcularValor()
- ServicoDomiciliar: distanciaKm, getDistanciaKm(), calcularValor() com @Override
- ServicoUrgente: sem atributos próprios, apenas calcularValor() com @Override
- Orcamento: ArrayList<Servico>, adicionarServico(), listarServicos(), calcularTotal()
- App: cria os serviços, adiciona ao orçamento, lista e mostra o total

## Observação importante
O Orcamento não escolhe a fórmula pelo tipo do objeto. Ele percorre a lista
com foreach usando referência do tipo Servico e chama calcularValor().

## Saída esperada (valores base R$ 150,00)
geral: R$ 160,00
luz na sala (20 km): R$ 190,00
fiacao do quarto (5 km): R$ 175,00
encanamento (urgente): R$ 208,00
Total: R$ 733,00

## Conceitos aplicados
extends, super, @Override, ArrayList, foreach, polimorfismo
