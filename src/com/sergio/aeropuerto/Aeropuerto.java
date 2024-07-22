package com.sergio.aeropuerto;

public class Aeropuerto extends Thread {
	public static void main(String[] args) {
		new Thread(() -> llegarAvion()).start();
		new Thread(() -> salirAvion()).start();
	}
	
	public static void llegarAvion() {
		int tLlegada = 0;
		for (int i = 0; i < 10; i++) {
			try {
				tLlegada = (int) (Math.random()*1000);
				System.out.println("Ha llegado un avión");
				Thread.sleep(tLlegada);
			}catch(InterruptedException e) {
				
			}
		}
	}
	
	public static void salirAvion() {
		int tSalida = 0;
		for (int i = 0; i < 10; i++) {
			try {
				tSalida = (int) (Math.random()*1000);
				System.out.println("Ha salido un avión");
				Thread.sleep(tSalida);
			}catch(InterruptedException e) {
				
			}
		}
	}
}
