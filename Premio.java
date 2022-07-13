  public static void main(String[] args) {
    	
    	Premio objPremio; 
    	objPremio  = new Premio("Mario Bross", 100);
    	objPremio  = new Premio("Street Fighter", 200);
    	
    	System.out.println("- Datos Premio -");
    	System.out.println("Nombre Juego: " + objPremio.getNomJuego());
    	System.out.println("Premio $: " + objPremio.getPremio());

	}
}