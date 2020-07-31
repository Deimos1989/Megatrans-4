package Application.processing;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DslStatisticsNode{

    public void setTable(String table) {
        this.table = table;
    }

    private String table;



    private Pattern pattern1 = Pattern.compile("(Errored\\sblocks)\\s(\\d*)\\s(\\d*)");
    private Pattern pattern2 = Pattern.compile("(Errored\\sseconds)\\s(\\d*)\\s(\\d*)");
    private Pattern pattern3 = Pattern.compile("(Severely\\serrored\\sseconds)\\s(\\d*)\\s(\\d*)");
    private Pattern pattern4 = Pattern.compile("(Background\\sblock\\serrors)\\s(\\d*)\\s(\\d*)");
    private Pattern pattern5 = Pattern.compile("(ESR\\s\\W*)\\s(\\d*.\\d*)\\s(\\d*.\\d*)");
    private Pattern pattern6 = Pattern.compile("(SESR\\s\\W*)\\s(\\d*.\\d*)\\s(\\d*.\\d*)");
    private Pattern pattern7 = Pattern.compile("(BBER\\s\\W*)\\s(\\d*.\\d*)\\s(\\d*.\\d*)");
    private Pattern pattern8 = Pattern.compile("(Available\\stime)\\s(\\d*)\\s(\\d*)");
    private Pattern pattern9 = Pattern.compile("(Unavailable\\stime)\\s(\\d*)\\s(\\d*)");





    public String erroredBlocksName(String name) {
        Matcher matcher1 = pattern1.matcher(table);
        while (matcher1.find()) {
               name = (table.substring(matcher1.start(1), matcher1.end(1)));
        }
        return name;
    }


    public Long erroredBlocksValueSide1(Long value) {
        Matcher matcher = pattern1.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(2), matcher.end(2));
            value = Long.parseLong(value1);
        }
        return value;
    }

    public Long erroredBlocksValueSide2(Long value) {
        Matcher matcher = pattern1.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(3), matcher.end(3));
            value = Long.parseLong(value1);
        }
        return value;
    }




    public String erroredSecondsName(String name) {
        Matcher matcher1 = pattern2.matcher(table);
        while (matcher1.find()) {
            name = (table.substring(matcher1.start(1), matcher1.end(1)));
        }
        return name;
    }

    public Long erroredSecondValueSide1(Long value) {
        Matcher matcher = pattern2.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(2), matcher.end(2));
            value = Long.parseLong(value1);
        }
        return value;
    }

    public Long erroredSecondValueSide2(Long value) {
        Matcher matcher = pattern2.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(3), matcher.end(3));
            value = Long.parseLong(value1);
        }
        return value;
    }



    public String severelyErroredSecondsName(String name) {
        Matcher matcher1 = pattern3.matcher(table);
        while (matcher1.find()) {
            name = (table.substring(matcher1.start(1), matcher1.end(1)));
        }
        return name;
    }


    public Long severelyErroredSecondsValueSide1(Long value) {

        Matcher matcher = pattern3.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(2), matcher.end(2));
            value = Long.parseLong(value1);
        }
        return value;
    }

    public Long severelyErroredSecondsValueSide2(Long value) {
        Matcher matcher = pattern3.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(3), matcher.end(3));
            value = Long.parseLong(value1);
        }
        return value;
    }




    public String backgroundBlockErrorsName(String name) {
        Matcher matcher1 = pattern4.matcher(table);
        while (matcher1.find()) {
            name = (table.substring(matcher1.start(1), matcher1.end(1)));
        }
        return name;
    }


    public Long backgroundBlockErrorsValueSide1(Long value) {
        Matcher matcher = pattern4.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(2), matcher.end(2));
            value = Long.parseLong(value1);
        }
        return value;
    }

    public Long backgroundBlockErrorsValueSide2(Long value) {
        Matcher matcher = pattern4.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(3), matcher.end(3));
            value = Long.parseLong(value1);
        }
        return value;
    }




    public String esrName(String name) {
        Matcher matcher1 = pattern5.matcher(table);
        while (matcher1.find()) {
            name = (table.substring(matcher1.start(1), matcher1.end(1)));
        }
        return name;
    }


    public Double esrValueSide1(Double value) {
        Matcher matcher = pattern5.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(2), matcher.end(2));
            value = Double.parseDouble(value1);

        }


        return value;
    }

    public Double esrValueSide2(Double value) {
        Matcher matcher = pattern5.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(3), matcher.end(3));
            value = Double.parseDouble(value1);
        }
        return value;
    }


    public String sersName(String name) {
        Matcher matcher1 = pattern6.matcher(table);
        while (matcher1.find()) {
            name = (table.substring(matcher1.start(1), matcher1.end(1)));
        }
        return name;
    }


    public Double sersValueSide1(Double value) {
        Matcher matcher = pattern6.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(2), matcher.end(2));
            value = Double.parseDouble(value1);
        }
        return value;
    }

    public Double sersValueSide2(Double value) {
        Matcher matcher = pattern6.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(3), matcher.end(3));
            value = Double.parseDouble(value1);
        }
        return value;
    }


    public String bberName(String name) {
        Matcher matcher1 = pattern7.matcher(table);
        while (matcher1.find()) {
            name = (table.substring(matcher1.start(1), matcher1.end(1)));
        }
        return name;
    }


    public Double bberValueSide1(Double value) {
        Matcher matcher = pattern7.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(2), matcher.end(2));
            value = Double.parseDouble(value1);
        }
        return value;
    }

    public Double bberValueSide2(Double value) {
        Matcher matcher = pattern7.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(3), matcher.end(3));
            value = Double.parseDouble(value1);
        }
        return value;
    }


    public String availableTimeName(String name) {
        Matcher matcher1 = pattern8.matcher(table);
        while (matcher1.find()) {
            name = (table.substring(matcher1.start(1), matcher1.end(1)));
        }
        return name;
    }


    public Long availableTimeValueSide1(Long value) {
        Matcher matcher = pattern8.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(2), matcher.end(2));
            value = Long.parseLong(value1);
        }

        return value;
    }

    public Long availableTimeValueSide2(Long value) {
        Matcher matcher = pattern8.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(2), matcher.end(2));
            value = Long.parseLong(value1);
        }

        return value;
    }


    public String unavailableTimeName(String name) {
        Matcher matcher1 = pattern9.matcher(table);
        while (matcher1.find()) {
            name = (table.substring(matcher1.start(1), matcher1.end(1)));
        }
        return name;
    }

    public Long unavailableTimeValueSide1(Long value) {
        Matcher matcher = pattern9.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(2), matcher.end(2));
            value = Long.parseLong(value1);
        }
        return value;
    }


    public Long unavailableTimeValueSide2(Long value) {
        Matcher matcher = pattern9.matcher(table);
        while (matcher.find()) {
            String value1 = table.substring(matcher.start(3), matcher.end(3));
            value = Long.parseLong(value1);
        }
        return value;
    }

}
