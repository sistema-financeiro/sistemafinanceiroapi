package br.com.sistemafinanceiroapi.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.sistemafinanceiroapi.utility.DateUtility;

@Service
public class GerenciadorDemandaService {
	
	private static final String IDENTIFICADOR_INICIAL = "SISTEMAFINANCEIRO";
	private static final String IDENTIFICADOR_FINAL = "FEATURE";
	
	/**
	 * Os identificadores devem ser gerados com a seguinte regra: {SISTEMAFINANCEIRO-<HHMMSS-DIA_SEMANA-ANO-MES-DIA>FEATURE}
	 */
	public String gerarIdentificadorDemanda() {
		StringBuilder stringBuilder = new StringBuilder(IDENTIFICADOR_INICIAL)
			.append(DateUtility.retornarHoraMinutoSegundo(new Date(), DateUtility.HORA_MINUTO_SEGUNDO_SEM_FORMATACAO))
			.append(DateUtility.recuperarDiaSemana(new Date()))
			.append(DateUtility.recuperarAno(new Date()))
			.append(DateUtility.recuperarMes(new Date()))
			.append(DateUtility.recuperarDia(new Date()))
			.append(IDENTIFICADOR_FINAL);
		return stringBuilder.toString();
	}

}
