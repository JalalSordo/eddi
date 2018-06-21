package labs.ai.eddi.example;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.squareup.okhttp.Call;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.JSON;
import io.swagger.client.api.BotAdministrationApi;
import io.swagger.client.api.BotEngineApi;
import io.swagger.client.model.ConversationMemorySnapshot;
import io.swagger.client.model.InputData;
import io.swagger.client.model.SimpleConversationMemorySnapshot;

@WebServlet("/main")
public class MainServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ApiClient appClient = new ApiClient().setBasePath("http://localhost:7070");
		String[] contentTypes= {"application/json"};
		appClient.selectHeaderContentType(contentTypes);
		 
		String environment = "unrestricted";
		String botId = "5b14685f06f6be10c0a3575f";
		String conversationId = "5b14686b06f6be10c0a35761";
		Boolean returnDetailed = true;
		Boolean returnCurrentStepOnly = true;
		

		
	
		
		BotEngineApi api = new BotEngineApi(appClient);
		
		
		String k="Hey";
	
		
		System.out.println(k);
		try {
			 api.say(environment, botId, conversationId, returnDetailed,
				returnCurrentStepOnly, k);
			 SimpleConversationMemorySnapshot conv=	api.readConversation(environment, botId, conversationId, returnDetailed);
			System.out.println(conv.getBotId());

		} catch (ApiException e) {

			e.printStackTrace();
		}

	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	}

}
