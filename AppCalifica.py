def calcular_calificacion(texto_modulo):
    # Puntajes para cada criterio
    puntajes = {
        "Modalidad de Selección": 0,
        "Coordinación y Justificación": 0,
        "Desarrollo del Contenido": 0,
        "Análisis de Alternativas en el Mercado": 0,
        "Verificación en el Plan Anual de Adquisiciones": 0,
        "Detalles del Objetivo y Proyecto": 0
    }

    # Evaluación del texto del módulo
    if "redactándose en infinitivo" in texto_modulo:
        puntajes["Modalidad de Selección"] = 20
    if "colaboración entre el área solicitante y el Líder Experto en Contratación" in texto_modulo:
        puntajes["Coordinación y Justificación"] = 20
    if "marco legal y la competencia funcional" in texto_modulo:
        puntajes["Desarrollo del Contenido"] = 20
    if "opciones existentes para resolver la necesidad" in texto_modulo:
        puntajes["Análisis de Alternativas en el Mercado"] = 20
    if "necesidad está prevista y aprobada en el Plan Anual de Adquisiciones" in texto_modulo:
        puntajes["Verificación en el Plan Anual de Adquisiciones"] = 10
    if "Descripción detallada del objetivo y proyecto" in texto_modulo:
        puntajes["Detalles del Objetivo y Proyecto"] = 10

    # Calcular la calificación total
    total_puntaje = sum(puntajes.values())
    return total_puntaje

# Ejemplo de texto del módulo 1
texto_modulo_ejemplo = """
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
"""

# Calcular la calificación para el texto de ejemplo
calificacion = calcular_calificacion(texto_modulo_ejemplo)
print("Calificación del módulo 1:", calificacion)
