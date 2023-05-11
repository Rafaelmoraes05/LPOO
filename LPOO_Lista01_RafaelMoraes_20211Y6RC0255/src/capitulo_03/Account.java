package capitulo_03;

/*
 * Questão 1 
 * 
 * Classes: São a estrutura do código. Elas podem ser vistas como um modelo 
 * que definem como um objeto deve ser construído. 
 * 
 * Construtores: São métodos especiais das classes que são usados para criar 
 * novos objetos. O objetivo dos contrutores é inicializar os atributos do 
 * objeto recém-criado.
 * 
 * Métodos: São funções definidas dentro de uma classe. Elas podem ser chamadas
 * em um objeto criado a partir dessa classe. 
 * 
 * Objetos: São instâncias de uma classe que representam uma entidade real. Eles 
 * têm atributos e métodos definidos pela classe que são usados para interagir com
 * o objeto e alterar seu estado. 
 */

/*
 * Questão 2
 * 
 * Esta é uma classe Java chamada "Account" que tem uma variável de instância chamada 
 * "name" e dois métodos: "setName" e "getName". 
 * O método "setName" é um método público que recebe um parâmetro "name" e define a 
 * variável de instância "name" com esse valor usando a palavra-chave "this". A palavra-chave 
 * "this" se refere ao objeto atual da classe.
 * O método "getName" é um método público que retorna o valor da variável de instância "name" 
 * para o chamador do método.
 */

/*
 * Questão 3
 * 
 * Há dois modificadores de acesso: "public" e "private".
 * A variável de instância "name" é definida como "private", o que significa que ela só pode ser 
 * acessada dentro da classe "Account".
 * Os métodos "setName" e "getName" são definidos como "public", o que significa que eles podem 
 * ser acessados de fora da classe "Account" por outras classes.
 */

/*
 * Questão 4
 * 
 * A classe "AccountTest" é uma classe que contém o método "main" e é usada para testar a classe 
 * "Account". Ela interage com a classe "Account" criando um objeto "Account", definindo seu nome
 * usando o método "setName" e obtendo o nome usando o método "getName".
 */

/*
 * Questão 5
 * 
 * A principal vantagem de ter métodos "get" e "set" em uma classe é que eles permitem o encapsulamento 
 * de dados. Quando os dados são encapsulados, outros objetos em um programa Java não podem acessá-los 
 * diretamente, o que evita a alteração indevida dos dados. Em vez disso, os objetos podem acessar esses 
 * dados por meio dos métodos "get" e "set" da classe.
 */

/*
 * Questão 6
 * 
 * Um teste útil que podemos fazer com o valor null na classe "Account" e na classe de teste "AccountTest" 
 * seria testar se o método "setName" é capaz de lidar com uma entrada nula (null). Para realizar esse teste, 
 * podemos executar o programa e, quando solicitado a inserir o nome, simplesmente pressionar a tecla Enter 
 * sem inserir nenhum nome. Isso fará com que o valor lido do usuário seja nulo (null), que será passado para o 
 * método "setName" da classe "Account".
 */

/*
 * Questão 7
 * 
 * Em Java, a diferença entre um construtor e um método é determinada por dois critérios: nome e retorno.
 * Nome: O nome de um construtor deve ser o mesmo que o nome da classe, enquanto o nome de um método pode 
 * ser qualquer nome válido que obedeça às regras de nomenclatura em Java.
 * Retorno: Um construtor não tem tipo de retorno, enquanto um método deve ter um tipo de retorno ou ser 
 * declarado como "void", o que significa que não retorna nenhum valor.
 */

/*
 * Questão 8
 * 
 * a. O código não roda. Não funciona. Ele diz que o construtor está indefinido.
 * 
 * b. Porque a classe Account não possui mais um construtor padrão sem parâmetros, e o construtor padrão que 
 * o compilador cria automaticamente não é mais gerado devido à presença de um construtor personalizado com 
 * um parâmetro. Portanto, é necessário atualizar a linha Account myAccount = new Account(); para passar uma 
 * String como argumento, assim como foi feito na nova implementação da classe Account.
 */

