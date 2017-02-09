package hu.suprasoft.dom;

/**
 * @author VarGabor
 *
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Main {

	private static final String FILE_NAME = "person.xml";

	private static final DocumentBuilderFactory DBF = DocumentBuilderFactory.newInstance();
	private static final TransformerFactory TF = TransformerFactory.newInstance();

	public static void main(String[] args) throws Exception {
		Node root = getRootNode();
		changeNodeValue(root, "nationality", "Hungarian");
		// Print to console
		serializeNode(root, System.out);
		// Print to file
		serializeNode(root, new FileOutputStream(FILE_NAME));
	}

	private static Node getRootNode() throws Exception {
		DocumentBuilder db = DBF.newDocumentBuilder();
		Document d = db.parse(new File(FILE_NAME));
		return d.getFirstChild();
	}

	private static void changeNodeValue(Node root, String name, String value) {
		NodeList nodes = root.getChildNodes();
		for (int i = 0; i < nodes.getLength(); i++) {
			Node node = nodes.item(i);
			if (name.equals(node.getNodeName())) {
				node.setNodeValue(value);
			}
		}
	}

	private static void serializeNode(Node node, OutputStream out) throws Exception {
		Transformer t = TF.newTransformer();
		t.setOutputProperty("omit-xml-declaration", "yes");
		t.transform(new DOMSource(node), new StreamResult(out));
	}
}
