package labs.ai.eddi.example;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.swagger.client.ApiException;
import io.swagger.client.api.BotEngineApi;

@WebServlet("/main")
public class MainServlet extends HttpServlet {

	private final BotEngineApi api = new BotEngineApi();
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
/*
 
  host:http://localhost:7070




bot_id:5b14685f06f6be10c0a3575f
conversation_id:5b14686b06f6be10c0a35761
  
 */
		res.getWriter().println("eddi");
		String environment = "unrestricted";
		String botId = "5b14685f06f6be10c0a3575f";
		String conversationId = "5b14686b06f6be10c0a35761";
		Boolean returnDetailed = false;
		Boolean returnCurrentStepOnly = true;
		String body = null;
		try {
			api.say(environment, botId, conversationId, returnDetailed, returnCurrentStepOnly, body);
		} catch (ApiException e) {
		
			e.printStackTrace();
		}

	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	}

}
