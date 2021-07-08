package json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;
// import jdk.internal.org.xml.sax.SAXException;

import modelo.Deputado;

public class ProcessaDOM {

	public static void main(String[] args) {

		List<Deputado> deps = new ArrayList<Deputado>();

		try {
			MyHandlerDOM myExempleDOM = new MyHandlerDOM();

			deps = myExempleDOM.fazerParsing("src/main/java/files/deputados.xml");

		} catch (ParserConfigurationException | SAXException | IOException e) {
			StringBuilder msg = new StringBuilder();
			msg.append("Erro:\n");
			msg.append(e.getMessage() + "\n");
			msg.append(e.toString());
			System.out.println(msg);
		}

		for (int i = 0; i < deps.size(); i++)
			System.out.println(deps.get(i).toString());
		
	}

}
