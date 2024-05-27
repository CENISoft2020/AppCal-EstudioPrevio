import java.util.HashMap;

public class ModuloCalificacion {

    public static int calcularCalificacion(String textoModulo) {
        // Puntajes para cada criterio
        HashMap<String, Integer> puntajes = new HashMap<>();
        puntajes.put("Modalidad de Selección", 0);
        puntajes.put("Coordinación y Justificación", 0);
        puntajes.put("Desarrollo del Contenido", 0);
        puntajes.put("Análisis de Alternativas en el Mercado", 0);
        puntajes.put("Verificación en el Plan Anual de Adquisiciones", 0);
        puntajes.put("Detalles del Objetivo y Proyecto", 0);

        // Evaluación del texto del módulo
        if (textoModulo.contains("redactándose en infinitivo")) {
            puntajes.put("Modalidad de Selección", 20);
        }
        if (textoModulo.contains("colaboración entre el área solicitante y el Líder Experto en Contratación")) {
            puntajes.put("Coordinación y Justificación", 20);
        }
        if (textoModulo.contains("marco legal y la competencia funcional")) {
            puntajes.put("Desarrollo del Contenido", 20);
        }
        if (textoModulo.contains("opciones existentes para resolver la necesidad")) {
            puntajes.put("Análisis de Alternativas en el Mercado", 20);
        }
        if (textoModulo.contains("necesidad está prevista y aprobada en el Plan Anual de Adquisiciones")) {
            puntajes.put("Verificación en el Plan Anual de Adquisiciones", 10);
        }
        if (textoModulo.contains("Descripción detallada del objetivo y proyecto")) {
            puntajes.put("Detalles del Objetivo y Proyecto", 10);
        }

        // Calcular la calificación total
        int totalPuntaje = puntajes.values().stream().mapToInt(Integer::intValue).sum();
        return totalPuntaje;
    }

    public static void main(String[] args) {
        // Ejemplo de texto del módulo 1
        String textoModuloEjemplo = """
                Modalidad de Selección:
                Debe aplicarse a todas las modalidades de selección, redactándose en infinitivo (dar, hacer, entregar).
                
                Coordinación y Justificación:
                El área solicitante del bien o servicio debe coordinarse con el Líder Experto en Contratación. La colaboración entre diferentes áreas de la Agencia es clave para la justificación de la modalidad de selección.
                
                Desarrollo del Contenido:
                Debe indicar el marco legal y la competencia funcional de la dependencia u oficina que requiere el bien o servicio.
                
                Análisis de Alternativas en el Mercado:
                Debe señalar las opciones existentes para resolver la necesidad, incluyendo un análisis de las diferentes alternativas frente a costos, beneficios y desventajas.
                
                Verificación en el Plan Anual de Adquisiciones:
                Debe verificarse que la necesidad está prevista y aprobada en el Plan Anual de Adquisiciones.
                
                Detalles del Objetivo y Proyecto:
                Debe indicarse detalladamente el objetivo y proyecto atendido con el proceso de selección, incluyendo análisis de conveniencia, oportunidad y motivos que sustentan la contratación, así como la labor misional o de apoyo a la misión que se satisface.
                """;

        // Calcular la calificación para el texto de ejemplo
        int calificacion = calcularCalificacion(textoModuloEjemplo);
        System.out.println("Calificación del módulo 1: " + calificacion);
    }
}
