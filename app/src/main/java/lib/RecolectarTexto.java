package lib;

import java.util.Scanner;



public class RecolectarTexto {
    private final String texto;
    public RecolectarTexto(){
        Scanner scanner = new Scanner(System.in);
        StringBuilder stb = new StringBuilder();

        while (scanner.hasNext()) {
            stb.append(scanner.nextLine()).append(" ");   
        }
        String texto  = stb.toString();
        this.texto = texto.replaceAll("\\s+", " ");
        scanner.close();
    }
    public String getTexto() {
        return texto;
    }

    
}