package edu.uees.testing.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.uees.testing.availability.DisponibilidadClient;
import edu.uees.testing.notification.Notificador;
import edu.uees.testing.repository.ReservaRepository;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

/**
 * Punto de partida.
 * El estudiante debe ampliar esta suite durante las actividades.
 */
class ReservaServiceTest {

    @Test
    void entornoJUnitFunciona() {
        assertTrue(true);
    }


    private DisponibilidadClient disponibilidad;
    private ReservaRepository repository;
    private Notificador notificador;

    private ReservaService service;

    @BeforeEach
    void setup() {
        disponibilidad = mock(DisponibilidadClient.class);
        repository = mock(ReservaRepository.class);
        notificador = mock(Notificador.class);

        service = new ReservaService(
                disponibilidad,
                repository,
                notificador);
    }


    @Test
    void cincoHorasPermitenCancelar() {
        assertTrue(service.puedeCancelar(5));   
    }

    @Test
    void dosHorasPermitenCancelar() {
        assertTrue(service.puedeCancelar(2));
    }

    @Test
    void unaHoraNoPermiteCancelar() {
        assertFalse(service.puedeCancelar(1));
    }

    @Test
    void ceroHorasNoPermiteCancelar() {
        assertFalse(service.puedeCancelar(0));
    }
}
