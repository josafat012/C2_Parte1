package com.upchiapas.proyect;

import com.upchiapas.proyect.models.OrdenCompra;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrdenCompra pedidos = new OrdenCompra();
        int index = 0;

        Scanner sc = new Scanner(System.in);
        int opc=0;
        do {
            System.out.println("\n==Escoge una opcion==\n1. Generar compra\n2. Reportes\n3.Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    pedidos.compras();
                    System.out.println("¡Orden generada!");
                    index++;
                    break;
                case 2:
                    for (int i=0;i<index;i++) {
                        System.out.println(pedidos.compras().get(i));
                    }
                    break;
            }
        }while (opc!=3);
    }
}
