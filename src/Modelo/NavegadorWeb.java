package Modelo;
/**
 * @author Juan Obregon
 */
import java.util.Stack;

public class NavegadorWeb
{

    Stack<Pagina> listaPrincipal = new Stack<>();
    Stack<Pagina> listaAuxiliar = new Stack<>();

    public NavegadorWeb()
    {
    }

    public Stack<Pagina> getListaPrincipal()
    {
        return listaPrincipal;
    }

    public void setListaPrincipal(Stack<Pagina> listaPrincipal)
    {
        this.listaPrincipal = listaPrincipal;
    }

    public Stack<Pagina> getListaAuxiliar()
    {
        return listaAuxiliar;
    }

    public void setListaAuxiliar(Stack<Pagina> listaAuxiliar)
    {
        this.listaAuxiliar = listaAuxiliar;
    }
    
    public void MoverAdelante(Pagina p)
    {
        if (listaAuxiliar.empty()) 
        {
            listaPrincipal.push(p);
        }
        else
        {
            listaPrincipal.push(listaAuxiliar.pop());
        }
    }
    
    public void MoverAtras()
    {
        listaAuxiliar.push(listaPrincipal.pop());        
    }
    
    public void ImprimirCima ()
    {
        System.out.println(listaPrincipal.lastElement());
    }
}
