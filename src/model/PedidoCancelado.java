package model;

class PedidoCancelado implements EstadoPedido {

	@Override
	public void prepararPedido(Pedido pedido) {
		System.out.println("Erro: Pedido #" + pedido.getIdPedido() + " foi cancelado e não pode ser preparado!");
	}

	@Override
	public void enviarParaEntrega(Pedido pedido) {
		System.out.println("Erro: Pedido #" + pedido.getIdPedido() + " foi cancelado e não pode ser enviado!");
	}

	@Override
	public void confirmarEntrega(Pedido pedido) {
		System.out.println("Erro: Pedido #" + pedido.getIdPedido() + " foi cancelado e não pode ser entregue!");
	}

	@Override
	public void cancelarPedido(Pedido pedido) {
		System.out.println("Erro: Pedido #" + pedido.getIdPedido() + " já está cancelado!");
	}

	@Override
	public String exibirEstadoPedido(Pedido pedido) {
		return "Classe atual do estado do pedido: PedidoCancelado.";
	}
}