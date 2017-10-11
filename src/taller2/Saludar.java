package taller2;
import javax.annotation.PostConstruct;

public class Saludar {
    
	private String saludo;
        
	public Saludar(String saludo) {
		this.saludo = saludo;
	}
        
	@PostConstruct
	public void springPostConstruct() {
	     System.out.println("---Inicializacion---");
	     if(saludo != null) {
	    	 System.out.println("El saludo es :"+ saludo);
	     }
	}	
	public String getBookName() {
		return saludo;
	}
}