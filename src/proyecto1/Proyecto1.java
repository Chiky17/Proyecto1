package proyecto1;

import java.io.FileNotFoundException;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import proyecto1.control.ControlAplicacion;
import proyecto1.modelo.Empresa;
import proyecto1.vista.VentanaAplicacion;

/**
 *
 * @author Cristopher Ureña D.
 * @author Calef Lopez B.
 * 
 * @version 1.0
 */
public class Proyecto1
{
    public static void main(String[] args)
    {
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JFrame.setDefaultLookAndFeelDecorated(true);
        } catch (ClassNotFoundException
                | IllegalAccessException
                | InstantiationException
                | UnsupportedLookAndFeelException ex)
        {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }

        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                mostrarInterfaz();

            }

        });
    }

    public static void mostrarInterfaz()
    {
        Empresa e;
        try
        {
            e = Empresa.cargarEmpresa("../datos.xml");

        } catch (FileNotFoundException ex)
        {
            System.err.printf("Excepcion: %s%n", ex.getMessage());
            e = new Empresa();
        }

        ControlAplicacion control = new ControlAplicacion(e);
        VentanaAplicacion ventana = new VentanaAplicacion(control);
        ventana.init();
    }

}
