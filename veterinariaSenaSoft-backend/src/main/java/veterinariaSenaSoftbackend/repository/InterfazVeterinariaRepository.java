package veterinariaSenaSoftbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import veterinariaSenaSoftbackend.commons.Entity.CitasVeterinariaEntity;

public interface InterfazVeterinariaRepository extends JpaRepository<CitasVeterinariaEntity, Integer>
{

}
