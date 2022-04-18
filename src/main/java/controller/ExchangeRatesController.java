package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExchangeRatesController {
	
	@RequestMapping("exchangerates")
	public String ExchangeRates() {
		return "Web.html";
	}
	
}
