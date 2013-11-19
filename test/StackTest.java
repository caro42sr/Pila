import org.junit.*;
import static org.junit.Assert.*;

public class StackTest {
    
    @Test
    public void test_isEmpty(){
        System.out.println("Test para vetificar si la pila está vacía");
        Stack pila = new Stack();
        assertTrue(pila.isEmpty());
    }
   
    @Test
    public void test_nuevoElem(){
        System.out.println("Test para vetificar el ingreso de un elemento y que la pila no está vacía");
        Stack pila = new Stack();
        pila.push(35);
        assertFalse(pila.isEmpty());
    }
    
    @Test
    public void test_agregarQuitarElem(){
        System.out.println("Test para vetificar el ingreso y extracción de un elemento y que la pila quede vacía");
        Stack pila = new Stack();
        pila.push(35);
        pila.pop();
        assertTrue(pila.isEmpty());
    }
    
    @Test
    public void test_agregarQuitarVerificarElem(){
        Integer elem;
        System.out.println("Test para vetificar el ingreso y extracción del mismo elemento");
        Stack pila = new Stack();
        pila.push(35);
        elem = pila.pop();
        assertTrue(elem == 35);
    }
    
    @Test
    public void test_verificarTresElem(){
        System.out.println("Test para vetificar el ingreso y extracción de tres elementos y su orden");
        Stack pila = new Stack();
        Integer[] elems;
        elems = new Integer[3];
        pila.push(35);
        pila.push(12);
        pila.push(60);
        for (int i = 0; i < 3; i++) {
            elems[i] = pila.pop();
        }
        assertTrue((elems[0] == 60) && (elems[1] == 12) && (elems[2] == 35));
    }
    
    @Test
    public void test_quitarElemPilaVacia(){
        System.out.println("Test para vetificar el lanzamiento de una excepción al quitar un elemento de la pila vacia");
        Stack pila = new Stack();
        assertEquals(pila.pop(), null );
     }
}
