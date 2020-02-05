package Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;


public class ServiceDateTime {


   private static Timestamp timestampStatic = new Timestamp(System.currentTimeMillis());
    private  Timestamp timestampDinamic = new Timestamp(System.currentTimeMillis());

    String hashDinamic = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss.SSS").format(new java.util.Date());
    String dateTimeDinamic = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new java.util.Date());

    private static String hashStatic = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss.SSS").format(new java.util.Date());
    private static String dateTimeStatic = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new java.util.Date());


    public String getHashDinamic() {
        return hashDinamic;
    }

    public void setHashDinamic(String hashDinamic) {
        this.hashDinamic = hashDinamic;
    }

    public String getDateTimeDinamic() {
        return dateTimeDinamic;
    }

    public void setDateTimeDinamic(String dateTimeDinamic) {
        this.dateTimeDinamic = dateTimeDinamic;
    }

    public String getHashStatic() {
        return hashStatic;
    }

    public void setHashStatic(String hashStatic) {
        ServiceDateTime.hashStatic = hashStatic;
    }



    public String getDateTimeStatic() {
        return dateTimeStatic;
    }

    public void setDateTimeStatic(String dateTimeStatic) {
        ServiceDateTime.dateTimeStatic = dateTimeStatic;
    }

    public Timestamp getTimestampStatic() {
        return timestampStatic;
    }

    public void setTimestampStatic(Timestamp timestampStatic) {
        ServiceDateTime.timestampStatic = timestampStatic;
    }

    public Timestamp getTimestampDinamic() {
        return timestampDinamic;
    }

    public void setTimestampDinamic(Timestamp timestampDinamic) {
        this.timestampDinamic = timestampDinamic;
    }
}
