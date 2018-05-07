/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author pc
 */
import java.sql.Connection;/*esta importacion es la que conecta los datos guardados en el programa*/
import java.sql.PreparedStatement;//*esta es la  prepar la conexion */
import java.sql.ResultSet;/* esta libreria sirve para corre la consulta cuando se hace una busqueda */
import java.sql.SQLException; /*esta libreria  funciona para mostrar un error cuando 
no tenes uso de conexion o cuando la busqueda o proceso que has hecho no funciona*/
import javax.swing.JOptionPane; 
/*esta libreria es solo confunciones esteticas ya que con la funcion "OptionPane.showMessageDialog" 
podemos mostrar un mensaje con mejor diseño*/
import javax.swing.table.DefaultTableModel; /* esta libreria la escogí porque todos los datos de la persona necesitamos mostrarla y guardarla en una tabla 
entonces por eso se importa para poder hacer uso de una tabla */



/**
 *
 * @author Acer
 */
public class piso {
    /*Declaración de variables*/
    
    private String Nombre;
    private String id;
    private String Estado;

    public piso() {
        /*Declaramos el constructor*/
        System.out.println("acceso correctamente");
        /*este mensaje informara si el acceso fue correcto */
        
    }
/*Metodo piso*/
/*nose guarda las variables y los datos que necesarios.*/
    public piso(String Nombre, String Id, String Estado) {
        this.Nombre = Nombre;
        
        this.id = Id;
        this.Estado = Estado;
    }
    
    
    
    
/*En 
    
    /*creamos una tabla*/
    /*esto nos lo permite la libreria javax.swing.table.DefaultTableModel;*/
DefaultTableModel ModeloTabla;    
public void Buscar(String Id, String Nombre, String Estado){
    /*se llaman las varibles utiles para retornar
     los datos que s reciben despues de ejecutarse*/
    

    String [] columnas={"Id","Nombre","Estado"};/*se crean las columnas de nuestra tabla con estos nombres*/
    String [] registro=new String[2];/*creamos 3 filas hacia abajo ya que va en el orden de 0,1,2*/
    ModeloTabla=new DefaultTableModel(null,columnas);/*mandamos a llamar  la tabla creada arriba para que se creee en este instante*/   
    
    /*Variables del segundo proceso*/
    String SSQL;
    Connection conect = null;
    String tabla;
    
    /*aca comensamos con la busqueda ose que es el ID en las otras pantallas de tus compañeras
    tienes que crear un campo llamado Id para que cuando ese id se ingrese te haga la busqueda 
    de lo que vos queres ya sea el cliente este caso o el piso 
    las dos maneras te busca en esta opcion */
    
    /* Se comienza la busqueda */
    /*se debe de crar un campo llamado ID, asi cuando se ingrese ID ya sea del
    cliente o del piso los busque*/
    if(Id.equals("Id")){
    /* se ingresa el ID segun el campo creado anteriormente*/
   /*aca se ingresa el id que te dije que tiene que crear un campo tus compañeras
    en la pantalla para que se venga para aca*/
    
        SSQL= "SELECT Id "
                 + "FROM piso WHERE Estado LIKE '%"+Estado+"%'";
        /* se crean los comandos, se selecciona el ID y se buscan en los datos almacenados*/
      
        
        System.out.println("Busqueda efectuada correctamente "+Estado);
        /*se muestra el estado de piso o del cliente*/
        
        /*aca te muestra la busqueda ya realizada del estado del piso y su fuera solo el cliente
        pues seria de la misma manera con todos sus datos ya que por medio del id podes buscar lo 
        que queras*/
        

         
    try {
        /*se utiliza la libreria java.sql.SQLException; muestra los errores */

       
        PreparedStatement st = conect.prepareStatement(SSQL);/* preparamos la conexion de datos*/
        ResultSet rs = st.executeQuery();/*comenzamos la busqueda de datos*/

        while (rs.next()){
        /* si los datos buscados con correctos e iguales a Id en 
        la posicion 0 y Nombre en la pocision 1 y estado en la pocision 2, pasara a 
         insertar los datos a la tabla que es el control de todos tus clientes*/
          
            registro[0]=rs.getString("Id");
            registro[1]=rs.getString("Nombre");
            registro[2]=rs.getString("Estado");
     
          
            ModeloTabla.addRow(registro);
           
        }
        
       

    } catch (SQLException e) {
        
        /*se muestra un mensaje mas grafico de si la busqueda era correcta*/
        JOptionPane.showMessageDialog(null, e, "Error de busqueda no encontrado", JOptionPane.ERROR_MESSAGE);
    
    
    }finally{
    /*se realiza una prueba y si esta correcto no muestra el mensaje    */

        if(conect!=null){
        
            try {

                conect.close();

            } catch (SQLException ex) {
                  /*Si algo sale mal, te mostrará "Error de conexion*/
                JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);

            }
        
        }
        
    }
    
        
        
        
        
    
    }
    
    
}

    /*METODOS get y set*/
    
    /*Metodos GetSet
    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the Estado
     */
    public String getEstado() {
        return Estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
}
