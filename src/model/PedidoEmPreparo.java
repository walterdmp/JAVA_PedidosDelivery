package model;

class PedidoEmPreparo implements EstadoPedido {
	@Override
	public void prepararPedido(Pedido pedido) {
		System.out.println("Pedido #" + pedido.getIdPedido() + " já está em preparo!");
	}

	@Override
	public void enviarParaEntrega(Pedido pedido) {
		System.out.println("Pedido #" + pedido.getIdPedido() + " saindo para entrega!");
		pedido.setEstado(new PedidoEmEntrega());
	}

	@Override
	public void confirmarEntrega(Pedido pedido) {
		System.out.println("Erro: Pedido #" + pedido.getIdPedido() + " ainda está em preparo!");
	}

	@Override
	public void cancelarPedido(Pedido pedido) {
		System.out.println("Pedido #" + pedido.getIdPedido() + " cancelado. Taxa de preparo será cobrada.");
		pedido.setEstado(new PedidoCancelado());
	}

	@Override
	public String exibirEstadoPedido(Pedido pedido) {
		return "Classe atual do estado do pedido: PedidoEmPreparo.";
	}
}
