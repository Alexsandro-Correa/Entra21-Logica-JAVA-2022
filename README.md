### *Aulas Lógica de Programação com JAVA*

---

### Lógica de Programação

> - Lógica de programação é a técnica de encadear pensamentos para atingir determinado objetivo.

---

### Algorítmo

> - Algoritmo é simplesmente uma sequência finita de passos com o proposito de resolver um problema.

---

## *Variáveis e Constantes*

> - Variáveis armazenam valores e permite alterações

> - Constantes armazenam valores e após sua inicialização, não permite mais **alterações**

---

### Tipos de Dados

> - byte , 1 byte - 8 bits = -128-127 - números inteiros
> - short, 2 bytes - 16 bits = -32768 a +32767 - números inteiros
> - int, 4 bytes - 32 bits = -2147483648 a + 2147483647 - números inteiros
> - long, 8 bytes - 64 bits = -922337203685477808 a 922337203685477807 - números inteiros
> - char, Caracteres Unicode 16 bits = 0 a 65536 = caracteres (Apenas um caractere nessas características)
> - float, 4 bytes - 32 bits = aproximadamente 3.40282347E+38 = Ponto flutuante
> - double, 8bytes - 64 bits = 1.79769313486231570W+308 = Ponto Flutuante
> - boolean, Possuem valores True e false = booleano

---

## *Operadores*

---

## Operadores Aritméticos

> - operador de adição ( + )
> - operador subtração ( - )
> - operador de multiplicação ( * )
> - operador de divisão ( / )
> - operador de módulo  ou resto da divisão ( % )

---

### Operadores de Incremento e Decremento

> - Para usar o incremento basta usar o "++" ou "+(algum numero)". Pré incremento é usado antes do número(++2) e pós incremento depois do número(2++).
> - Para usar o decremento basta usar o "--" ou "-(algum numero)". Pré decremento é usado antes do número(--2) e pós decremento depois do número(2-).

---

### Operadores de Igualdade

> - Para verificar se uma variável é igual a outra usamos ==
> - Para verificar se uma variável é diferente da outra usamos !=

---

### Operadores Relacionais

> - (<)  Menor
> - (<=) Menor Igual
> - (>)  Maior
> - (>=) Maior Igual

---

### Operadores Lógicos

> - Utilizado quando precisamos que as duas expressões sejam verdadeiras. (&&)
> - Utilizado quando precisamos que pelo menos uma das expressões sejam verdadeira. (||)

---

## *Condicionais*

#### Estrutura condicional if/else

> - if (**expressão booleana**) { bloco de código 1}
> - else {bloco de código 2}

---

#### Estrutura condicional else if

> - Complementar ao:
> - **if** **(**expressão booleana **1****)** { bloco de código 1}
> - **else** **if** **(**expressão booleana **2****)** **{** bloco de código 2}
> - **else** { bloco de código 3}

***Nota:*** *A declaração do else não é obrigatória. Para muitas situações apenas o if é suficiente.*

---

#### Operador Ternário

> - O operador ternário é um recurso para tomada de decisões com objetivo similar ao do **(**expressão booleana**)** **?** código **1** **:** código 2;

> ? Executa o código caso a expressão booleana seja verdadeira.
>
> : Executa o código caso a expressão booleana seja falsa.

---

#### Switch/Case

> - switch (expressão): é onde passamos a variável de teste que servirá de referência para as comparações que o programa deve fazer;
> - case: é onde definimos o valor que será comparado com a variável de teste e o código que será executado caso sejam compatíveis;
> - break: é a declaração opcional de quebra;
> - default: é a declaração opcional padrão, na qual definimos o código que deve ser executado, se nenhum dos valores declarados nos cases for compatível com o valor passado na variável de teste.

> switch (expressão) {
>
> case valor1:
>
> // bloco de código que será executado
>
> break;
>
> case valor2:
>
> // bloco de código que será executado
>
> break;
>
> case valorN:
>
> // bloco de código que será executado
>
> break;
>
> default:
>
> // bloco de código que será executado se nenhum dos cases for aceito
>
> }

