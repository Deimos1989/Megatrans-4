package Application.processing;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class DslStatusNode {


    private String table;
    public void setTable(String table) {
        this.table = table;
    }


    private    Pattern pattern1 = Pattern.compile("(I/F\\smode)\\s(\\w*)");
    private    Pattern pattern2 = Pattern.compile("(SYNC)\\s(\\d*)\\s(\\d*)");
    private    Pattern pattern3 = Pattern.compile("(SEGD)\\s(\\d*)\\s(\\d*)");
    private    Pattern pattern4 = Pattern.compile("(Tx\\spower)\\s(\\d*\\W\\d*)\\s(\\d*\\W\\d*)\\s(\\w*)");
    private    Pattern pattern5 = Pattern.compile("(Rx\\spower)\\s(\\d*\\W\\d*)\\s(\\d*\\W\\d*)\\s(\\w*)");
    private    Pattern pattern6 = Pattern.compile("(Power\\sbackoff)\\s(\\d*\\W\\d*)\\s(\\w*)");
    private    Pattern pattern7 = Pattern.compile("(Far\\send\\spower\\sbackoff)\\s(\\d*.\\d*)\\s(\\w*)");
    private    Pattern pattern8 = Pattern.compile("(Loop\\sattenuation)\\s(\\d*.\\d*)\\s(\\d*.\\d*)");
    private    Pattern pattern9 = Pattern.compile("(NMR)\\s(\\d*.\\d*)\\s(\\d*.\\d*)");
    private    Pattern pattern10 = Pattern.compile("(Bitrate)\\s(\\d*)\\s(\\d*)");
    private    Pattern pattern11 = Pattern.compile("(SRU)\\s(\\d*)");
    private    Pattern pattern12 = Pattern.compile("(Active\\ssync.\\ssource)\\s(\\w*\\d*\\W*\\d*)\\s(\\w*\\d*\\W*\\d*)");
    private    Pattern pattern13 = Pattern.compile("(RP\\svoltage)\\s(\\d*)\\s(\\d*)\\s(\\w*)");
    private    Pattern pattern14 = Pattern.compile("(RP\\sstatus)\\s(\\w*)");
    private    Pattern pattern15 = Pattern.compile("(Temperature)\\s(\\d*\\W\\d*)\\s(=B0C)");
    private    Pattern pattern16 = Pattern.compile("(BERT)\\s(\\w*)");
    private    Pattern pattern17 = Pattern.compile("(http://)(\\d*\\W\\d*\\W\\d*\\W\\d*)");






    public String nameNode(String name) {
        Matcher matcher1 = pattern17.matcher(name);
        while (matcher1.find()) {
            name = (name.substring(matcher1.start(2), matcher1.end(2)));
        }
        return name;
    }


    public String modeName(String name) {
        Matcher matcher1 = pattern1.matcher(table);
        while (matcher1.find()) {
            name = (table.substring(matcher1.start(1), matcher1.end(1)));
        }
        return name;
    }


    public String modeValue(String value) {
        Matcher matcher1 = pattern1.matcher(table);
        while (matcher1.find()) {
            value = (table.substring(matcher1.start(2), matcher1.end(2)));
        }
        return value;
    }



    public String syncName(String name) {
        Matcher matcher = pattern2.matcher(table);
        while (matcher.find()) {
            name = table.substring(matcher.start(1), matcher.end(1));
        }
        return name;
    }


    public Integer syncValueSide1(Integer value) {
        Matcher matcher = pattern2.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(2), matcher.end(2));
            value = Integer.parseInt(value1);
        }
        return value;
    }

    public Integer syncValueSide2(Integer value) {
        Matcher matcher = pattern2.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(3), matcher.end(3));
            value = Integer.parseInt(value1);
        }
        return value;
    }




    public String segdName(String name) {
        Matcher matcher = pattern3.matcher(table);
        while (matcher.find()) {
            name = (table.substring(matcher.start(1), matcher.end(1)));
        }
        return name;
    }


    public Integer segdValueSide1(Integer value) {
        Matcher matcher = pattern3.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(2), matcher.end(2));
            value = Integer.parseInt(value1);
        }
        return value;
    }

    public Integer segdValueSide2(Integer value) {
        Matcher matcher = pattern3.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(3), matcher.end(3));
            value = Integer.parseInt(value1);
        }
        return value;
    }






    public String txPowerName(String name) {
        Matcher matcher = pattern4.matcher(table);
        while (matcher.find()) {
            name = (table.substring(matcher.start(1), matcher.end(1)));
        }

        return name;
    }

    public Double txPowerValueSide1(Double value) {
        Matcher matcher = pattern4.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(2), matcher.end(2));
            value = Double.parseDouble(value1);
        }

        return value;
    }

    public Double txPowerValueSide2(Double value) {
        Matcher matcher = pattern4.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(3), matcher.end(3));
            value = Double.parseDouble(value1);
        }
        return value;
    }


    public String txPowerParametr(String parametr) {
        Matcher matcher = pattern4.matcher(table);
        while (matcher.find()) {
            parametr = (table.substring(matcher.start(4), matcher.end(4)));
        }
        return parametr;
    }





    public String rxPowerName(String name) {
        Matcher matcher = pattern5.matcher(table);
        while (matcher.find()) {
            name = (table.substring(matcher.start(1), matcher.end(1)));
        }
        return name;
    }


    public Double rxPowerValueSide1(Double value) {
        Matcher matcher = pattern5.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(2), matcher.end(2));
            value = Double.parseDouble(value1);
        }
        return value;
    }

    public Double rxPowerValueSide2(Double value) {
        Matcher matcher = pattern5.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(3), matcher.end(3));
            value = Double.parseDouble(value1);
        }
        return value;
    }

    public String rxPowerParametr(String parametr) {
        Matcher matcher = pattern5.matcher(table);
        while (matcher.find()) {
            parametr = (table.substring(matcher.start(4), matcher.end(4)));
        }
        return parametr;
    }



    public String powerBackOffName(String name) {
        Matcher matcher = pattern6.matcher(table);
        while (matcher.find()) {
            name = (table.substring(matcher.start(1), matcher.end(1)));
        }
        return name;
    }




    public Double powerBackOffValue(Double value) {
        Matcher matcher = pattern6.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(2), matcher.end(2));
            value = Double.parseDouble(value1);
        }
        return value;
    }


    public String powerBackOffParametr(String parametr) {
        Matcher matcher = pattern6.matcher(table);
        while (matcher.find()) {
            parametr = (table.substring(matcher.start(3), matcher.end(3)));
        }
        return parametr;
}



    public String farEndPowerBackOffName(String name) {
        Matcher matcher = pattern7.matcher(table);
        while (matcher.find()) {
            name = (table.substring(matcher.start(1), matcher.end(1)));
        }
        return name;
    }


    public Double farEndPowerBackOffValue(Double value) {
        Matcher matcher = pattern7.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(2), matcher.end(2));
            value = Double.parseDouble(value1);
        }
        return value;
    }


    public String farEndPowerBackOffParametr(String parametr) {
        Matcher matcher = pattern7.matcher(table);
        while (matcher.find()) {
            parametr = (table.substring(matcher.start(3), matcher.end(3)));
        }
        return parametr;
    }






    public String loopAttenuationName(String name) {
        Matcher matcher = pattern8.matcher(table);
        while (matcher.find()) {
            name = (table.substring(matcher.start(1), matcher.end(1)));
        }
        return name;
    }


    public Double loopAttenuationValueSide1(Double value) {
        Matcher matcher = pattern8.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(2), matcher.end(2));
            value = Double.parseDouble(value1);
        }
        return value;
    }

    public Double loopAttenuationValueSide2(Double value) {
        Matcher matcher = pattern8.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(3), matcher.end(3));
            value = Double.parseDouble(value1);
        }
        return value;
    }




    public String nmrName(String name) {
        Matcher matcher = pattern9.matcher(table);
        while (matcher.find()) {
            name = (table.substring(matcher.start(1), matcher.end(1)));
        }
        return name;
    }


    public Double nmrValueSide1(Double value) {
        Matcher matcher = pattern9.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(2), matcher.end(2));
            value = Double.parseDouble(value1);
        }
        return value;
    }

    public Double nmrValueSide2(Double value) {
        Matcher matcher = pattern9.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(3), matcher.end(3));
            value = Double.parseDouble(value1);
        }
        return value;
    }




    public String bitrateName(String name) {
        Matcher matcher = pattern10.matcher(table);
        while (matcher.find()) {
            name = (table.substring(matcher.start(1), matcher.end(1)));
        }
        return name;
    }


    public Integer bitrateValueSide1(Integer value) {
        Matcher matcher = pattern10.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(2), matcher.end(2));
            value = Integer.parseInt(value1);
        }
        return value;
    }

    public Integer bitrateValueSide2(Integer value) {
        Matcher matcher = pattern10.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(3), matcher.end(3));
            value = Integer.parseInt(value1);
        }
        return value;
    }




    public String sruName(String name) {
        Matcher matcher = pattern11.matcher(table);
        while (matcher.find()) {
            name = (table.substring(matcher.start(1), matcher.end(1)));
        }
        return name;
    }


    public Integer sruValue(Integer value) {
        Matcher matcher = pattern11.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(2), matcher.end(2));
            value = Integer.parseInt(value1);
        }
        return value;
    }


    public String activeSyncSourceName(String name) {
        Matcher matcher = pattern12.matcher(table);
        while (matcher.find()) {
            name = (table.substring(matcher.start(1), matcher.end(1)));
        }

        return name;
    }


    public String activeSyncSourceValueSide1(String value) {
            Matcher matcher = pattern12.matcher(table);
            while (matcher.find()) {
                value = (table.substring(matcher.start(2), matcher.end(2)));
            }

            return value;
        }

    public String activeSyncSourceValueSide2(String value) {
        Matcher matcher = pattern12.matcher(table);
        while (matcher.find()) {
            value = (table.substring(matcher.start(3), matcher.end(3)));
        }

        return value;
    }



    public String rpVoltageName(String name) {
        Matcher matcher = pattern13.matcher(table);
        while (matcher.find()) {
            name = (table.substring(matcher.start(1), matcher.end(1)));
        }
        return name;
    }


    public Integer rpVoltageValueSide1(Integer value) {
        Matcher matcher = pattern13.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(2), matcher.end(2));
            value = Integer.parseInt(value1);
        }
        return value;
    }

    public Integer rpVoltageValueSide2(Integer value) {
        Matcher matcher = pattern13.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(3), matcher.end(3));
            value = Integer.parseInt(value1);
        }
        return value;
    }

    public String rpVoltageParametr(String parametr) {
        Matcher matcher = pattern13.matcher(table);
        while (matcher.find()) {
            parametr = (table.substring(matcher.start(4), matcher.end(4)));
        }
        return parametr;
    }



    public String rpStatusName(String name) {
        Matcher matcher1 = pattern14.matcher(table);
        while (matcher1.find()) {
            name = (table.substring(matcher1.start(1), matcher1.end(1)));
        }
        return name;
    }

    public String rpStatusValue(String value) {
        Matcher matcher1 = pattern14.matcher(table);
        while (matcher1.find()) {
            value = (table.substring(matcher1.start(2), matcher1.end(2)));
        }
        return value;
    }


    public String temperatureName(String name) {
        Matcher matcher = pattern15.matcher(table);
        while (matcher.find()) {
            name = (table.substring(matcher.start(1), matcher.end(1)));
        }
        return name;
    }


    public Double temperatureValue(Double value) {
        Matcher matcher = pattern15.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(2), matcher.end(2));
            value = Double.parseDouble(value1);
        }
        return value;
    }


    public String temperatureParametr(String parametr) {
        Matcher matcher = pattern15.matcher(table);
        while (matcher.find()) {
            parametr = (table.substring(matcher.start(3), matcher.end(3)).substring(3));
        }
        return parametr;
    }


    public String bertName(String name) {
        Matcher matcher = pattern16.matcher(table);
        while (matcher.find()) {
            name = (table.substring(matcher.start(1), matcher.end(1)));
        }
        return name;
    }


    public String bertValue(String value) {
        Matcher matcher = pattern16.matcher(table);
        while (matcher.find()) {
            value = (table.substring(matcher.start(2), matcher.end(2)));
        }
        return value;
    }



}
