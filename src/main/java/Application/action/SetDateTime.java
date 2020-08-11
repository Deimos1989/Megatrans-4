package Application.action;

import Application.Entity.DateTime;
import Application.exchange.ExchangeDateTime;
import Application.service.DateTimeServiceInterfaceImplement;

public class SetDateTime implements Runnable {

private DateTimeServiceInterfaceImplement dateTimeServiceInterfaceImplement;

public SetDateTime(DateTimeServiceInterfaceImplement dateTimeServiceInterfaceImplement){
    this.dateTimeServiceInterfaceImplement=dateTimeServiceInterfaceImplement;
}

    public void run()

    {
        DateTime dateTime = new DateTime();
        ExchangeDateTime exchangeDateTime = new ExchangeDateTime();

      //  dateTime.setHash(exchangeDateTime.getHashStatic());
        dateTime.setTimestamp(exchangeDateTime.getTimestampStatic());

        dateTime.setLocalDate(exchangeDateTime.getLocalDateStatic());
        dateTime.setLocalTime(exchangeDateTime.getLocalTimeStatic());
        dateTime.setLocalDateTime(exchangeDateTime.getLocalDateTimeStatic());

        dateTimeServiceInterfaceImplement.save(dateTime);


        exchangeDateTime.setHashStatic(exchangeDateTime.getHashDinamic());
        exchangeDateTime.setTimestampStatic(exchangeDateTime.getTimestampDinamic());

        exchangeDateTime.setLocalDateStatic(exchangeDateTime.getLocalDateDinamic());
        exchangeDateTime.setLocalTimeStatic(exchangeDateTime.getLocalTimeDinamic());
        exchangeDateTime.setLocalDateTimeStatic(exchangeDateTime.getLocalDateTimeDinamic());


    }

}