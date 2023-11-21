package udea.festivos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import udea.festivos.entidades.Festivo;

/**
 * @author Tgl. Jhoan Villa.
 * Email: jhoan.echeverriv@udea.edu.co
 * @version Id: <b>festivos</b> 16/11/2023, 9:45 a. m.
 **/
@Repository
public interface IFestivoRepositorio  extends JpaRepository<Festivo, Long> {
}
