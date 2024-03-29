package lib;

//import java.security.PublicKey;
import java.util.Scanner;
import java.time.LocalTime;

public class Inputs {
    public static Scanner scanner = new Scanner(System.in);

    /**
     * Metodo para pedir utexto
     * @param mensaje mensaje que mostrara, por defecto pon " ".
     * @return devuelve el texto ingresado.
     */
    public static String pedirString(String mensaje){
        String ingreso = "";
        mensaje = mensaje == " " ? "Ingresa algo " : mensaje;
        System.out.println(mensaje);
        ingreso = scanner.nextLine();
        
        return ingreso;
    }

    /**
     * Metodo para pedir utexto
     * @param mensaje mensaje que mostrara, por defecto pon " ".
     * @return devuelve el texto ingresado.
     */
    public static String pedirStringTexto(String mensaje){
        String ingreso = "";
        mensaje = mensaje == " " ? "Ingresa algo " : mensaje;
        System.out.println(mensaje);
        ingreso = scanner.nextLine();
        
        return ingreso;
    }

    /**
     * Metodo para pedir una fecha
     * @param mensaje mensaje que mostrara.
     * @return
     */
    public static String pedirFecha(String mensaje){
        String ingreso = "";
        mensaje = mensaje == " " ? "Ingrese una fecha" : mensaje;
        
        do{
            System.out.println(mensaje);
            ingreso = scanner.nextLine();
            ingreso = ingreso.replaceAll("[:/]", "-");
        }while(!Comprobante.comprobarFecha(ingreso));

        return ingreso;
    } 
    

    /**
     * Metodo para pedir un numero Real positivo
     * @param mensaje mensaje que mostrara, por defecto pon " ".
     * @return devuelve el num real ingresado.
     */
    public static double pedirDoublePositivo(String mensaje){
        String ingreso = "";
        mensaje = mensaje == " " ? "Ingresa un numero real entero" : mensaje;

        double resultado = 0;
        do{
            System.out.println(mensaje);
            ingreso = scanner.nextLine();
            if (!Comprobante.comprobarNumerRealPositivo(ingreso))
                continue;
            break;
        }while(true);
        resultado = Double.parseDouble(ingreso);

        return resultado;
    }

    /**
     * Metodo para pedir un numero entero, positivo o negativo
     * @param mensaje mensaje que se imprime para el ingreso, " " para el por defecto
     * @return devuelve el ingreso del numero Int
     */
    public static int pedirInt(String mensaje){
        String ingreso = "";
        mensaje = mensaje == " " ? "Ingresa un numero entero, positivo o negativo." : mensaje; 
        int resultado = 0;

        do{
            System.out.println(mensaje);
            ingreso = scanner.nextLine();
            
            if (Comprobante.comprobarNumeroEntero(ingreso) == false)
                continue;
            break;
        }while(true);
        resultado = Integer.parseInt(ingreso);

        return resultado;
    }

    /**
     * Metodo para pedir un numero entero positivo.
     * @param mensaje mensaje que se imprime al pedir el ingreso
     * @return devuelve el ingreso validado
     */
    public static int pedirIntPositivo(String mensaje){
        String ingreso = "";
        mensaje = mensaje == " " ? "Ingresa un numero entero, positivo o negativo." : mensaje; 
        int resultado = 0;

        do{
            System.out.println(mensaje);
            ingreso = scanner.nextLine();
            if (!Comprobante.comprobarNumeroPositivoEntero(ingreso))
                continue;
            break;
        }while(true);
        resultado = Integer.parseInt(ingreso);

        return resultado;
    }

    /**
     * Metodo para pedir un numero entero positivo.
     * @return devuelve el ingreso validado
     */
    public static int pedirIntPositivo(){
        String ingreso = "";
        boolean primera = true;
        int resultado = 0;

        do{
            if (!primera) 
                System.out.println("Numero no valido");
            ingreso = scanner.nextLine();
            primera = false;
            if (!Comprobante.comprobarNumeroPositivoEntero(ingreso))
                continue;
            
            break;
            
            
        }while(true);
        resultado = Integer.parseInt(ingreso);

        return resultado;
    }

    /**
     * Metodo para pedir un numero telefonico
     * @param mensaje mensaje que se imprime en pantallla
     * @return devuelve el numero telefonico en string
     */
    public static String pedirnumTelf(String mensaje){
        String ingreso = " ";
        mensaje = mensaje == " " ? "Por favor, ingrese su numero telefonico." : mensaje;
        do{
            System.out.println(mensaje);
            ingreso = scanner.nextLine();
        }while(!Comprobante.comprobarNumeroTelefono(ingreso));

        return ingreso;
    }

     /**
     * Metodo para pedir un double
     * @param mensaje mensaje que se imprime en pantallla
     * @return devuelve el double solicitado
     */
    public static boolean pedirBoolean(String mensaje){
        String ingreso = " ";
        mensaje = mensaje.equals(" ") ? "Si o No" : mensaje;

        do{
            System.out.println(mensaje);
            ingreso = Inputs.scanner.nextLine();
        }while(ingreso.toLowerCase().equals("si") == false && ingreso.toLowerCase().equals("no") == false);

        return ingreso.toLowerCase().equals("si") ? true : false;
    }

     /**
     * Metodo para pedir un numero entero positivo.
     * @param mensaje mensaje que se imprime al pedir el ingreso
     * @return devuelve el ingreso validado
     */
    public static LocalTime pedirHora(String mensaje){
        String ingreso = "";
        mensaje = mensaje == " " ? "Ingresa un hora valida." : mensaje; 
        LocalTime resultado;

        do{
            System.out.println(mensaje);
            ingreso = scanner.nextLine();
            if (!Comprobante.comprobarHora(ingreso))
                continue;
            break;
        }while(true);
        resultado = LocalTime.parse(ingreso);

        return resultado;
    }
}
