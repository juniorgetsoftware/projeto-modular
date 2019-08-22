package appweb;

import javax.faces.bean.ManagedBean;

import fluxoavaliacao.FluxoAvaliacao;
import seguranca.Seguranca;

@ManagedBean
public class Controlador {

	public String moduloSeguranca() {
		return Seguranca.MENSAGEM;
	}

	public String moduloFluxoAvaliacao() {
		return FluxoAvaliacao.MENSAGEM;
	}
}
