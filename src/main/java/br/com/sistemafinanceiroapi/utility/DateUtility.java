package br.com.sistemafinanceiroapi.utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtility {
	
	public static final String HORA_MINUTO_SEGUNDO_SEM_FORMATACAO = "HHmmss";
	
	public static String retornarHoraMinutoSegundo(Date dataReferencia, String formatoReferencia) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatoReferencia);
		return simpleDateFormat.format(dataReferencia);
	}
	
	public static String recuperarDiaSemana(Date dataReferencia) {
		Integer diaSemana = 0;
		Calendar calendar = Calendar.getInstance();
			calendar.setTime(dataReferencia);
			diaSemana = calendar.get(Calendar.DAY_OF_WEEK);
		return diaSemana <= 9 ? "0" + diaSemana : diaSemana.toString();
	}
	
	public static int recuperarAno(Date dataReferencia) {
		Calendar calendar = Calendar.getInstance();
			calendar.setTime(dataReferencia);
		return calendar.get(Calendar.YEAR);
	}
	
	public static String recuperarMes(Date dataReferencia) {
		Integer mes = 0;
		Calendar calendar = Calendar.getInstance();
			calendar.setTime(dataReferencia);
			mes = calendar.get(Calendar.MONTH) + 1;
		return mes <= 9 ? "0" + mes : mes.toString();
	}
	
	public static String recuperarDia(Date dataReferencia) {
		Integer dia = 0;
		Calendar calendar = Calendar.getInstance();
			calendar.setTime(dataReferencia);
			dia = calendar.get(Calendar.DAY_OF_MONTH);
		return dia <= 9 ? "0" + dia : dia.toString();
	}

}