/*
 * Questão 9
 * 
 * A classe AccountTest cria dois objetos da classe Account com nomes diferentes e exibe o nome de cada objeto.
 * Ele exibe o "Jane Green" e o "John Blue".
 */

/*
 * Questão 10
 * 
 * Após fazer as alterações, o código não compilou. Ele apresenta que os Construtores Account(String) está indefinido.  
 */

/*
 * Questão 11
 * 
 * As linhas 17 e 24 do código ajudam a classe a manter a integridade dos valores internos de Account através da validação 
 * de valores antes de permitir que sejam atribuídos às variáveis de instância.
 * A linha 17 valida se o valor de balance passado no construtor é maior que zero antes de atribuí-lo à variável de instância 
 * balance. Se o valor não for válido, a variável balance mantém seu valor inicial padrão de 0.0, garantindo que o saldo nunca 
 * seja negativo.
 * Já a linha 24 valida se a quantidade de depósito passada no método deposit é maior que zero antes de adicioná-la ao saldo. 
 * Se a quantidade não for válida, o saldo permanece inalterado, evitando que valores inválidos sejam adicionados à conta.
 */

/*
 * Questão 12
 * 
 * No início, o programa exibe o saldo inicial de cada objeto (conta) que foi criado, com o valor definido nos argumentos do 
 * construtor. Depois disso, o programa pede ao usuário que insira o valor a ser depositado em cada uma das contas e, em seguida, 
 * chama o método deposit para adicionar o valor do depósito ao saldo da conta correspondente.
 * Ao final do programa, são exibidos os saldos atualizados das duas contas.
 * As linhas 17 e 24 da classe Account ajudam a manter a integridade dos valores internos da classe, porque ao validar o valor do 
 * saldo para garantir que ele não seja negativo, evita-se que o saldo de uma conta seja negativo e possa causar problemas na operação 
 * de saque ou transferência de valores. Além disso, ao exigir que o valor inicial do saldo seja positivo, também se garante que o saldo 
 * de uma nova conta seja sempre coerente e evita-se que erros na entrada de dados causem inconsistências nos valores.
 */

/*
 * Questão 13
 * 
 * É ruim por algumas razões. Primeiro, aumenta a quantidade de código que precisa ser mantido e atualizado, o que pode ser trabalhoso e 
 * propenso a erros. Segundo, pode levar a inconsistências e problemas de manutenção. Por exemplo, se uma parte do código é atualizada e 
 * a outra parte duplicada não é atualizada, isso pode levar a erros e comportamentos inesperados. 
 * Para melhorar a capacidade de manutenção do código no futuro e evitar a duplicação, é bom criar funções e métodos reutilizáveis que
 * possam ser usados em diferentes partes do código
 */


public class Account
 {
	
 private String name; // variável de instância
 private double balance; // variável de instânciaÿ

 // Construtor de Account que recebe dois parâmetros
 public Account(String name, double balance)
 {
 this.name = name; // atribui name à variável de instância name

 // valida que o balance é maior que 0.0; se não for,
 // a variável de instância balance mantém seu valor inicial padrão de 0.0
 if (balance > 0.0) // se o saldo for válido 
  this.balance = balance; 
 }

 // método que deposita (adiciona) apenas uma quantia válida no saldo 
 public void deposit(double depositAmount) 
 { 
  if (depositAmount > 0.0) // se depositAmount for válido 
  balance = balance + depositAmount; 
 }

 // método retorna o saldo da conta 
 public double getBalance() 
 { 
  return balance; 
 } 

 // método que define o nome
 public void setName(String name)
 {
 this.name = name;
 }

 // método que retorna o nome
 public String getName()
 {
 return name; // retorna o valor de name ao chamador
 } 
 
} 
