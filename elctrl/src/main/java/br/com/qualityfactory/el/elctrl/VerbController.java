package br.com.qualityfactory.el.elctrl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.com.qualityfactory.el.elmd.model.VerbModel;

@Controller
public class VerbController {
	
	@Inject
	private Result result;
	
	@Path("/buscar")
	public String listAll() {
		List<VerbModel> verbs = new ArrayList<>();
		
		VerbModel verbModel = new VerbModel();
		verbModel.setId((short) 1);
		verbModel.setCode("10");
		
		verbs.add(verbModel);
		
		String jsonResult = verbs.toString();
		
		result.use(Results.json()).from(jsonResult).serialize();
		
		return jsonResult;
	}
}
