package udea.festivos.entidades;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author Tgl. Jhoan Villa.
 * Email: jhoan.echeverriv@udea.edu.co
 * @version Id: <b>festivos</b> 16/11/2023, 9:45 a. m.
 **/
@Entity
public class Tipo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_tipo")
    @GenericGenerator(name = "secuencia_tipo", strategy = "increment")
    @Column(name = "id")
    private int id;

    @Column(name = "tipo", length = 100, unique = true)
    private String tipo;

    public Tipo(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public Tipo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
