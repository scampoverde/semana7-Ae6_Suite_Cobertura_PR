# Matriz de casos

| ID | Método | Escenario | Entrada | Esperado |
|----|---------|------------|----------|-----------|
| CP-01 | puedeCancelar | Normal | 5 | true |
| CP-02 | puedeCancelar | Límite | 2 | true |
| CP-03 | puedeCancelar | Debajo límite | 1 | false |
| CP-04 | puedeCancelar | Inválido | 0 | false |
| CP-05 | calcularTotal | NORMAL | NORMAL,100 | 100 |
| CP-06 | calcularTotal | VIP | VIP,100 | 85 |
| CP-07 | calcularTotal | ESTUDIANTE | ESTUDIANTE,100 | 90 |
| CP-08 | calcularTotal | Negativo | NORMAL,-1 | Exception |
| CP-09 | confirmar | Disponible | Reserva válida | CONFIRMADA |
| CP-10 | confirmar | No disponible | Reserva válida | Exception |
| CP-11 | confirmar | Nula | null | Exception |