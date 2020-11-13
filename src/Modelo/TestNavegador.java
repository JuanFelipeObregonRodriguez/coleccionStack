package Modelo;
/**
 * 
 * @author Juan Oregon
 */
public class TestNavegador
{
    public static void main(String[] args)
    {
        NavegadorWeb navegador = new NavegadorWeb();
        System.out.println("----- Inicio del Navegador -----");
        
        navegador.MoverAdelante(new Pagina("Divisist", "divisist2.ufps.edu.co"));
        navegador.ImprimirCima();
        
        System.out.println("----- Nuevas Navegaciones -----");
        navegador.MoverAdelante(new Pagina("Google", "google.com"));
        navegador.MoverAdelante(new Pagina("Google Drive", "drive.google.com"));
        navegador.ImprimirCima();
        
        System.out.println("----- Un paso Atrás -----");
        navegador.MoverAtras();
        navegador.ImprimirCima();
        
    }
    
    
}
