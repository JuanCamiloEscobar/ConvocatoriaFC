/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convocatoria;


import java.util.Scanner;

/**
 *
 * @author JESCOBAR
 */
public class Convocatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner entrada = new Scanner(System.in);
        
        int contador = 0;
        int opcion;
        boolean salir = false;
        
        Jugador [] jugadores = new Jugador[32];
        
        while(!salir){
            System.out.println("Welcomeeeee");
            System.out.println("*******");
            
            System.out.println("1. Agregar un Jugador");
            System.out.println("2. Mostar un Jugador");
            System.out.println("3. Editar un Jugador");
            System.out.println("4. Mostrar toda la convocatoria");
            System.out.println("5. Salir");
            
            System.out.println("DIGITE UNA OPCION...");
            
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    
                    jugadores[contador]= new Jugador();
                    
                    System.out.println("Digite el id del jugador:");
                    jugadores[contador].setId(entrada.nextInt());
                    
                    System.out.println("Digite el nombre:");
                    jugadores[contador].setNombre(entrada.next());
                    
                    System.out.println("Digite el apellido:");
                    jugadores[contador].setApellido(entrada.next());
                    
                    System.out.println("Digite el numero de la dorsal:");
                    jugadores[contador].setDorsal(entrada.nextInt());
                    
                    System.out.println("Digite la posicion:");
                    jugadores[contador].setPosicion(entrada.next());
                    
                    System.out.println("Digite la edad:");
                    jugadores[contador].setEdad(entrada.nextInt());
                    
                    System.out.println("Digite el equipo:");
                    jugadores[contador].setEquipo(entrada.next());
                    
                    contador ++;
                    break;
                    
                case 2:
                    
                    System.out.println("DIGITE EL ID DEL JUGADOR");
                    int id = entrada.nextInt();
                    for (int i=0; i<jugadores.length;i++){
                        if (id == jugadores[i].getId()) {
                        System.out.println(jugadores[i].getNombre());
                        System.out.println(jugadores[i].getApellido());
                        System.out.println(jugadores[i].getDorsal());
                        System.out.println(jugadores[i].getPosicion());
                        System.out.println(jugadores[i].getEdad());
                        System.out.println(jugadores[i].getEquipo());
                        break;
                        }else{
                        System.out.println("El id no esta registrado..."); 
                        break;
                    }
                    
                    }
                    
                    break;
                    
                case 3:
                    
                    System.out.println("DIGITE EL ID DEL JUAGDOR A MODIFICAR");
                    int idSearch = entrada.nextInt();
                    for (int i=0; i<jugadores.length;i++) {
                      if (jugadores[i].id == idSearch) {
                          
                        System.out.println("digite el nombre");
                        jugadores[i].nombre = entrada.next();
                        
                        System.out.println("digite el apellido");
                        jugadores[i].apellido = entrada.next();
                        
                        System.out.println("digite la dorsal");
                        jugadores[i].dorsal = entrada.nextInt();
                        
                        System.out.println("digite la pisicion");
                        jugadores[i].posicion = entrada.next();
                        
                        System.out.println("digite el edad");
                        jugadores[i].edad = entrada.nextInt();
                        
                        System.out.println("digite la equipo");
                        jugadores[i].equipo = entrada.next();
                        break;
                           }else{
                          System.out.println("El id no esta registrado...");
                          break;
                      }  
                    }  
                    break;
                    
                case 4:
                    
                    for (int i=0; i<jugadores.length;i++){
                        
                        System.out.println("JUGADORES CONVOCADOS");
                        System.out.println(jugadores[i].getNombre());
                        System.out.println(jugadores[i].getApellido());
                        System.out.println(jugadores[i].getDorsal());
                        System.out.println(jugadores[i].getPosicion());
                        System.out.println(jugadores[i].getEdad());
                        System.out.println(jugadores[i].getEquipo());
                        break;
                    
                    }
                    break;
                    
                case 5:
                      salir=true;                  
                    
                default:
                    System.out.println("Opcion no valida");
                    break;
            
            }                           
        }
    
    }
    
}
