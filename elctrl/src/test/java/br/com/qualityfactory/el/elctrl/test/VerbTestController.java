package br.com.qualityfactory.el.elctrl.test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.com.caelum.vraptor.Consumes;
import br.com.qualityfactory.el.elctrl.VerbController;

public class VerbTestController {

	@Mock
	private VerbController controller;
	
	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Consumes("application/json")
	@Test
	public void getAllVerbs() throws Exception{
		//Mockito.when(controller.listAll()).thenReturn("algumacoisa");
	}
}
