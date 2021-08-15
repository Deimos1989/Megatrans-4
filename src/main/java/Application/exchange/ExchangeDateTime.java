package Application.exchange;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class ExchangeDateTime {


   private static Timestamp timestampStatic = new Timestamp(System.currentTimeMillis());
   private  Timestamp timestampDinamic = new Timestamp(System.currentTimeMillis());

        private static LocalDate localDateStatic=LocalDate.now();
        private static LocalTime localTimeStatic=LocalTime.now().withNano(0);
        private static LocalDateTime localDateTimeStatic=LocalDateTime.now().withNano(0);

         private LocalDate localDateDinamic=LocalDate.now();
         private LocalTime localTimeDinamic=LocalTime.now().withNano(0);
         private LocalDateTime localDateTimeDinamic=LocalDateTime.now().withNano(0);

    private static String hashStatic = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss.SSS").format(new java.util.Date());
    private String hashDinamic = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss.SSS").format(new java.util.Date());




    public String getHashDinamic() {
        return hashDinamic;
    }

    public void setHashDinamic(String hashDinamic) {
        this.hashDinamic = hashDinamic;
    }

    public String getHashStatic() {
        return hashStatic;
    }

    public void setHashStatic(String hashStatic) {
        ExchangeDateTime.hashStatic = hashStatic;
    }

    public Timestamp getTimestampStatic() {
        return timestampStatic;
    }

    public void setTimestampStatic(Timestamp timestampStatic) {
        ExchangeDateTime.timestampStatic = timestampStatic;
    }

    public Timestamp getTimestampDinamic() {
        return timestampDinamic;
    }

    public void setTimestampDinamic(Timestamp timestampDinamic) {
        this.timestampDinamic = timestampDinamic;
    }

    public  LocalDate getLocalDateStatic() {
        return localDateStatic;
    }

    public  void setLocalDateStatic(LocalDate localDateStatic) {
        ExchangeDateTime.localDateStatic = localDateStatic;
    }

    public  LocalTime getLocalTimeStatic() {
        return localTimeStatic;
    }

    public  void setLocalTimeStatic(LocalTime localTimeStatic) {
        ExchangeDateTime.localTimeStatic = localTimeStatic;
    }

    public  LocalDateTime getLocalDateTimeStatic() {
        return localDateTimeStatic;
    }

    public  void setLocalDateTimeStatic(LocalDateTime localDateTimeStatic) {
        ExchangeDateTime.localDateTimeStatic = localDateTimeStatic;
    }

    public LocalDate getLocalDateDinamic() {
        return localDateDinamic;
    }

    public void setLocalDateDinamic(LocalDate localDateDinamic) {
        this.localDateDinamic = localDateDinamic;
    }

    public LocalTime getLocalTimeDinamic() {
        return localTimeDinamic;
    }

    public void setLocalTimeDinamic(LocalTime localTimeDinamic) {
        this.localTimeDinamic = localTimeDinamic;
    }

    public LocalDateTime getLocalDateTimeDinamic() {
        return localDateTimeDinamic;
    }

    public void setLocalDateTimeDinamic(LocalDateTime localDateTimeDinamic) {
        this.localDateTimeDinamic = localDateTimeDinamic;
    }
}
