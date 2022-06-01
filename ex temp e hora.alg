algoritmo "semnome"

var
temphora: vetor[1..8] de real
//hora: vetor[1..4] de literal
i, j: inteiro
aux: real

funcao tempconv(): real
var
cels, fahr: real
opcao: literal

inicio

escreva("converter celsius para fahrenheit(1) ou fahrenheit para celsius(2):")

repita
   leia(opcao)
   escolha opcao

   caso "1"
      escreval("graus em celsius:")
      leia(cels)
      fahr <- cels * 1.8 + 32
      retorne fahr
   caso "2"
      escreval("graus em fahrenheit:")
      leia(fahr)
      cels <- (fahr - 32) / 1.8
      retorne cels
   outrocaso
      escreval("opção inválida")
   fimescolha
ate (opcao = "1") ou (opcao = "2")
fimfuncao

inicio

para i de 1 ate 4 faca
   escreval("informe a ",[i], "° temperatura a converter:")//não funciona por algum motivo ¯\_('-')_/¯
   temphora[i] <- tempconv()
   escreval("informe a hora em que se mediu a temperatura:")
   leia(temphora[i + 4])
   limpatela
fimpara

para i de 1 ate 4 faca
   para j de 1 ate 4 faca
        se temphora[i] < temphora[j] entao
           aux <- temphora[i]
           temphora[i] <- temphora[j]
           temphora[j] <- aux

           aux <- temphora[i + 4]
           temphora[i + 4] <- temphora[j + 4]
           temphora[j + 4] <- aux
        fimse
   fimpara
fimpara

para i de 1 ate 4 faca
     escreva("a temperatura: ", temphora[i]:1:2, " foi registrada às")
     escreval(temphora[i + 4], "h")
fimpara
fimalgoritmo
