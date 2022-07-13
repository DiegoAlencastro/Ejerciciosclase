public class Juego{
    
    private String nombrejuego;
    private int niveles;

    
     public Juego(String nombrejuego, int niveles){
         this.nombrejuego = nombrejuego;
         this.niveles = niveles; 
     }
     
    
    public void setNombreJuego(String nombrejuego){
        this.nombrejuego = nombrejuego;
    }
    
    public String getNombreJuego(){
        return this.nombrejuego;
      
    }
    
    
    public void setNiveles(int niveles){
        this.niveles = niveles;
    }
    
    public int getNiveles(){
        return this.niveles;
    }
    
    
    public static void main(String[] args) {
    	
    	Juego objJuego; 
    	objJuego  = new Juego("Mario Bross", 8);
    	objJuego  = new Juego("Street Fighter", 6);
    	
    	System.out.println("- Datos Juego -");
    	System.out.println("Nombre Juego: " + objJuego.getNombreJuego());
    	System.out.println("Niveles: " + objJuego.getNiveles());

	}
}