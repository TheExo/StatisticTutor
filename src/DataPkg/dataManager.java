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
            case 60:
                info = "Frecuencia\n"
                        + "Número total de repeticiones de un dato o de un grupo de datos\n"
                        + "de una misma clase";
                break;
            case 61:
                info = "Porcentaje\n"
                        + "Número o cantidad que representa la proporcionalidad de una\n"
                        + "parte respecto a un total que se considera dividido en cien\n"
                        + "unidades.";
                break;
            case 70:
                info = "Característica\n"
                        + "Particularidad de la unidad estadística que es objeto de estudio.\n"
                        + "Se pueden analizar varias características para una misma unidad\n"
                        + "estadística. También se conocen con el nombre de variables.";
                break;
            case 71:
                info = "Dato\n"
                        + "Información concreta sobre hechos, elementos, etc., que\n"
                        + "permite estudiarlos, analizarlos o conocerlos.";
                break;
            case 72:
                info = "Frecuecia Absoluta\n"
                        + "La frecuencia absoluta es el número de veces que aparece\n"
                        + "un determinado valor en un estudio estadístico.";
                break;
            case 73:
                info = "Frecuencia Relativa\n"
                        + "Medida obtenida al dividir la frecuencia absoluta\n"
                        + "correspondiente entre el número totalde observaciones o datos";
                break;
            case 74:
                info = "Media Aritmética\n"
                        + "Cociente entre la suma de todos los datos y la cantidad\n"
                        + "de datos en una distribución";
                break;
            case 75:
                info = "Muestra\n"
                        + "Subconjunto representativo de la población.";
                break;
            case 76:
                info = "Variabilidad\n"
                        + "Corresponde a la dispersión que presentan los datos entre\n"
                        + "sí, en este sentido se encuentran conjuntos de datos más\n"
                        + "homogéneos o más heterogéneos. La variabilidad de los\n"
                        + "datos representa la esencia misma de la estadística, pues\n"
                        + "la razón de ser de esta disciplina consiste en determinar\n"
                        + "tendencias o patrones de comportamiento de los datos\n"
                        + "producto de su variabilidad.";
                break;
            case 77:
                info = "Variable\n"
                        + "Es un símbolo que representa un número de un conjunto\n"
                        + "dado de números";
                break;
            case 80:
                info = "Diagrama\n"
                        + "Dibujo o representación gráfica que sirve para\n"
                        + "representar u objeto, indica la  relación entre\n"
                        + "elementos o muetra el valor de una magnitud.";
                break;
            case 81:
                info = "Frecuencia Absoluta\n"
                        + "Es el número de veces que la variable cuantitativa\n"
                        + "continua toma valores comprendidos en un determinado\n"
                        + "intervalo de la clase";
                break;
            case 82:
                info = "Gráfica\n"
                        + "Objeto empleado para obtener una información más clara\n"
                        + "y atractiva de los datos y sus resultados obtenidos del\n"
                        + "análisis";
                break;
            case 83:
                info = "Medidas de Posición\n"
                        + "Valores miden la  posición de una distribución\n"
                        + "de frecuencias, es decir, al rededor de que valor\n"
                        + "se tienden a concentrar los datos";
                break;
            case 84:
                info = "Moda\n"
                        + "En una distribución de frecuencia, el valor\n"
                        + "más frecuente se denomina moda, cuando los datos vienen\n"
                        + "agrupados en intervalos, en lugar de moda se denomina\n"
                        + "intervalo modal.";
                break;
            case 85:
                info = "Recorrido\n"
                        + "Diferencia entre el mayor y menor valor.";
                break;
            case 90:
                info = "Dispersión\n"
                        + "Distanciamiento de un conjunto de datos respecto\n"
                        + "al valor medio";
                break;
            case 91:
                info = "Frecuencia Absoluta\n"
                        + "Es el número de veces que la variable cuantitativa\n"
                        + "continua toma valores comprendidos en un determinado\n"
                        + "intervalo de la clase";
                break;
            case 92:
                info = "Gráfica\n"
                        + "Objeto empleado para obtener una información más clara\n"
                        + "y atractiva de los datos y sus resultados obtenidos del\n"
                        + "análisis";
                break;
            case 93:
                info = "Moda\n"
                        + "En una distribución de frecuencia,el valor más\n"
                        + "frecuente se denomina moda, cuando los datos vienen\n"
                        + "agrupados en intervalos, en lugar de moda se denomina\n"
                        + "intervalo modal.";
                break;
            case 94:
                info = "Recorrido\n"
                        + "Diferencia entre el mayor y menor valor.";
                break;
            case 100:
                info = "Cuartiles\n"
                        + "Son tres valores denotados usualmente Q1,Q2,Q3,\n"
                        + "los cuales separan al conjunto de datos ordenados\n"
                        + "en cuatro partes iguales";
                break;
            case 101:
                info = "Media Aritmética\n"
                        + "Cociente entre la suma de todos los datos y la cantidad\n"
                        + "de datos en una distribución";
                break;
            case 102:
                info = "Media  Aritmética Ponderada\n"
                        + "Es una medida de tendencia central, que consiste en otorgar\n"
                        + "a cada observación del conjunto de datos unos pesos según la\n"
                        + "importancia de cada uno de ellos. Se obtiene al multiplicar\n"
                        + "cada uno de los datos por sus respectivos pesos para luego,\n"
                        + "sumarlos y obtener una suma ponderada, después se divide esta\n"
                        + "entre la suma de los pesos dando como resultado la media\n"
                        + "ponderada.";
                break;
            case 103:
                info = "Mediana\n"
                        + "Cuando se tienen n datos ordenados, la mediana M_e,\n"
                        + "puede pertenecer al conjunto de datos o estar\n"
                        + "entre los datos del conjunto. Por lo tanto existen\n"
                        + "dos posibles casos:\n\n"
                        + " Si n es par, entonces, n=2t, t>0 en este caso la media\n"
                        + "no pertenece al conjunto de datos y a la izquierda y a la\n"
                        + " derecha de ella hay t datos y se obtiene mediante la fórmula:\n"
                        + "M_e=(x_t+x_(t+1))/2\n\n"
                        + "Si n es impar, entonces, n=2t, t>0, en este caso la media\n"
                        + "pertenece al conjunto de datos y a la izquierda y a la derecha\n"
                        + "de ella hay t datos y se obtiene mediante la fórmula:\n"
                        + "M_e= x_(t+1)";
                break;
            case 104:
                info = "Moda\n"
                        + "En una distribución de frecuencia, el valor\n"
                        + "más frecuente se denomina moda, cuando los datos vienen\n"
                        + "agrupados en intervalos, en lugar de moda se denomina\n"
                        + "intervalo modal.";
                break;
            case 110:
                info = "Coeficiente de Variación\n"
                        + "El coeficiente de variación es la relación entre\n"
                        + "la desviación típica de una muestra y sumedia.";
                break;
            case 111:
                info = "Desviación Estándar\n"
                        + "Medida del grado de dspersión de los datos respecto\n"
                        + "a la media aritmética.";
                break;
            case 112:
                info = "Rango\n"
                        + "Diferencia entre el mayor y menor valor.";
                break;
            case 113:
                info = "Rango Intercuartílico\n"
                        + "Diferencia entre el tercer cuartil y el primer\n"
                        + "cuartil";
                break;
            case 114:
                info = "Variabilidad\n"
                        + "Corresponde a la dispersión que presentan los\n"
                        + "datos entre sí, en este sentido se encuentran\n"
                        + "conjuntos de datos más homogéneos o más heterogéneos.\n"
                        + "La variabilidad de los datos representa la esencia\n"
                        + "misma de la estadística, pues la razón de ser de esta\n"
                        + "disciplina consiste en determinar tendencias o patrones\n"
                        + "de comportamiento de los datos producto de su variabilidad.";
                break;
            case 115:
                info = "Varianza\n"
                        + "Es una medida de dispersión, una medida de cómo los\n"
                        + "valores de los datos pueden diferir de su media, la\n"
                        + "varianza es la media aritmética de los cuadrados de\n"
                        + "la  diferencia   de  los  valores  individuales menos\n"
                        + "la media.";
                break;
            default:
                info = "";
                break;  
        }
    }
    /*
    case 70:
        info = "";
        break;
    */
    public String getInfo() {
        return info;
    }
}
