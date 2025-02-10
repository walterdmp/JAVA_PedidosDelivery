package view;

import model.Pedido;

public class Main {
	public static void main(String[] args) {
		Pedido pedido = new Pedido("1");
		System.out.println(pedido.exibirEstadoPedido());
		pedido.prepararPedido();
		System.out.println(pedido.exibirEstadoPedido());
		pedido.enviarParaEntrega();
		System.out.println(pedido.exibirEstadoPedido());
		pedido.confirmarEntrega();
		System.out.println(pedido.exibirEstadoPedido());
		pedido.cancelarPedido();

		System.out.println("--------------------------------------------------------");

		Pedido pedido2 = new Pedido("2");
		pedido2.prepararPedido();
		System.out.println(pedido2.exibirEstadoPedido());
		pedido2.confirmarEntrega();
		System.out.println(pedido2.exibirEstadoPedido());
		pedido2.cancelarPedido();
		System.out.println(pedido2.exibirEstadoPedido());
	}

}
