package veterinariaSenaSoftbackend.service.implement;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import veterinariaSenaSoftbackend.commons.Entity.CitasVeterinariaEntity;
import veterinariaSenaSoftbackend.repository.InterfazVeterinariaRepository;
import veterinariaSenaSoftbackend.service.InterfaceVeterinariaService;

@Component
public class VeterinariaService implements InterfaceVeterinariaService
{
    private final InterfazVeterinariaRepository InterfazVeterinariaRepository;

    public VeterinariaService(veterinariaSenaSoftbackend.repository.InterfazVeterinariaRepository interfazVeterinariaRepository) {
        InterfazVeterinariaRepository = interfazVeterinariaRepository;
    }

    @Override
    public CitasVeterinariaEntity crearCita(CitasVeterinariaEntity citasVeterinariaEntity)
    {
        System.out.println("Enviar Datos" + citasVeterinariaEntity.getNombreAnimal());
        return this.InterfazVeterinariaRepository.save(citasVeterinariaEntity);
    }
}
