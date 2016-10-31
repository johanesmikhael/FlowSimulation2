package simulation;



import simulation.Simulation;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.w3c.dom.*;
import java.io.IOException;


public class Environment {
	private Simulation simulation;
	private Document dom;
	
	public Environment(Simulation sim){
		this.simulation = sim;
	}
	
	public void setup(){
		
	}
	
	private boolean readXML(String xml){
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try{
			DocumentBuilder db = dbf.newDocumentBuilder();
			dom = db.parse(xml);
			Element docEle = dom.getDocumentElement();
			processFloors(docEle);
			return true;
		} catch (ParserConfigurationException pce){
			System.out.println(pce.getMessage());
		} catch (SAXException se) {
			System.out.println(se.getMessage());
		} catch (IOException ioe){
			System.err.println(ioe.getMessage());
		}
		return false;
	}
	
	private void processFloors(Element data){
		NodeList floorsNodeList = data.getElementsByTagName("floors");
		Element floors = null;
	}
}
