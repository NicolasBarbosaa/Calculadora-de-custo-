
<h1>Calculadora de custo </h1>
<h2>Este é um código Java que implementa um sistema de pedidos chamado "Order". A classe "Order" possui vários atributos, incluindo se o pedido está preenchido (isFilled), o valor total da fatura (billAmount), o método de envio (shipping) e o código do cupom (coupon).

Principais recursos do código:

 • O construtor da classe "Order" é chamado ao criar um objeto e recebe quatro parâmetros: "filled" (preenchido), "cost" (custo), "shippingMethod" (método de envio) e "couponCode" (código do cupom).
 <hr>
 • O construtor define os valores dos atributos com base nos parâmetros fornecidos.
  <hr>

 • Após a atribuição dos valores, o código verifica se o valor da fatura é superior a $24.00 e imprime uma mensagem correspondente ("High value item!" ou "Low value item!").
  <hr>
 • O método "ship" verifica se o pedido está preenchido e imprime a mensagem "Shipping" se estiver ou "Order not ready" caso contrário.
  <hr>
 • O método "calculateShipping" retorna o custo de envio com base no método de envio e no cupom fornecidos.
 </h2>
 <h3> O método "main" é usado para testar o código. Ele cria dois objetos "Order", passando diferentes valores para os parâmetros. Em seguida, chama o método "ship" para o objeto "book" e imprime o valor retornado pelo método "calculateShipping" para o objeto "book".


Este código pode ser usado como base para desenvolver um sistema mais completo de gerenciamento de pedidos, adicionando recursos como cálculo de descontos, armazenamento de informações do cliente, entre outros.
</h3>
