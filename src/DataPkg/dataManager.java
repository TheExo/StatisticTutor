/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataPkg;

import java.util.ArrayList;

/**
 *
 * @author ignacio
 */
public class dataManager {
    private final String info;
    public dataManager(int selector){
        switch(selector){
            case 10:
                info = "Dato\n"
                        + "Información concreta sobre hechos, elementos, etc.,\n"
                        + "que permite estudiarlos, analizarlos o conocerlos.\n\n"
                        + "Dato Cualitativo\n"
                        + "Información concreta sobre hechos, elementos, etc.,\n"
                        + "que permite estudiarlos, analizarlos o conocerlos.\n\n"
                        + "Dato Cuantitativo\n"
                        + "Es  aquel  dato numérico  que  representa  aspectos  de\n"
                        + "una  muestra  o  una  población  que  es  medible  o  \n"
                        + "que  se  pede  contar";
                break;
            case 11:
                info = "Interrogación\n"
                        + "Enunciado interrogativo que se emite con la intención de\n"
                        + "conocer algo u obtener alguna información que se espera\n"
                        + "de la persona a la que se dirige.";
                break;
            case 12:
                info = "Variabilidad\n"
                        + "Enunciado interrogativo que se emite con la intención de\n"
                        + "conocer algo u obtener alguna información que se espera\n"
                        + "de la persona a la que se dirige.";
                break;
            case 20:
                info = "Variabilidad\n"
                        + "Corresponde a la dispersión que presentan los datos\n"
                        + "entre sí, en este sentido se encuentran conjuntos de\n"
                        + "datos más homogéneos o más heterogéneos. La variabilidad\n"
                        + "de los datos representa la esencia misma de la estadística,\n"
                        + "pues la razón de ser de esta disciplina consiste en\n"
                        + "determinar tendencias o patrones de comportamiento de los\n"
                        + "datos producto de su variabilidad.";
                break;
            case 30:
                info = "Interrogación\n"
                        + "Enunciado interrogativo que se emite con la intención de\n"
                        + "conocer algo u obtener alguna información que se espera\n"
                        + "de la persona a la que se dirige.";
                break;
            case 40:
                info = "Madición\n"
                        + "Incluye la comprensión y manipulación de unidades, sistemas\n"
                        + "y procesos de medición del espacio y el tiempo, el uso de\n"
                        + "herramientas y fórmulas para efectuar las medidas. ";
                break;
            case 50:
                info = "Gráfica\n"
                        + "Es un dibujo utilizado para representar la información\n"
                        + "recolectada, que tienen entre otras funciones:\n"
                        + "• Hacer visibles los datos que representa.\n"
                        + "• Mostrar los posibles cambios de esos datos en el tiempo y en\n"
                        + "  el espacio.\n"
                        + "• Evidenciar las relaciones que pueden existir en los datos\n"
                        + "  que representa.\n"
                        + "• Sistematizar y sintetizar los datos.\n"
                        + "• Aclarar y complementar las tablas y las exposiciones teóricas\n"
                        + "  o cuantitativas.";
                break;
            case 51:
                info = "Muestra\n"
                        + "Es una parte o subconjunto de la población que se selecciona\n"
                        + "para realizar análisis estadísticos. Se pretende que la muestra\n"
                        + "sea lo más representativa posible de la población, por lo que\n"
                        + "existen métodos especializados para realizar la escogencia de\n"
                        + "la muestra";
                break;
            default:
                info = "";
                break;  
        }
    }

    public String getInfo() {
        return info;
    }
}
