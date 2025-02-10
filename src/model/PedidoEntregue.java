package model;

class PedidoEntregue implements EstadoPedido {
	@Override
	public void prepararPedido(Pedido pedido) {
		System.out.println("Erro: Pedido #" + pedido.getIdPedido() + " já foi entregue!");
	}

	@Override
	public void enviarParaEntrega(Pedido pedido) {
		System.out.println("Erro: Pedido #" + pedido.getIdPedido() + " já foi entregue!");
	}

	@Override
	public void confirmarEntrega(Pedido pedido) {
		System.out.println("Erro: Pedido #" + pedido.getIdPedido() + " já está entregue!");
	}

	@Override
	public void cancelarPedido(Pedido pedido) {
		System.out.println("Erro: Pedido #" + pedido.getIdPedido() + " já foi entregue e não pode ser cancelado!");
	}

	@Override
	public String exibirEstadoPedido(Pedido pedido) {
		return "Classe atual do estado do pedido: PedidoEntregue.";
	}
}
