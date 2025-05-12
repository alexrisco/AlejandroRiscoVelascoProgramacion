package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3307/gestion";
    private static final String USER = "root";
    private static final String PASSWORD = ""; // Tu contraseña aquí
    private static Connection conexion = null;
    private static final Logger logger = Logger.getLogger(Conexion.class.getName());

    // Constructor privado para evitar instancias
    private Conexion() {
    }

    /**
     * Obtiene una conexión a la base de datos
     * @return Connection objeto de conexión
     * @throws SQLException si ocurre un error al conectar
     */
    public static Connection getConnection() throws SQLException {
        try {
            if (conexion == null || conexion.isClosed()) {
                //Class.forName("com.mysql.cj.jdbc.Driver"); // No longer needed for modern JDBC
                conexion = DriverManager.getConnection(URL, USER, PASSWORD);
                logger.log(Level.INFO, "Conexión establecida correctamente");
            }
            return conexion; // Return the connection here!
        } catch (SQLException ex) {
            logger.log(Level.SEVERE, "Error al establecer conexión", ex);
            throw new SQLException("No se pudo establecer la conexión a la base de datos", ex);
        }
    }

    /**
     * Cierra la conexión actual si está abierta
     */
    public static void cerrarConexion() {
        if (conexion != null) {
            try {
                if (!conexion.isClosed()) {
                    conexion.close();
                    logger.log(Level.INFO, "Conexión cerrada correctamente");
                }
            } catch (SQLException ex) {
                logger.log(Level.WARNING, "Error al cerrar la conexión", ex);
            } finally {
                conexion = null;
            }
        }
    }

    /**
     * Verifica el estado de la conexión
     * @return true si la conexión está activa, false en caso contrario
     */
    public static boolean verificarConexion() {
        try {
            return conexion != null && !conexion.isClosed() && conexion.isValid(2);
        } catch (SQLException ex) {
            logger.log(Level.WARNING, "Error al verificar conexión", ex);
            return false;
        }
    }
}
