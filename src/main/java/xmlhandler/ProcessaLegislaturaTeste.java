package xmlhandler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import modelo.Legislatura;

public class ProcessaLegislaturaTeste {
	
	public static void main(String[] args) {

		List<Legislatura> legs = new ArrayList<Legislatura>();

		try {

			LegislaturaHandler dom = new LegislaturaHandler();

			legs = dom.fazerParsing("src/main/java/files/legislaturas.xml");

		} catch (ParserConfigurationException | SAXException | IOException e) {
			StringBuilder msg = new StringBuilder();
			msg.append("Erro no main de ProcessaLegislaturaTeste:\n");
			msg.append(e.getMessage() + "\n");
			msg.append(e.toString());
			System.out.println(msg);
		}

		for (int i = 0; i < legs.size(); i++)
			System.out.println(legs.get(i).toString());

	}
}
