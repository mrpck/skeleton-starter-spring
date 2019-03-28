/***
#CLBsap
http://clbsap-1389-dev-team-1.apps.ocp-gc.snamretegas.priv/CLBsap/jarvis/hello
http://clbsap-1389-dev-team-1.apps.ocp-gc.snamretegas.priv/CLBsap/clbsap/init
http://clbsap-1389-dev-team-1.apps.ocp-gc.snamretegas.priv/CLBsap/clbsap/view?social_reason=&start=0&limit=30 

http://clbsap-1389-dev.apps.ocp-gc.snamretegas.priv/CLBsap
http://clbsap-1389-test.apps.ocp-gc.snamretegas.priv/CLBsap
http://clbsap-1389-preprod.apps.ocp-gc.snamretegas.priv/CLBsap

#FRONT-END
http://portal-1389-dev.apps.ocp-gc.snamretegas.priv/#/tradingThor
http://portal-1389-test.apps.ocp-gc.snamretegas.priv/#/tradingThor
http://portal-1389-preprod.apps.ocp-gc.snamretegas.priv/#/tradingThor
*/
package com.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController // This means that this class is a RestController
public class MainController {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@GetMapping(path = "/")
	public @ResponseBody ObjectNode index() {
		// Log
		log.info(Thread.currentThread().getStackTrace()[1].getMethodName());

		ObjectMapper mapper = new ObjectMapper();
		ObjectNode objectNode1 = mapper.createObjectNode();
		objectNode1.put("message", "Greetings from Spring Boot!");
		return objectNode1;
	}
}