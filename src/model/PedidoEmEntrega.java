package model;

class PedidoEmEntrega implements EstadoPedido {
	@Override
	public void prepararPedido(Pedido pedido) {
		System.out.println("Erro: Pedido #" + pedido.getIdPedido() + " já foi enviado para entrega!");
	}

	@Override
	public void enviarParaEntrega(Pedido pedido) {
		System.out.println("Erro: Pedido #" + pedido.getIdPedido() + " já está em trânsito!");
	}

	@Override
	public void confirmarEntrega(Pedido pedido) {
		System.out.println("Pedido #" + pedido.getIdPedido() + " entregue com sucesso!");
		pedido.setEstado(new PedidoEntregue());
	}

	@Override
	public void cancelarPedido(Pedido pedido) {
		System.out.println("Erro: Pedido #" + pedido.getIdPedido() + " já saiu para entrega e não pode ser cancelado!");
	}

	@Override
	public String exibirEstadoPedido(Pedido pedido) {
		return "Classe atual do estado do pedido: PedidoEmEntrega.";
	}

}