---

## *Funções*

### Tipos de Função

> - Funções de procedimento
> - Funções com parâmetros
> - Funções com retornos
> - Funções com parâmetros e retornos

---

#### Funções de procedimento

> As funções de procedimento tem o proposito apenas de otimizar a escrita do código permitindo que linhas repetidas possam ser centralizadas em um escopo externo para serem reutilizadas por um comando mais curto

---

#### Funções com parâmetros

> Diferente das funções de procedimento que apenas executa o conjunto de linhas em seu escopo da mesma forma, os parâmetros permitem que as linhas internas executem de formas diferentes pois agora os valores são dinâmicos

---

#### Funções com retornos

> As funções com retorno tem o objetivo de devolver valores que posem ser utilizados para atribuir valores em variaveis ou serem consumidas em um SYSO. Elas podem ter parâmetros ou não.

---

#### Funções com parâmetros e retornos

> A forma mais completa de uma função seria receber valores externos, realizar o processamento e devolver um valor

---

## *Laços de Repetição*

#### For

Exemplo 1:

---

> for ( variável de controle  ;    condição de permanência no loop   ;  incremento da variável de controle) { // inicio do escopo de repetição
>
> //código a ser repetido
>
> }//fim do escopo de repetição

---

Exemplo 2:

---

> for(int contador=1; contador<=1000;i++){
>
> //execute varias vezes aqui
>
> }

---

#### While

> Para entrar no while é necessário atender a condição de permanência, que será testada novamente ao termino de cada loop

> Scanner entrada = new Scanner(System.in);
>
> String resposta="sim";
>
>
>
> while(resposta.equal("sim")){
>
>  System.out.println("Gostaria de repetir mais uma vez? (sim ou não)")
>
>  resposta=entrada.next();
>
>}


---


#### Do-While

> Para entrar na repetição nada foi solicitado, ou seja . é permitido executar o bloco de comando e somente no final testar a condição de permanência, que será testada novamente ao termino de cada loop

> Scanner entrada = new Scanner(System.in);
>
> String resposta="sim";
>
> do{
>
> System.out.println(" Já entramos no laço, mas você gostaria de repetir mais uma vez? (sim ou não)")
>
>   resposta=entrada.next();
>
> }while(resposta.equal("sim"));

---

## *Vetores*

> Os vetores constituem uma forma muito conveniente de organizar informações.

> Sintaxes
>
> <tipo>[] variavel = new [tamanho];
> ou
> <tipo> variavel[] = new [tamanho];

> **A utilização de vetores e matrizes em Java envolve três etapas:**

---

- 1. Declarar o vetor ou matriz. Para isto, basta acrescentar um par de colchetes antes ou depois do nome da variável. Por exemplo:

> byte[] idades;  
> float notas[];

---

- 2. Reservar espaço de memória e definir o tamanho. É preciso definir o tamanho do vetor, isto é, a quantidade total de elementos que terá de armazenar. Em seguida é necessário reservar espaço de memória para armazenar os elementos. Isto é feito de maneira simples pelo operador new:

> idades= new byte[10];
> notas= new float[3];

---

- 3. Armazenar elementos no vetor ou matriz. Para armazenar uma informação em um dos elementos de um vetor ou matriz, é necessário fornecer um índice que indique a posição desse elemento. Por exemplo, para armazenar um valor na quarta posição do vetor idades, fazemos o seguinte:

> idades[3] = 18;

---

## *Matrizes*

> As matrizes são vetores de vetores.
> Os vetores representam um lista de valores do mesmo tipo e com um tamanho fixo e definido durante a inicialização
> As matrizes são vetores que agrupam vetores 
  
  ---

  > <tipo> nomeVariavel[][] ; // para criar a variável de matriz

  ---

  > **Criar a matriz com 2 níveis pré incializados**

> <tipo> nomeVariavel[][] = new <tipo>{
>
>   {valor1, valor2,valor3},
>
>  {valorX,valorY,valorZ,valorW},
>
>  {valorzinho}