package controller;

import javax.swing.JFrame;

import view.InicialTela;

public class Principal 
{
	public static void main(String[] args) 
	{
		JFrame janela = new InicialTela();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		System.out.println("Olá mundo!");
	}
}