package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private EstadoPedido estadoAtual;
	private String idPedido;
	private List<Item> itens;

	public Pedido(String idPedido) {
		this.idPedido = idPedido;
		this.estadoAtual = new PedidoNovo();
		this.itens = new ArrayList<>();
	}

	public void addItem(Item item) {
		itens.add(item);
	}

	public void setEstado(EstadoPedido estado) {
		this.estadoAtual = estado;
	}

	public String getIdPedido() {
		return idPedido;
	}

	public void prepararPedido() {
		estadoAtual.prepararPedido(this);
	}

	public void enviarParaEntrega() {
		estadoAtual.enviarParaEntrega(this);
	}

	public void confirmarEntrega() {
		estadoAtual.confirmarEntrega(this);
	}

	public void cancelarPedido() {
		estadoAtual.cancelarPedido(this);
	}

	public String exibirEstadoPedido() {
		return estadoAtual.exibirEstadoPedido(this);
	}

}
