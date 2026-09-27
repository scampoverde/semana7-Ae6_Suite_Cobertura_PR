# Plantilla de Pull Request

## Objetivo

Proteger las reglas críticas del sistema de reservas mediante una suite de pruebas automatizadas con JUnit 5.

## Cambios realizados
 
Casos normales
- Casos límite
- Casos inválidos
- Excepciones
- Uso de Stub y Mock 
- Cobertura JaCoCo

## Cómo verificar

```bash
mvn clean test
```
## Cobertura

Se obtuvo cobertura superior al 90%.
Se verificaron reglas de cancelación, descuentos y confirmación.

## Limitaciones

No se probaron integraciones reales con sistemas externos

## Autorrevisión
- [ ] Compila
- [ ] Pruebas en verde
- [ ] Sin archivos accidentales
- [ ] Commits descriptivos
- [ ] Documentación actualizada

## Uso de IA

Se utilizó Microsoft 365 Copilot como apoyo para revisión técnica, generación de ideas de pruebas y documentación
