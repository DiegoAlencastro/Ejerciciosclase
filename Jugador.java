  public static void main(String[] args) {
    	
    	Jugador objJugador; 
    	objJugador  = new Jugador("Marcelo", "Canchig", "099", 20);
    	objJugador  = new Jugador("Marce", "Canc", "099", 20);
    	objJugador  = new Jugador("M", "C", "099", 20);
    	
    	System.out.println("- Datos Jugador -");
    	System.out.println("Nombre: " + objJugador.getNombre());
    	System.out.println("Apellido: " + objJugador.getApellido());
    	System.out.println("Teléfono: " + objJugador.getTelefono());
    	System.out.println("Edad: " + objJugador.getEdad());
	}
}