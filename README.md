﻿# slotMachine
O Sistema deve gerar 3 valores aleatórios entre as opções Banana - 10 pontos, Morango - 20 pontos e Estrela - 40 pontos. Sempre que gerado os valores devem ser somados e apresentado ao usuário o valor total da pontuação.

Exemplo de Output
| Banana | Estrela | Morango
Total: 70 pontos.

Entrega mínima:
Sistema permite começar o jogo, isso gera os 3 valores aleatórios e retorna o total de pontuação para o usuário.

Entrega média:
O sistema permite alterar a dificuldade da maquina para gerar mais valores além de 3.

Entrega máxima:   
Adiciona uma regra ao somar os pontos. Se todos os valores aleatórios forem iguais (BANANA, BANANA, BANANA) é adiciona um bônus ao resultado da pontuação. O bônus é o total de pontos multiplicado por 100


Mini documentação do desenvolvimento do projeto.

26/08
-criação das classes bases: io, app, appSystem;
inicialmente foi criado uma classe chamada combination aonde seria feito as combinaçoes de tudo, nela esta as variaveis banana, strawberry e star do tipo private int com os valores ja setados.Tambem foi criado uma interface chamada Calculation aonde teria um suntotal para a soma final.
-uml inicial
-estudo da classe ramdom

27/08
-Criação da classe enum para melhor manipulação das varaiveis
-descoberta private final, que resolveu o problema dos valores das variaveis serem alteradas conforme a manipulação. Evitando a perca ou alteração de valores.
-Criação da classe Roulette, que no inicio ficaria responsavel apenas por fazer a roletagem dos valores com o random.
De inicio pensei em usar o ramdom 3 vezes para a variação de resultados, somando todos com o enum. Infelizmente não foi uma alternativa viavel uma vez que sempre era encontrado erros e nunca me retornavam os valores corretos.

28/08
-Consegui corrigir os erros de sintax, e apenas implementei as demais dificuldaes coloquei no menu tambem opcoes de medio e difiil.
Foi um dia mais voltado para corrigir erros e implementaçoes necessarias. Precisei pesquisar muito sobre sistema de cassino e revisei codigos encontrados na internet com esse sistema de cassino. Tambem procurei ajuda da mentora,ajuda das meninas da turma e de uma colega na faculdade. Alem de revisar codigos do vini.
