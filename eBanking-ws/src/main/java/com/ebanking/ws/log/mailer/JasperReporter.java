package com.ebanking.ws.log.mailer;

import com.ebanking.ws.log.mailer.model.Mail;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Creates PDF report about actions(download, upload, delete) which was performed on FTP server by some user.
 *
 * @author: AS
 */
public class JasperReporter {

    /**
     * Creates PDF report and returns it in <code>byte[]<code/>.
     *
     * @param list data source for report generation
     * @return PDF file represented by <code>byte[]</code>
     */
    public static String generateJasperReport(List<Mail> list) {
        try {

            URL url = JasperReporter.class.getClassLoader().getResource("jasperTemplate.xml");

            JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(list);

            Map parameters = new HashMap();
            JasperDesign jasperDesign = JRXmlLoader.load(url.openStream());
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, beanColDataSource);

            JasperExportManager.exportReportToHtmlFile(jasperPrint, "temp.html");
            BufferedReader in = new BufferedReader( new FileReader( "temp.html" ));

            String htmlText = "";
            String str;
            while ( (str = in.readLine()) != null ) {
                htmlText += str;
            }
            in.close();
            return htmlText;
            //return JasperExportManager.exportReportToPdf(jasperPrint);


        } catch (JRException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}