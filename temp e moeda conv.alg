algoritmo "semnome"

var
fahr, cels, reais, dolar, cot: real
resp, c, n: literal
inicio
escreval("cotação do dólar atual: $")
leia(cot)
resp <- " "
enquanto resp <> "n" faca

   escreval("converter moeda ou teperatura? M/T")
   leia(c)
   se c = "M" entao
      escreval("real para dólar(1)/dólar para real(2)")
      leia(n)
      se n = "1" entao
         escreval("R$")
         leia(reais)
         escreval("$", reais / cot:1:2)
      senao
         escreval("$")
         leia(dolar)
         escreval("R$", dolar * cot:1:2)
      fimse
   senao
      escreval("fahrenheit para celsius(1)/celsius para fahrenheit(2)")
      leia(n)
      se n = "1" entao
         escreval("Fahrenheit: ")
         leia(fahr)
         escreval("graus em celsius: ", (fahr - 32) / 1.8:1:2)
      senao
         escreval("celsius: ")
         leia(cels)
         escreval("graus em fahrenheit: ", cels * 1.8 + 32:1:2)
      fimse
   fimse
   escreval("converter outro valor? S/N")
   leia(resp)
fimenquanto

fimalgoritmo
