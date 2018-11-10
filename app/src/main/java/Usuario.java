import java.util.Date;

public class Usuario {
    private String nombre;
    private Boolean sexo;
    private Date nacimiento;
    private String curp;
    private String domicilio;

    public Usuario(String nombre, Boolean sexo, Date nacimiento, String curp, String rfc, String domicilio){
        this.nombre=nombre;
        this.sexo=sexo;
        this.nacimiento=nacimiento;
        this.curp=curp;
        this.domicilio=domicilio;
    }
}
