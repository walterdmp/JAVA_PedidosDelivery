package model;

public interface EstadoPedido {
	public void prepararPedido(Pedido pedido);

	public void enviarParaEntrega(Pedido pedido);

	public void confirmarEntrega(Pedido pedido);

	public void cancelarPedido(Pedido pedido);

	public String exibirEstadoPedido(Pedido pedido);

}
