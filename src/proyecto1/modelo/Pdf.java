package proyecto1.modelo;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.TabSettings;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

/**
 *
 * @author Cristopher Ureña D.
 * @author Calef Lopez B.
 * 
 * @version 1.0
 */
public class Pdf
{
    
    public static void crearPdfFactura(Factura factura, Empresa empresa)
    {
        Document documento = new Document();
        Cliente cliente = factura.getCliente();
        List<LineaDetalle> lineas = factura.getLineas();
        
        try
        {
            //codigo 
            PdfWriter.getInstance(documento, new FileOutputStream(String.format("../facturas/factura%d.pdf", factura.getCodigo())));
            documento.open();
            
            Paragraph nombreEmpresa = new Paragraph();
            nombreEmpresa.setFont(titulo);
            nombreEmpresa.setAlignment(Paragraph.ALIGN_CENTER);
            
            Paragraph ubicacionEmpresa = new Paragraph();
            ubicacionEmpresa.setFont(subcategoryFont);
            ubicacionEmpresa.setAlignment(Paragraph.ALIGN_CENTER);
            
            Paragraph telefonoEmpresa = new Paragraph();
            telefonoEmpresa.setFont(paragraphFont);
            
            Paragraph cedulaEmpresa = new Paragraph();
            cedulaEmpresa.setFont(paragraphFont);
            
            Paragraph fechaFactura = new Paragraph();
            fechaFactura.setFont(paragraphFont);
            
            Paragraph parrafoFactura = new Paragraph();
            parrafoFactura.setFont(paragraphFont);
            
            Paragraph parrafoNombreCliente = new Paragraph();
            parrafoNombreCliente.setFont(paragraphFont);
            
            Paragraph parrafoIdCliente = new Paragraph();
            parrafoIdCliente.setFont(paragraphFont);
            
            Paragraph parrafoSubtotal = new Paragraph();
            parrafoSubtotal.setFont(paragraph);
            
            Paragraph parrafoTotal = new Paragraph();
            parrafoTotal.setFont(paragraph);
            
            Paragraph parrafoIva = new Paragraph();
            parrafoIva.setFont(paragraph);
           
            nombreEmpresa.add(empresa.getNombre());
            documento.add(nombreEmpresa);
            
            ubicacionEmpresa.add(empresa.getUbicacion());
            documento.add(ubicacionEmpresa);
            
            documento.add(new Paragraph(" "));
            
            telefonoEmpresa.add(String.format("Télefono: %d", empresa.getTelefono()));
            documento.add(telefonoEmpresa);
            
            cedulaEmpresa.add(String.format("Cédula:%d", empresa.getNumeroId()));
            documento.add(cedulaEmpresa);

//            fechaFactura.add();
//            documento.add(fechaFactura);
            parrafoFactura.add("Factura electronica:");
            parrafoFactura.setTabSettings(new TabSettings(320f));
            parrafoFactura.add(Chunk.TABBING);
            parrafoFactura.add(String.format("%d", factura.getCodigo()));
            documento.add(parrafoFactura);
            
            documento.add(new Paragraph(" "));
            documento.add(new Paragraph(" "));
            
            parrafoNombreCliente.add("Cliente: ");
            parrafoNombreCliente.setTabSettings(new TabSettings(100f));
            parrafoNombreCliente.add(Chunk.TABBING);
            parrafoNombreCliente.add(cliente.getNombre());
            documento.add(parrafoNombreCliente);
            
            parrafoIdCliente.add("Cédula:");
            parrafoIdCliente.setTabSettings(new TabSettings(100f));
            parrafoIdCliente.add(Chunk.TABBING);
            parrafoIdCliente.add(cliente.getId());
            documento.add(parrafoIdCliente);
            
            documento.add(new Paragraph(" "));
            documento.add(new Paragraph(" "));
            
            PdfPTable tabla = new PdfPTable(2);
            tabla.getDefaultCell().setBorder(0);
            
            Producto p;
            for (LineaDetalle linea : lineas)
            {
                p = linea.getProducto();
                tabla.addCell(p.getDescripcion());
                tabla.addCell(String.format("%3.2f", p.getPrecio()));
                
            }
            
            documento.add(tabla);
            
            documento.add(new Paragraph(" "));
            parrafoSubtotal.setTabSettings(new TabSettings(200));
            parrafoSubtotal.add(Chunk.TABBING);
            parrafoSubtotal.add(String.format("Subtotal:    %3.2f", factura.subTotal()));
            documento.add(parrafoSubtotal);
            
            parrafoTotal.setTabSettings(new TabSettings(200));
            parrafoTotal.add(Chunk.TABBING);
            parrafoTotal.add(String.format("Total:         %3.2f", factura.total()));
            documento.add(parrafoTotal);
            
            parrafoIva.setTabSettings(new TabSettings(200));
            parrafoIva.add(Chunk.TABBING);
            parrafoIva.add(String.format("Iva:            %3.2f", factura.totalIva()));
            documento.add(parrafoIva);
            
            documento.close();
        } catch (FileNotFoundException | DocumentException ex)
        {
            
        }
    }
    
    private static final Font chapterFont = FontFactory.getFont(FontFactory.HELVETICA, 26, Font.BOLDITALIC);
    private static final Font paragraphFont = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.NORMAL);
    private static final Font paragraph = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD);
    
    private static final Font titulo = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
    private static final Font subcategoryFont = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.NORMAL);
    private static final Font blueFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.RED);
    private static final Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
}
