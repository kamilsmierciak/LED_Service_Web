package pl.ies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ies.entity.Hardware;

public interface HardwareRepository extends JpaRepository<Hardware, String>{
    Hardware findFirstBySerial(String Serial);
}
