package model;

class PedidoNovo implements EstadoPedido {
	@Override
	public void prepararPedido(Pedido pedido) {
		System.out.println("Iniciando o preparo do pedido #" + pedido.getIdPedido());
		pedido.setEstado(new PedidoEmPreparo());
	}

	@Override
	public void enviarParaEntrega(Pedido pedido) {
		System.out.println("Erro: Pedido #" + pedido.getIdPedido() + " ainda não foi preparado!");
	}

	@Override
	public void confirmarEntrega(Pedido pedido) {
		System.out.println("Erro: Pedido #" + pedido.getIdPedido() + " ainda não saiu para entrega!");
	}

	@Override
	public void cancelarPedido(Pedido pedido) {
		System.out.println("Pedido #" + pedido.getIdPedido() + " cancelado com sucesso!");
		pedido.setEstado(new PedidoCancelado());
	}

	@Override
	public String exibirEstadoPedido(Pedido pedido) {
		return "Classe atual do estado do pedido: PedidoNovo.";
	}
}
