package com.mycompany.dispositivoses;


import java.util.Scanner;


/**
 *
 * @author
 * 
 */
public class DispositivosES {
    
///**************-----------------MICROPROCESADOR-----------------**************///
    public static void main(String[] args) throws Exception{
        
        //Los int que declaramos es para ejecutar el comando de opcion multiple del switch y while...
        int num;
        int sn;
        int numArray = 3;
        
        
        //El string declarado como sino, es para preguntar si desea agregar otro dispositivo de interrupcion...
        String sino;
        
        //El string anim, es para la animacion de carga cuando se agrega o ejecuta el comando del dispositivo...
        String anim;
        
        //DispositivosEntradaSalida se manda a llamar a la clase para poder guardar los nombres de cada dispositivo
        // y volver a utilizarlos...
        Memoria eys;
        MemoriaArray es;
        Estado mnd;
        
        //Matriz...
        MemoriaArray array[] = new MemoriaArray[numArray];
        //Es el nombre de la variable para poder guardar el nombre temporalmente 
        //y mandarlo a la clase Memoria
        String nombredisp;
        String nombredisparray;
        
        //Elegir opciones...
        Scanner leer = new Scanner(System.in); 
        Scanner opt = new Scanner(System.in);
        
        //Dispositivo de entrada...
        Scanner disp = new Scanner(System.in);
        Scanner disparray = new Scanner(System.in);
        
        //Setencia if Si o no...
        Scanner siono = new Scanner(System.in);
        
        
        // Inicio del programa y toda la informacion que pide el mismo programa...
        
        
        
        //-----------------------------------PROGRAMA-------------------------------------------------//
        
        System.out.println("Dispositivo de Entrada y Salida"); //Nombre o titulo del programa...
        System.out.println("Ingresar la opcion que desea ejecutar");//Pregunta que opcion desea ejecutar...
        //Decoracion para separar los apartados y se vea mas organizado...
        System.out.println("///----------------------------------------///");
        //Opciones del programa...
        System.out.println("(1) E/S Programada");        
        System.out.println("(2) E/S por Interrupcion");
        System.out.println("(3) E/S por DMA");
        System.out.println("Elija una opcion:"); 
            num= leer.nextInt(); // Se declara un int llamado num para poner la opcion que el usuario eligio
        
        /**Declaramos un while para poder repetir la pregunta en dado caso que el usuario 
        ***llegue anotar un numero incorrecto o fuera del rango establecido...*/
        while(num > 3){
            System.out.println("///---------------------------------------------------------///");
            System.out.println("¡ERROR! al seleccionar un numero, favor de elegir del 1 al 3");
            System.out.println("Dispositivo de Entrada y Salida");
            System.out.println("Ingresar la opcion que desea ejecutar");
            System.out.println("///----------------------------------------///");
            System.out.println("(1) E/S Programada");
            System.out.println("(2) E/S por Interrupcion");
            System.out.println("(3) E/S por DMA");
            System.out.println("Elija una opcion:"); 
                num= leer.nextInt();
                }
            //Aqui declaramos un swich para que cuando ingrese el numero te genere la informacion
            //y te muestre las opciones del numero seleccionado...
            switch(num){
                
            //**************----------------E/S PROGRAMADA----------------**************//
            case 1: //opcion 1
                
                System.out.println("E/S Programada");//Titulo...
                
                do{//DO-WHILE es para hacer el bucle o ciclo para ingresar los dispositvos de E/S
                    System.out.println("\nIngresar un dispositivo de Entrada y/o Salida:");
                    nombredisp = disp.nextLine();
                
                    eys = new Memoria(nombredisp);
                //Animacion de pantalla de carga de los dispositivos
                System.out.println("Cargando Dispositivo...");
                anim= "###";
                for (int x=0; x < 100; x++){
                    String data = "\n" + anim.charAt(x % anim.length()) + "--" + x + "%";
                    System.out.write(data.getBytes());
                    Thread.sleep(100);
                               }
                System.out.println("\n#--100%-Carga Completa...");
                System.out.println("Dispositivo: ---" + eys.GetNombredisp() + "--- Cargado...");
                System.out.println("¿Desea ingresar otro dispostivo de Entrada y/o Salida?");
                System.out.println("Elija una opcion: ");
                System.out.println("(1) Si");
                System.out.println("(2) No (Salir)");
                    sn = opt.nextInt();    
                }while(sn != 2);
                //Imprime un mensaje donde todos los dispositivos fueron cargados
                    System.out.println("Todos los Dispositivos de Entrada y Salida fueron Cargados Correctamente");
                    opt.close();
    
                    break;
                    
            //**************----------------E/S INTERRUPCION----------------**************//    
            case 2:// opcion 2
                System.out.println("E/S por Interrupcion");
                System.out.println("\nIngresar un dispositivo de Entrada y/o Salida:");
                    nombredisp = disp.nextLine();
                
                //Instanciamos un objeto de tipo dispositivos...
                eys = new Memoria(nombredisp);
                
                //Animacion de carga 
                System.out.println("Cargando Dispositivo...");
                anim= "###";
                for (int x=0; x < 100; x++){
                    String data = "\n" + anim.charAt(x % anim.length()) + "--" + x + "%";
                    System.out.write(data.getBytes());
                        Thread.sleep(100);
                               }
                System.out.println("\n#--100%-Carga Completa...");
                //Muestra los dispositivos cargados de primer instancia...
                System.out.println("Dispositivo: ---" + eys.GetNombredisp() + "--- Cargado...");
                
                System.out.println("¿Desea ingresar o sobreescribir el dispostivo anterior de Entrada y/o Salida?");
                    sino = siono.nextLine();
                //Aqui pregunta si deseas agregar otro dispostivo para hacer la interrupcion del dispositivo anterior
                if (sino.equals("si") || sino.equals("no")){
                    //Imprimimos el dispositivo anterior
                    System.out.println("¡ERROR!Conexion del dispositivo "+ eys.GetNombredisp() +" interrumpida");
                    System.out.println("\nIngresar un dispositivo de Entrada y/o Salida:");
                        nombredisp = disp.nextLine();
                        
                        //Instanciamos un objeto de tipo Memoria...
                        eys = new Memoria(nombredisp);
                
                System.out.println("Cargando Dispositivo...");
                //Animacion o simulacion de carga de dispositvos
                anim= "###";
                for (int x=0; x < 100; x++){
                    String data = "\n" + anim.charAt(x % anim.length()) + "--" + x + "%";
                    System.out.write(data.getBytes());
                        Thread.sleep(100);
                               }
                System.out.println("\n#--100%-Carga Completa...");
                System.out.println("Dispositivo: ---" + eys.GetNombredisp() + "--- Cargado...");
                    
                }else{
                    
                    System.exit(0);
                
                };
                    break;
            
            //**************----------------E/S DMA----------------**************//        
            case 3: //opcion 3
                System.out.println("E/S por DMA");
                
                do{
                    
                    for (int i=0; i<array.length; i++){
                    System.out.println("\nIngresar un dispositivo de Entrada y/o Salida:");
                        nombredisparray = disparray.nextLine();
                        
                    //Instanciamos un objeto de tipo MemoriaArray para almacenar en un Array
                    //de tipos vector los dispositivos 
                        array[i] = new MemoriaArray(nombredisparray);
                    
                
                //Animacion o simulacion de carga de dispositvos
                System.out.println("Cargando Dispositivo...");
                anim= "###";
                for (int x=0; x < 100; x++){
                    String data = "\n" + anim.charAt(x % anim.length()) + "--" + x + "%";
                    System.out.write(data.getBytes());
                        Thread.sleep(100);
                               }
                        //Instanciamos un objeto de tipo MemoriaArray...
                        es = new MemoriaArray(nombredisparray);
                //Decalaramos una println para que nos muestre el 100% porque el for donde declaramos la animacion llega solo a 99
                System.out.println("\n#--100%-Carga Completa...");
                System.out.println("Dispositivo: ---" + es.GetNombredispArray() + "--- Dispositivo Cargado...");
                                        }
                    
                System.out.println("¿Desea sobreescribir los dispostivo existentes?");
                System.out.println("Elija una opcion: ");
                System.out.println("(1) Si");
                System.out.println("(2) No (Validar la carga correcta de los dispositivos)");
                    sn = opt.nextInt(); 
                      
                }while(sn != 2);
                
                    //Imprime los datos guardados en el MemoriaArray
                    for (int i=0; i<array.length; i++){
                        
                        //Instanciamos un objeto de tipo Estado para que simule la conexion de cada dispositivo...
                        mnd = new Estado();
                        
                        //Imprimimos los dispositivos guardados en el array y el estado en el que se encuentran
                        System.out.println(" Dispositivo: --- " + array[i].GetNombredispArray()+ " --- ("+ mnd.GetAleatorio() +")...");
                    
                    }
                    opt.close();
                        break;
        } 
    }
}
