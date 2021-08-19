package utomisiontic.c2.reto4.controller;


import java.sql.SQLException;
import java.util.ArrayList;

import utomisiontic.c2.reto4.model.dao.RequerimientoDao_1;
import utomisiontic.c2.reto4.model.dao.RequerimientoDao_2;
import utomisiontic.c2.reto4.model.dao.RequerimientoDao_3;
import utomisiontic.c2.reto4.model.vo.Requerimiento_1;
import utomisiontic.c2.reto4.model.vo.Requerimiento_2;
import utomisiontic.c2.reto4.model.vo.Requerimiento_3;

public class ControllerRequerimientos {
    private final RequerimientoDao_1 requerimientoDao_1 =new RequerimientoDao_1();
    private final RequerimientoDao_2 requerimientoDao_2 =new RequerimientoDao_2();
    private final RequerimientoDao_3 requerimientoDao_3 =new RequerimientoDao_3();
    
    public ArrayList<Requerimiento_1> ConsultaRequerimiento_1() throws SQLException{
        return this.requerimientoDao_1.requerimiento1();
            
    }  
    public ArrayList<Requerimiento_2> consultaRequerimiento_2() throws SQLException {
        return this.requerimientoDao_2.requerimiento2();
    
    }
    public ArrayList<Requerimiento_2> consultaRequerimiento_2(String fIni, String fFin, String nCiu) throws SQLException {
        return this.requerimientoDao_2.requerimiento2(fIni,fFin,nCiu);
    }
    
    public ArrayList<String> consultaObtenerCiudades() throws SQLException {
        return this.requerimientoDao_2.obtenerCiudades();
    }


    public ArrayList<Requerimiento_3> consultaRequerimiento_3() throws SQLException{
        return this.requerimientoDao_3.requerimiento3();
    }
}
