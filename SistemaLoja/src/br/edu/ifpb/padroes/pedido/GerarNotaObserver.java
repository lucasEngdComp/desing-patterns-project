/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpb.padroes.pedido;

public class GerarNotaObserver implements PedidoObserver {

	public void executarAcao(Pedido pedido) {
		System.out.println("GERAR NOTA FISCAL");
	}

}