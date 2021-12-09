import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Nodo5000 {

    Scanner sc = new Scanner(System.in);

    public class Nodo {

        int Dato;
        Nodo Next;
    }
    int nodos=500;
    Nodo inicial = null;
    Nodo fin = null;
    int r;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nodo5000 n = new Nodo5000();
        int opc;

        do {
            System.out.print("\nMenu."
                    + "\n 1- Llenar "
                    + "\n 2- Mostrar"
                    + "\n 3- Ordenar "
                    + "\n 4- Eliminar repetidos"
                    + "\n 5- Agregar faltantes"
                    + "\n 6- Salir"
                    + "\n Seleccione la opcion a realizar:");

            switch (opc = sc.nextInt()) {
                case 1:
                    n.Llenar();
                    break;
                case 2:
                    n.Mostrar();
                    break;
                case 3:
                    n.Ordenar();
                    break;
                case 4:
                    n.Elimrepet();
                    break;
                case 5:
                    n.Agregarfalt();
                    break;
            }

        } while (opc != 6);

    }

    public void Llenar() {
        int [] conparar =new int [501];
        if(inicial==null){
            inicial = new Nodo();
            inicial.Next = null;
            for (int i = 2; i <= 500; i++) {
                int Numeros = ((int) (Math.random() * 500 + 0));
                conparar[i]=Numeros;
                Nodo temp;
                temp = new Nodo();
                temp.Dato = Numeros;
                temp.Next = inicial;
                        
                inicial = temp;
            }
        
        System.out.println("\n"+"Datos agregados"+conparar);
        }else{
            System.out.println("\n"+"Seleccione la opcion 5!!!");
        }
    }

    public void Mostrar() {
        Nodo actual = new Nodo();
        actual = inicial;
        if (inicial != null) {
            while (actual != null) {
                for (int i = 1; i <= nodos; i++) {
                System.out.println("Nodo "+i+" [ " + actual.Dato + " ] ");
                actual = actual.Next;
                }
            }
        }
    }

    public void Ordenar() {
        int  au;
        if (inicial != null) {
            System.out.println("\n"+"Datos ordenados ");
            for (int cont = 1; cont <= 500; cont++) {
                Nodo anterior = new Nodo();
                anterior = inicial;
                Nodo actual = new Nodo();
                actual = anterior.Next;
                for (int i = 0; i <= 500 - 1; i++) {
                    for (int j = 0; j <= 500 - 1; j++) {
                        while (anterior.Next != null) {
                            if (anterior.Dato == actual.Dato) {
                                au = anterior.Dato;
                                anterior.Dato = actual.Dato;
                                actual.Dato = au;
                            }
                            anterior = actual;
                            actual = anterior.Next;
                        }
                    }
                }
            }
        }
    }

    public void Elimrepet() {
        int  au;
        if (inicial != null) {
            for (int cont = 1; cont <= 500; cont++) {
                Nodo anterior = new Nodo();
                anterior = inicial;
                Nodo actual = new Nodo();
                actual = anterior.Next;
                for (int i = 0; i <= 500 - 1; i++) {
                    for (int j = 0; j <= 500 - 1; j++) {
                        while (anterior.Next != null) {
                            if (anterior.Dato == actual.Dato) {
                                int contador=1;
                                contador++;
                                System.out.println(contador);
                            }
                        }
                    }
                }
            }
        } else {
            System.out.print("\n" + "La lista esta vacia!!!");
        }
        System.out.println("");
       
    }

    public void Agregarfalt() {
        for (int i = nodos; i <= 499; i++) {
            int Numeros2 = ((int) (Math.random() * 9 + 1));
            Nodo temp;//Si la lista tiene valores entonces se creara un nodo temporal para almacenarlo en la lista y hara el mimos procediminto como anteriormente
            temp = new Nodo();//Nuevo nodo temporal
            //System.out.print("\n" + "Ingresa el contenido para el nodo: ");
            temp.Dato = Numeros2;
            temp.Next = inicial;
            //System.out.print(reset + "[" + azul + temp.name + reset + "]\n");
            inicial = temp;
            nodos++;
        }
        System.out.print("\n" + "La lista esta llena!!!");
    }
}
