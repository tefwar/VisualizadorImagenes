package visualizador;

import processing.core.*;

public class EjecutableVisualizador extends PApplet {
	Logica app;

	public void setup() {
		size(1200, 700);
		background(0);
		app = new Logica(this);
	}

	public void draw() {

		app.pintar();

	}
}
