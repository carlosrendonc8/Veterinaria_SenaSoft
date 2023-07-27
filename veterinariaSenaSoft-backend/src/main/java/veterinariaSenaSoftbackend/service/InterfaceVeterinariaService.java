package veterinariaSenaSoftbackend.service;

import org.springframework.http.ResponseEntity;
import veterinariaSenaSoftbackend.commons.Entity.CitasVeterinariaEntity;

public interface InterfaceVeterinariaService
{
    public CitasVeterinariaEntity crearCita(CitasVeterinariaEntity citasVeterinariaEntity);
}
