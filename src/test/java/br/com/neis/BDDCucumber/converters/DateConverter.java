package br.com.neis.BDDCucumber.converters;

import cucumber.api.Transformer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter extends Transformer<Date> {


    @Override
    public Date transform(String arg0) {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date retorno = format.parse(arg0);

            return retorno;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
