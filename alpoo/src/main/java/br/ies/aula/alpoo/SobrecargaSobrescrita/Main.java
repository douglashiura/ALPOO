package br.ies.aula.alpoo.SobrecargaSobrescrita;

import java.awt.Point;

public class Main {
	public static void main(String[] args) {
		System.out.println(new Mouse().observar(12.0f));
		IronMouse ironMouse = new IronMouse();
		System.out.println(ironMouse.observar(12.0f));
		System.out.println(ironMouse.observar(12));
		System.out.println(ironMouse.observar(new Point()));		
	}
}
