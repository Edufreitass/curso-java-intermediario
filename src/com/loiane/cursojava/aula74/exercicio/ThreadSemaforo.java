package com.loiane.cursojava.aula74.exercicio;

public class ThreadSemaforo implements Runnable {

	private CorSemaforo cor;
	// por padrao o valor inicial de um booleano é falso
	private boolean parar;
	private boolean corMudou;

	public ThreadSemaforo() {
		this.cor = CorSemaforo.VERMELHO;

		this.parar = false; // opcional
		this.corMudou = false; // opcional

		new Thread(this).start();
	}

	@Override
	public void run() {

		while (!parar) {
			try {
				/* switch (this.cor) {
				case VERMELHO:
					Thread.sleep(2000);
					break;
				case AMARELO:
					Thread.sleep(300);
					break;
				case VERDE:
					Thread.sleep(1000);
					break;
				default:
					break;
				} */
				Thread.sleep(this.cor.getTempoEspera());
				// mudar a cor
				this.mudarCor();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	// método para mudar de cor
	private synchronized void mudarCor() {
		switch (this.cor) {
		case VERMELHO:
			this.cor = CorSemaforo.VERDE;
			break;
		case AMARELO:
			this.cor = CorSemaforo.VERMELHO;
			break;
		case VERDE:
			this.cor = CorSemaforo.AMARELO;
			break;
		default:
			break;
		}
		this.corMudou = true;
		notify();
	}

	public synchronized void desligarSemaforo() {
		this.parar = true;
	}

	public synchronized void esperaCorMudar() {
		while (!this.corMudou) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.corMudou = false;
	}

	public CorSemaforo getCor() {
		return cor;
	}

	public boolean isParar() {
		return parar;
	}

}
