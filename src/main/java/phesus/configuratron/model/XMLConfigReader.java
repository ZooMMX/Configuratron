package phesus.configuratron.model;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Octavio
 * Date: 23/08/12
 * Time: 05:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class XMLConfigReader {

    private Configuration config;
    private Document doc;

    public XMLConfigReader(Configuration config) {
        this.config = config;
    }

    public void read()
            throws ParserConfigurationException, SAXException,
            IOException, XPathExpressionException {

        DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
        domFactory.setNamespaceAware(true);
        DocumentBuilder builder = domFactory.newDocumentBuilder();
        doc = builder.parse("config.xml");

        config.setUrlNadesico((String) readProperty("//URLServidor/text()", XPathConstants.STRING));

    }

    private Object readProperty(String xPathString, QName tipo) throws XPathExpressionException {

        XPathFactory factory = XPathFactory.newInstance();
        XPath xpath = factory.newXPath();
        XPathExpression expr = xpath.compile(xPathString);

        Object result = expr.evaluate(doc, XPathConstants.STRING);
        return result;
    }
}
